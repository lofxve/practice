package com.itheima.web.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.*;
import com.itheima.service.BannerService;
import com.itheima.service.CommentService;
import com.itheima.service.MemberServise;
import com.itheima.service.MoviesService;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.apache.ibatis.javassist.compiler.ast.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName IndexController
 * @Author lofxve
 * @Date 2021/1/14 9:34
 * @Version 1.0
 */
@Controller
public class IndexController {
    @Autowired
    private MoviesService moviesService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private MemberServise memberServise;

    @ResponseBody
    @RequestMapping("/index/findMoveiesListMap")
    public Map<String, List<Movies>> findMoveiesListMap() {
        return moviesService.findMoveiesListMap();
    }

    @ResponseBody
    @RequestMapping("/index/findMoviesById")
    public Movies findMoviesById(Integer id) {
        return moviesService.findById(id);
    }

    @ResponseBody
    @RequestMapping("/index/findCommentById")
    public List<Comment> findCommentById(Integer id) {
        CommentExample commentExample = new CommentExample();
        commentExample.createCriteria().andMoviesIdEqualTo(id);
        return commentService.selectByExample(commentExample);
    }

    @RequestMapping("/index/saveComment")
    @ResponseBody
    public void saveComment(@RequestBody Comment comment, HttpServletRequest request) {
        // 设置默认值
        comment.setTime(new Date());
        // 评论id
        // TODO: 2021/1/14 以后需要从登陆的session中获取

        Members member = (Members) request.getSession().getAttribute("currentMember");
        if (member != null) {
            comment.setCreatorId(member.getId());
            comment.setCreatorName(member.getUsername());
        } else {
            comment.setCreatorId(0);
            comment.setCreatorName("wzd");
        }
        commentService.save(comment);
    }

    @RequestMapping("/index/login")
    @ResponseBody
    public String login(String name, String password, HttpServletRequest request) {
        Members member = memberServise.login(name, password);
        if (member != null) {
            request.getSession().setAttribute("currentMember", member);
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping("/index/findLoginStatus")
    @ResponseBody
    public Boolean findLoginStatus(HttpServletRequest request) {
        Members currentMember = (Members) request.getSession().getAttribute("currentMember");
        if (currentMember != null) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    @Autowired
    private FreeMarkerConfig freeMarkerConfig;

    @Autowired
    private BannerService bannerService;

    @RequestMapping(value = "/generatorHtml", name = "生成页面静态化")
    @ResponseBody
    public String generatorHtml(HttpSession session) throws Exception {
        // 1.获取FreeMarker配置对象 （已经指定了模板目录和字符集编码）
        Configuration configuration = freeMarkerConfig.getConfiguration();
        // 2.获取模板对象
        Template template = configuration.getTemplate("index.ftl");
        // 3.准备数据
        Map<String, Object> model = new HashMap<>();
        // 轮播图列表
        PageInfo<Banner> pageInfo = bannerService.findByPage(new BannerExample(), 1, 5);
        model.put("bannerList", pageInfo.getList());

        // 影视列表
        Map<String, List<Movies>> moviesMap = moviesService.findMoveiesListMap();
        model.put("moviesMap", moviesMap);

        // 4.指定输出路径
        String outPath = session.getServletContext().getRealPath("/") + "/index.html";
        Writer writer = new OutputStreamWriter(new FileOutputStream(new File(outPath)), "utf-8");

        // 5.合并输出
        template.process(model, writer);

        // 6.释放资源
        writer.close();

        return "生成index.html完毕";
    }
}
package com.itheima.web.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Movies;
import com.itheima.domain.MoviesExample;
import com.itheima.service.MoviesService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName MociesController
 * @Author lofxve
 * @Date 2021/1/13 9:28
 * @Version 1.0
 */
@Controller
public class MoviesController {
    @Autowired
    private MoviesService moviesService;

    @ResponseBody // 直接返回不进行页面跳转
    @RequestMapping("/movies/findList")
    public List<Movies> findList(Integer cid, String keyword
    ) {
        MoviesExample moviesExample = new MoviesExample();
        MoviesExample.Criteria criteria = moviesExample.createCriteria();
        if (cid != null) {
            criteria.andCidEqualTo(cid);
        }
        if (StringUtils.isNotEmpty(keyword)) {
            criteria.andKeywordLike("%" + keyword + "%");
        }

        moviesExample.setOrderByClause("order_no asc");
        return moviesService.findList(moviesExample);
    }

    //带条件列表分页查询
    @RequestMapping("/movies/findByPage")
    @ResponseBody
    public PageInfo<Movies> findByPage(Integer cid, String keyword,
                                       @RequestParam(defaultValue = "1") Integer pageNum,
                                       @RequestParam(defaultValue = "10") Integer pageSize) {
        MoviesExample moviesExample = new MoviesExample();
        MoviesExample.Criteria criteria = moviesExample.createCriteria();
        if (cid != null) {
            criteria.andCidEqualTo(cid);
        }
        if (StringUtils.isNotEmpty(keyword)) {
            criteria.andKeywordLike("%" + keyword + "%");
        }

        moviesExample.setOrderByClause("show_time desc");

        return moviesService.findByPage(moviesExample, pageNum, pageSize);
    }

    @RequestMapping("/movies/save")
    public String save(Movies movies, MultipartFile img) throws IOException {
        // 保存路径
        if (img.getSize() > 0) {
            // 文件重新命名
            String newFileName = UUID.randomUUID().toString() + img.getOriginalFilename();
            // 确定文件的最终路径
            String filepath = "D:\\local\\nginx-1.18.0\\html\\images\\" + newFileName;
            // 文件上传
            img.transferTo(new File(filepath));
            // 访问路径
            String filePath = "http://localhost/images/" + newFileName;
            movies.setPicPath(filePath);
        }
        if (movies.getId() != null) {
            moviesService.update(movies);
        } else {
            // 调用service保存
            moviesService.save(movies);
        }
        // 页面跳转
        return "redirect:/movies_list.html";
    }

    @ResponseBody
    @RequestMapping("/movies/findById")
    public Movies findById(Integer id) {
        return moviesService.findById(id);
    }

    @RequestMapping("/movies/deleteById")
    public String deleteById(Integer id) {
        moviesService.deleteById(id);
        // 页面跳转
        return "redirect:/movies_list.html";
    }

    @RequestMapping("/movies/deleteByIds")
    public String deleteByIds(Integer[] ids) {
        if (ids != null && ids.length > 0) {
            System.out.println(Arrays.toString(ids));
            moviesService.deleteByIds(ids);
        }
        // 页面跳转
        return "redirect:/movies_list.html";
    }
}
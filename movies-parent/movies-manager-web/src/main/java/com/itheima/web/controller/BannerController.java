package com.itheima.web.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Banner;
import com.itheima.domain.BannerExample;
import com.itheima.domain.Movies;
import com.itheima.domain.MoviesExample;
import com.itheima.service.BannerService;
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
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @ResponseBody // 直接返回不进行页面跳转
    @RequestMapping("/banner/findList")
    public List<Banner> findList(String keyword
    ) {
        BannerExample bannerExample = new BannerExample();
        BannerExample.Criteria criteria = bannerExample.createCriteria();
        if (StringUtils.isNotEmpty(keyword)) {
            criteria.andTitleLike("%" + keyword + "%");
        }

        bannerExample.setOrderByClause("show_time desc");
        return bannerService.findList(bannerExample);
    }

    //带条件列表分页查询
    @RequestMapping("/banner/findByPage")
    @ResponseBody
    public PageInfo<Banner> findByPage(String title,
                                       @RequestParam(defaultValue = "1") Integer pageNum,
                                       @RequestParam(defaultValue = "10") Integer pageSize) {
        BannerExample bannerExample = new BannerExample();
        BannerExample.Criteria criteria = bannerExample.createCriteria();
        if (StringUtils.isNotEmpty(title)) {
            criteria.andTitleLike("%" + title + "%");
        }

//        bannerExample.setOrderByClause("show_time desc");

        return bannerService.findByPage(bannerExample, pageNum, pageSize);
    }

    @RequestMapping("/banner/save")
    public String save(Banner banner, MultipartFile img) throws IOException {
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
            banner.setPicPath(filePath);
        }
        if (banner.getId() != null) {
            bannerService.update(banner);
        } else {
            // 调用service保存
            bannerService.save(banner);
        }
        // 页面跳转
        return "redirect:/banner_list.html";
    }

    @ResponseBody
    @RequestMapping("/banner/findById")
    public Banner findById(Integer id) {
        return bannerService.findById(id);
    }

    @RequestMapping("/banner/deleteById")
    public String deleteById(Integer id) {
        bannerService.deleteById(id);
        // 页面跳转
        return "redirect:/banner_list.html";
    }

    @RequestMapping("/banner/deleteByIds")
    public String deleteByIds(Integer[] ids) {
        if (ids != null && ids.length > 0) {
            System.out.println(Arrays.toString(ids));
            bannerService.deleteByIds(ids);
        }
        // 页面跳转
        return "redirect:/banner_list.html";
    }
}
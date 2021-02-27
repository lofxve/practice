package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Banner;
import com.itheima.domain.BannerExample;
import com.itheima.domain.Movies;
import com.itheima.domain.MoviesExample;

import java.util.List;

/**
 * @ClassName BannerServiceImpl
 * @Author lofxve
 * @Date 2021/1/13 9:38
 * @Version 1.0
 */
public interface BannerService {

    List<Banner> findList(BannerExample bannerExample);

    void save(Banner banner);

    Banner findById(Integer id);

    void update(Banner banner);

    void deleteById(Integer id);

    void deleteByIds(Integer[] ids);

    PageInfo<Banner> findByPage(BannerExample bannerExample, Integer pageNum, Integer pageSize);
}

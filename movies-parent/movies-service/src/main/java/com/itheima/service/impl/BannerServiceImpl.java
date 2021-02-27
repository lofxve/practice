package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.dao.BannerDao;
import com.itheima.dao.MoviesDao;
import com.itheima.domain.Banner;
import com.itheima.domain.BannerExample;
import com.itheima.domain.Movies;
import com.itheima.domain.MoviesExample;
import com.itheima.service.BannerService;
import com.itheima.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName BannerServiceImpl
 * @Author lofxve
 * @Date 2021/1/13 9:29
 * @Version 1.0
 */
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerDao BannerDao;

    @Override
    public List<Banner> findList(BannerExample bannerExample) {
        return BannerDao.selectByExample(bannerExample);
    }

    @Override
    public void save(Banner banner) {
        BannerDao.insert(banner);
    }

    @Override
    public Banner findById(Integer id) {
        return BannerDao.selectByPrimaryKey(id);
    }

    @Override
    public void update(Banner banner) {
        BannerDao.updateByPrimaryKeySelective(banner);
    }

    @Override
    public void deleteById(Integer id) {
        BannerDao.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIds(Integer[] ids) {
        for (Integer id : ids) {
            BannerDao.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageInfo<Banner> findByPage(BannerExample bannerExample, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Banner> movies = BannerDao.selectByExample(bannerExample);
        return new PageInfo<Banner>(movies);
    }
}
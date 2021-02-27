package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.dao.CategoryDao;
import com.itheima.dao.MoviesDao;
import com.itheima.domain.Category;
import com.itheima.domain.CategoryExample;
import com.itheima.domain.Movies;
import com.itheima.domain.MoviesExample;
import com.itheima.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName MoviesServiceImpl
 * @Author lofxve
 * @Date 2021/1/13 9:29
 * @Version 1.0
 */
@Service
public class MoviesServiceImpl implements MoviesService {
    @Autowired
    private MoviesDao moviesDao;

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Movies> findList(MoviesExample moviesExample) {
        return moviesDao.selectByExample(moviesExample);
    }

    @Override
    public void save(Movies movies) {
        moviesDao.insert(movies);
    }

    @Override
    public Movies findById(Integer id) {
        return moviesDao.selectByPrimaryKey(id);
    }

    @Override
    public void update(Movies movies) {
        moviesDao.updateByPrimaryKeySelective(movies);
    }

    @Override
    public void deleteById(Integer id) {
        moviesDao.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIds(Integer[] ids) {
        for (Integer id : ids) {
            moviesDao.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageInfo<Movies> findByPage(MoviesExample moviesExample, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Movies> movies = moviesDao.selectByExample(moviesExample);
        return new PageInfo<Movies>(movies);
    }

    /**
     * 查询影视分类列表
     * @return
     */
    @Override
    public Map<String, List<Movies>> findMoveiesListMap() {
        // 保证有序
        Map<String, List<Movies>> map = new LinkedHashMap<>();
        // 查询类型分类
        List<Category> categories = categoryDao.selectByExample(new CategoryExample());
        for (Category category : categories) {
            // 设置分页
            PageHelper.startPage(1,6);
            // 组装查询条件
            MoviesExample moviesExample = new MoviesExample();
            moviesExample.createCriteria().andCidEqualTo(category.getId());
            List<Movies> movies = moviesDao.selectByExample(moviesExample);

            map.put(category.getCategoryName(),movies);
        }
        return map;
    }
}
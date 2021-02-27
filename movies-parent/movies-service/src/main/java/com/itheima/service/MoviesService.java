package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Movies;
import com.itheima.domain.MoviesExample;

import java.util.List;
import java.util.Map;

/**
 * @ClassName MoviesServiceImpl
 * @Author lofxve
 * @Date 2021/1/13 9:38
 * @Version 1.0
 */
public interface MoviesService {

    List<Movies> findList(MoviesExample moviesExample);

    void save(Movies movies);

    Movies findById(Integer id);

    void update(Movies movies);

    void deleteById(Integer id);

    void deleteByIds(Integer[] ids);

    PageInfo<Movies> findByPage(MoviesExample moviesExample, Integer pageNum, Integer pageSize);

    Map<String, List<Movies>> findMoveiesListMap();
}

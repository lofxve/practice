package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Banner;
import com.itheima.domain.BannerExample;
import com.itheima.domain.Comment;
import com.itheima.domain.CommentExample;

import java.util.List;

/**
 * @ClassName BannerServiceImpl
 * @Author lofxve
 * @Date 2021/1/13 9:38
 * @Version 1.0
 */
public interface CommentService {

    List<Comment> selectByExample(CommentExample commentExample);

    void save(Comment comment);
}

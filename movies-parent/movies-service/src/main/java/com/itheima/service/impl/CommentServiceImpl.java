package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.dao.BannerDao;
import com.itheima.dao.CommentDao;
import com.itheima.domain.Banner;
import com.itheima.domain.BannerExample;
import com.itheima.domain.Comment;
import com.itheima.domain.CommentExample;
import com.itheima.service.BannerService;
import com.itheima.service.CommentService;
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
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDao commentDao;
//
//    @Override
//    public List<Banner> findList(BannerExample bannerExample) {
//        return BannerDao.selectByExample(bannerExample);
//    }
//
//    @Override
//    public void save(Banner banner) {
//        BannerDao.insert(banner);
//    }
//
//    @Override
//    public List<Comment> selectByExample(Integer id) {
//        return commentDao.selectByExample(id);
//    }

    @Override
    public List<Comment> selectByExample(CommentExample commentExample) {
        return commentDao.selectByExample(commentExample);
    }

    @Override
    public void save(Comment comment) {
        commentDao.insert(comment);
    }
//
//    @Override
//    public void update(Banner banner) {
//        BannerDao.updateByPrimaryKeySelective(banner);
//    }
//
//    @Override
//    public void deleteById(Integer id) {
//        BannerDao.deleteByPrimaryKey(id);
//    }
//
//    @Override
//    public void deleteByIds(Integer[] ids) {
//        for (Integer id : ids) {
//            BannerDao.deleteByPrimaryKey(id);
//        }
//    }
//
//    @Override
//    public PageInfo<Banner> findByPage(BannerExample bannerExample, Integer pageNum, Integer pageSize) {
//        PageHelper.startPage(pageNum,pageSize);
//        List<Banner> movies = BannerDao.selectByExample(bannerExample);
//        return new PageInfo<Banner>(movies);
//    }
}
package com.lofxve.mapper;

import com.lofxve.domain1.User;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Author lofxve
 * @Date 2021/1/18 18:33
 * @Version 1.0
 */
public interface UserMapper {
    List<User> findAll();
}

package com.itheima.service;

import com.itheima.domain.Members;

/**
 * @ClassName MemberServise
 * @Author lofxve
 * @Date 2021/1/16 8:54
 * @Version 1.0
 */
public interface MemberServise {
    Members login(String name, String password);
}

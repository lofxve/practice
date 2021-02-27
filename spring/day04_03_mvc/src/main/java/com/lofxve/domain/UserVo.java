package com.lofxve.domain;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserVo
 * @Author lofxve
 * @Date 2021/1/9 18:47
 * @Version 1.0
 */
@Data
public class UserVo {
    private List<User> userList;
    private Map<String,String> map;
}
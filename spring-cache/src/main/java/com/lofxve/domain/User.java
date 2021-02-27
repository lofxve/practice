package com.lofxve.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName User
 * @Author lofxve
 * @Date 2021/2/12 12:45
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//必须实现序列化接口
public class User implements Serializable {
    private String username;
    private String password;
}
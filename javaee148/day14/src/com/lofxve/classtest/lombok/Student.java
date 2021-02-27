package com.lofxve.classtest.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Student
 * @Author lofxve
 * @Date 2020/12/31 17:31
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private String sex;
    private String age;
}
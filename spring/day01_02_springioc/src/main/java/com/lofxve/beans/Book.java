package com.lofxve.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName Book
 * @Author lofxve
 * @Date 2021/1/3 22:04
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String name;
    private double price;
    private Date publish;
}
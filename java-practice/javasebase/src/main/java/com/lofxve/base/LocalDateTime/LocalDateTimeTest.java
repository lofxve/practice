package com.lofxve.base.LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDateTime dateTime = LocalDateTime.of(2012, 12, 10, 10, 12, 45, 10);
        System.out.println(dateTime);
    }
}

package com.lofxve.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @ClassName User
 * @Author lofxve
 * @Date 2021/2/8 17:21
 * @Version 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(value="user") // 集合（表）名
public class User {
    private ObjectId id; // 主键
    private String username;
    private Integer age;
    private String address;
}
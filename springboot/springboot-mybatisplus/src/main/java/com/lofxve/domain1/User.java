package com.lofxve.domain1;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName User
 * @Author lofxve
 * @Date 2021/1/18 8:49
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_user")// 用于指定数据库的表名，如果没有默认类名下首字母小写
public class User implements Serializable {
    @TableId(type = IdType.AUTO) // 数据库自增
    private Integer id;
    private String username;
    private String password;
}
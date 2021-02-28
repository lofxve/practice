package com.wzd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzd.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserMapper
 * @Author lofxve
 * @Date 2021/1/29 18:41
 * @Version 1.0
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}

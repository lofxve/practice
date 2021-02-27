package com.lofxve.config;

import com.lofxve.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName SpringMVCConfig
 * @Author lofxve
 * @Date 2021/1/18 17:44
 * @Version 1.0
 */
@Configuration
public class SpringMVCConfig implements WebMvcConfigurer {
    @Autowired
    private MyInterceptor myInterceptor;

    // 将拦截器注册到Springboot
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/index01");
    }
}
package com.lofxve.handlers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName CommonsExceptionHandler1
 * @Author lofxve
 * @Date 2021/1/10 8:13
 * @Version 1.0
 */
@ControllerAdvice //要标注在类上,表示当前类是一个全局异常处理器的类
public class CommonsExceptionHandler1 implements HandlerExceptionResolver {
    @ExceptionHandler(Exception.class) //标注在方法上,表示当前方法可以处理哪些异常
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        // 记录异常
        e.printStackTrace();
        // 返回异常页面
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("forward:/error.jsp");
        modelAndView.addObject("msg", "未知异常");

        return modelAndView;
    }
}
package com.mld.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 全局异常处理方式
 * 1.配置error.html 或error/404.html或error/4xx.html
 * 2.使用@ControllerAdvice和@ExceptionHandler
 * 3.使用@Configure和@Bean方法返回SimpleMappingExceptionResolver(无法返回数据)
 * 4.使用@Configure并实现HandlerExceptionResolver（可以返回数据）
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        String str = null;
        str.isEmpty();
        return "ok";
    }

    @GetMapping("/cal")
    public String cal() {
        int a = 10 / 0;
        return "ok";
    }
}

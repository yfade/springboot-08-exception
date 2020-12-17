package com.mld.springboot.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * ControllerAdvice和通过实现HandlerExceptionResolver配置全局异常处理器相比，优先使用ControllerAdvice配置的处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public String aaa(Exception e, Model model){
        model.addAttribute("ext",e);
        return "error1";
    }
}

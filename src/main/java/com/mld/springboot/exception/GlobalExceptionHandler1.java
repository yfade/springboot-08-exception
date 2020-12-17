package com.mld.springboot.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class GlobalExceptionHandler1 implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception e) {
        ModelAndView mav = new ModelAndView();
        if (e instanceof NullPointerException) {
            mav.setViewName("error2");
        }
        if (e instanceof ArithmeticException) {
            mav.setViewName("error2");
        }
        mav.addObject("ext", e);
        return mav;
    }
}

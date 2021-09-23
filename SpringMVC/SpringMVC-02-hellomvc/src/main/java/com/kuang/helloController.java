package com.kuang;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yqiang
 * @date 2021/9/23
 * @apiNote
 */
public class helloController implements Controller {


    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "HelloSpringMVC");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}

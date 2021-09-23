package com.yq;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yqiang
 * @date 2021/9/23
 * @apiNote
 */
public class YQHelloController implements Controller {


    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        String result = "YQHelloController";
        modelAndView.addObject("msg", result);

        return modelAndView;
    }
}

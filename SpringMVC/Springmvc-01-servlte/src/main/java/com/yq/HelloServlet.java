package com.yq;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yqiang
 * @date 2021/9/18
 * @apiNote
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.doGet(req, resp);
        // 1. 获取前端参数
        String method = req.getParameter("method");
        if (method.equals("add")) {
            req.getSession().setAttribute("msg", "get执行了add方法");
        }
        if (method.equals("delete")) {
            req.getSession().setAttribute("msg", "get执行了delete方法");
        }
        // 2. 调用业务层
        // 3. 视图转发或者重定向
        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.doGet(req, resp);
        // 1. 获取前端参数
        String method = req.getParameter("method");
        if (method.equals("add")) {
            req.getSession().setAttribute("msg", "post执行了add方法");
        }
        if (method.equals("delete")) {
            req.getSession().setAttribute("msg", "post执行了delete方法");
        }
        // 2. 调用业务层
        // 3. 视图转发或者重定向
        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req,resp);
    }
}

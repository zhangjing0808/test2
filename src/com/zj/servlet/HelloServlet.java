package com.zj.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("------------service without parameters------------");
        PrintWriter pw = resp.getWriter();
        pw.println("hello world");
        pw.close();
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("------------destroy without parameters------------");
        super.destroy();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("------------init without parameters------------");
        super.init(config);
    }

    @Override
    public void init() throws ServletException {
        System.out.println("------------init without parameters------------");
        super.init();
    }
}

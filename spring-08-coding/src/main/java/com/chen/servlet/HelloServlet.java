package com.chen.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * response对象返回数据时，浏览器接受需要明确知道该数据的格式与编码
 * 因此要加上头部字段
 * content-type，设置之后后面用分号后跟上字符集设置
 * 即可解决前端中午乱码问题
 * author: JINCHENCHEN
 * date: 2020/12/29
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("utf-8");
        PrintWriter writer = resp.getWriter();
        writer.print("小明");
    }
}

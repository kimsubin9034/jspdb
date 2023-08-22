package com.codingbox.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

@WebServlet("/caos")
public class Caos extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {

        int num = 0;
        String num_ = req.getParameter("num");
        if (num_ != null && !num_.equals("")) {
            num = Integer.parseInt(num_);
        }
        String result = "";
        if (num % 2 != 0) {
            result = "홀수";
        } else {
            result = "짝수";
        }
        req.setAttribute("result", result);

        RequestDispatcher dispatcher = req.getRequestDispatcher("mvc/mvc2.jsp");
        dispatcher.forward(req, resp);
    }
}

package com.codingbox.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cal2")
public class Calc2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int num1= Integer.parseInt(req.getParameter("num1"));
		int num2= Integer.parseInt(req.getParameter("num2"));
		System.out.println("Get 요청");
		doProcess(req,resp);
		PrintWriter out =resp.getWriter();
		out.println("<html><body>"+(num1+num2)+"</body></html>");
	}
	
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			System.out.println("Post요청");
			doPost(req, resp);
			int num1= Integer.parseInt(req.getParameter("num1"));
			int num2= Integer.parseInt(req.getParameter("num2"));
		
			PrintWriter out =resp.getWriter();
			out.println("<html><body>"+(num1+num2)+"</body></html>");
		}
	
		protected void doProcess(HttpServletRequest request, HttpServletResponse
				response) throws ServletException, IOException {
			System.out.println("Post 요청");
	        doGet(request, response);
		}
	}


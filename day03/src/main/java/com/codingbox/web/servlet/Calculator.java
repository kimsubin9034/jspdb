package com.codingbox.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
			throws ServletException, IOException {
		//get,post 분리
		if(arg0.getMethod().equals("GET")) {
			System.out.println("GET 요청");
		}else if(arg0.getMethod().equals("POST")) {
			System.out.println("POST 요청");
		}
	
		super.service(arg0, arg1);
	}
	@Override    			//dopost + ctrl space
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("doPost 메소드가 호출되었습니다");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet 메소드가 호출되었습니다");
	}
}

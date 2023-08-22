package com.codingbox.web.servlet.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class CalcEx extends HttpServlet{
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
			
		
		 String xStr = arg0.getParameter("x");//Request에서 가져옴
	     String yStr = arg0.getParameter("y");

	        int x = Integer.parseInt(xStr);
	        int y = Integer.parseInt(yStr);
	        //null값 체크
	        if(!xStr.equals("")) {
	        	x=Integer.parseInt(xStr);
	        }
	        if(!yStr.equals("")) {
	        	y=Integer.parseInt(yStr);
	        }
	        // 두 숫자의 합을 계산
	        int sum = x + y;
	        
	        PrintWriter out =arg1.getWriter();
	        out.print("두 숫자의 합 :" + sum);
	        
	        
	    
	}
}

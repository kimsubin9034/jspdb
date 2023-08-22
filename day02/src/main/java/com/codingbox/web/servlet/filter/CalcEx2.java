package com.codingbox.web.servlet.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add2")
public class CalcEx2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
			
		
		 String xStr = arg0.getParameter("x");
		 //Request에서 가져옴
	     String yStr = arg0.getParameter("y");
	     String op = arg0.getParameter("operatior");
	     //cal2.html에 opreatior복사
	     
	     
	        //null값 체크
	        int x=0;
	        int y=0;
	        int sum=0;
	        if(!xStr.equals("")) {
	        	x=Integer.parseInt(xStr);
	        }
	        if(!yStr.equals("")) {
	        	y=Integer.parseInt(yStr);
	        }
	        if(op.equals("덧셈")) {
	        	sum = x+y;
	        }else {
	        	sum = x-y;
	        }
	        // 두 숫자의 합을 계산
	       
	        
	        PrintWriter out =arg1.getWriter();
	        
	        
	        out.print("결과 :" + sum);
	        
	        
	        
	    
	}
}

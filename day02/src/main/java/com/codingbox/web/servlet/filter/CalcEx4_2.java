package com.codingbox.web.servlet.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/calc4")
public class CalcEx4_2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		
		Cookie[] cookies = arg0.getCookies();
		
		String value_ =arg0.getParameter("value");
		String op = arg0.getParameter("operator");
		int value = 0;
		
		if(!value_.equals("")) {
			value =Integer.parseInt(value_);
		}	
		//계산	
		if(op.equals("=")) {
			int x = 0;
			//Cookie 꺼내기
			//Cookie c = cookies[0];
			for(Cookie c : cookies) {
				if(c.getName().equals("value")) {
					x = Integer.parseInt(c.getValue());
					break;
				}
			}
			String operator="";
			for(Cookie c : cookies) {
				if(c.getName().equals("op")) {
					operator =c.getValue();
					break;
				}
			}
			//int x = (Integer)session.getAttribute("value");
			int y = value;
			//	String operator = (String)session.getAttribute("op");
			int result =0;
			if(operator.equals("+")) {
				result = x + y;
			}else {		//"-"
				result = x - y;
			}
		
			//out.printf("결과값 : %d\n", result);
			
		}else {			//값 저장
			Cookie valueCookie = new Cookie("value",String.valueOf(value));
			Cookie opCookie = new Cookie("op",op);
			//사용자에게 cookie가 전달된다(header에 담겨 전달)
			arg1.addCookie(valueCookie);
			arg1.addCookie(opCookie);
		}
	
	}
}


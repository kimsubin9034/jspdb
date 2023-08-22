package com.codingbox.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingbox.web.dao.UserDao;
import com.codingbox.web.dto.UserDto;

@WebServlet("/join")
public class join extends HttpServlet{
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException, IOException {
		
		String userid = req.getParameter("userid");
		String userpw = req.getParameter("userpw");
		String username = req.getParameter("username");
		String userphone = req.getParameter("userphone");

		UserDto dto =new UserDto();
		dto.setUserid(userid);
		dto.setUserpw(userpw);
		dto.setUsername(username);
		dto.setUserphone(userphone);
		
		UserDao udao = new UserDao();
		if(udao.join(dto)){
			//trun면 회원가입 성공
			
		}else {
			//false면 회원가입 실패
		}
	
	}
}

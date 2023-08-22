<%@page import="com.codingbox.web.dao.UserDao"%>
<%@page import="com.codingbox.web.dto.UserDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String userid = request.getParameter("userid");
	String userpw = request.getParameter("userpw");
	String username = request.getParameter("username");
	String userphone = request.getParameter("userphone");

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
%>
	
</body>
</html>
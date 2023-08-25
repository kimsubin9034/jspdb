<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		loginpage로 이동 -> loginview.jsp 
		session 값을 비워놔야함
	 -->
	 <%
	 //session.invalidate();	//세션에 있는값 모든값 삭제
	 session.removeAttribute("session_id"); //원하는 세션값만 삭제가능
	 response.sendRedirect("loginview.jsp");
	 
	 %>
</body>
</html>
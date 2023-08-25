<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean class="com.codingbox.web.dto.MemberBean" id="member"/>
	<jsp:setProperty property="name" name="member" value="김자바"/>
	
	<jsp:getProperty property="name" name="member"/>
</body>
</html>
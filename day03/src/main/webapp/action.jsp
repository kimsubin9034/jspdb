<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String userName =request.getParameter("user_name");
	
	//해당파라미터가 존재하지 않는경우(null 이거나 빈값일때)
	if(userName==null){
		userName="이름이 없습니다";
	}
	if(userName.equals("")){
		userName="이름을 입력하세요";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=userName %>	
</body>
</html>
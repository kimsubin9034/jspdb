<%@page import="com.codingbox.web.dto.TblMemberDTO"%>
<%@page import="com.codingbox.web.dao.TblMemberDAO"%>
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
		TblMemberDAO mdao = new TblMemberDAO();
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		
		TblMemberDTO member = mdao.login(userid, userpw);
		
		if(member !=null) {	//로그인성공
	%>
	<script>
			alert("로그인성공");
		</script>
		<%=member.getUserid() %>
		<%=member.getUserpw() %>
	<%}else { 	//로그인실패 %>	
		<script>
			alert("로그인실패");
		</script>
	<%} %>
</body>
</html>
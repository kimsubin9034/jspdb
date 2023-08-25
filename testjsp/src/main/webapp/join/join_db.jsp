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
	<jsp:useBean id="member" class="com.codingbox.web.dto.TblMemberDTO" />
	<jsp:setProperty property="*" name="member" />

	<%
	TblMemberDAO mdao = new TblMemberDAO();
	if (mdao.join(member)) {
	%>
	<script> 
		alert("회원가입성공");
		 location.href="loginview.jsp"; 
	</script>
	<%
	} else {
	%>
	<script>
		alert("회원가입실패");
		location.href = "joinview.jsp";
	</script>
	<%
	}
	%>
</body>
</html>
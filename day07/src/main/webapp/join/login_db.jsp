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
		
		
		TblMemberDTO member = mdao.login(userid,userpw);
		
		
		if(member !=null) {	//로그인성공
		session.setAttribute("session_id", member);	//원래라면 userid부터 다 받아올수있으나
													//member로 한번에 가져올것임
	%>
		<script>
			//alert("로그인성공");
			location.href ='mainview.jsp';
			</script>
	<%}else { 	//로그인실패 %>	
		<script>
			//alert("로그인실패");
			location.href ='mainview.jsp';
		</script>
	<%} %>
</body>
</html>
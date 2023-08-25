<%@page import="com.codingbox.web.dao.TblMemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String userid = request.getParameter("userid");
//TblMemberDAO에서 DB조회 후(checkId(userid)) ,checkId->boolean
//해당 id로 가입이 가능하면 out.print("ok"),
//가입이 불가능하면 out.print("not-ok")

//TblMemberDAO memberDAO = new TblMemberDAO();
	TblMemberDAO memberDAO = new TblMemberDAO();
	if(!memberDAO.checkId(userid)){
		//회원가입 가능한상태값을 던져줌
		out.print("ok");
	}else {
		//회원가입 불가능한 상태값을 던져줌
		out.print("not ok");
	}
		

%>

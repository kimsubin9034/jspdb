<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String ans = request.getParameter("ans");
String result =null;

	if(ans ==null || ans.equals("")){
		//화면에 출력할 결과 문자열
		result = "응답 내용 없음";
	}else {
		int user_select = Integer.parseInt(ans);
		if(user_select==300){
			result="정답입니다";
		}else{
			result="정답이 아닙니다";
		}
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div><h1>응답결과 <br/></h1></div>
<div>
	<p><%=result %></p>
</div>
</body>
</html>
<%@page import="java.util.ArrayList"%>
<%@page import="java.lang.reflect.Array"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
        ArrayList<String> datas = (ArrayList<String>) session.getAttribute("arMsg");
        if (datas != null) {
            for (int i = 0; i < datas.size(); i++) {
                out.println(datas.get(i) + "<br/>");
            }
        }
    %>
</body>
</html>

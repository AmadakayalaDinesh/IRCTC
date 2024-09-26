<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="common.RegisterBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

RegisterBean rb=(RegisterBean)session.getAttribute("msg");
out.println("Login Sucessful");
out.println("Welcome IRCTC "+rb.getPname());
%>
<br><a href='View'>VIEW</a>
</body>
</html>
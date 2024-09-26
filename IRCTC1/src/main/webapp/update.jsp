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
String hp=(String)request.getAttribute("msg2");
out.println(hp);

%>
<br><a href='View'>VIEW</a>
</body>
</html>
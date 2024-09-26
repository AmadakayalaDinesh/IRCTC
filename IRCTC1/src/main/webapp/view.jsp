<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="common.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

RegisterBean sk=(RegisterBean)request.getAttribute("msg");
out.println("PNAME<d>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+sk.getPname()+"<br></d>PTKTNO<d>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+sk.getPtktno()+"<br></d>PCOACKTYPE<d>&nbsp;&nbsp;&nbsp;"+sk.getPcoachno()+"<br></d>PCOACHNO<d>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+sk.getPcoachtyp()+"</d>");
%>
<a href="Edit?ptk=<%=sk.getPtktno()%>">EDIT</a>&nbsp;&nbsp;&nbsp;<a a href="logout">LOGOUT</a>
</body>
<style>
d{
color:Red;
}
</style>
</html>
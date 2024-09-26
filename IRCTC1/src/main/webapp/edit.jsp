<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="common.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
RegisterBean kk=(RegisterBean)request.getAttribute("msg1");
%>
<form action="upd" method="post">
<input type="hidden" name="jok" value=<%= kk.getPtktno()%>><br>
PNAME<input type="text" name="jok1" value=<%=kk.getPname()%>><br>
PCOACHNO<input type="text" name="jok3" value=<%=kk.getPcoachno()%>><br>
PCOACHTYPE<input type="text" name="jok4" value=<%=kk.getPcoachtyp()%>><br>
<input type="submit" value='Save'>  
</form>

</body>
</html>
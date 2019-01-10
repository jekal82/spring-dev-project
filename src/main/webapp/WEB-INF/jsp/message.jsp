<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%
	String text = (String)request.getAttribute("text");
%>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	text : <%=text %>
</body>
</html>
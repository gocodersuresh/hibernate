<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String nameFromTextBox=request.getParameter("myName");
session.setAttribute("key1",nameFromTextBox);
 %>

<h1>Show me value in Session==><%=session.getAttribute("key1") %></h1> 
</body>
</html>
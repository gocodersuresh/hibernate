<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shivapreals.tech-Jsp implicit object pageContext</title>
</head>
<body>
<h1><%
out.println("PAGE example  ");

out.println(pageContext.getAttribute("pagedemo",PageContext.PAGE_SCOPE));
out.println("SESSION example");

out.println(pageContext.getAttribute("sessiondemo",PageContext.SESSION_SCOPE));
out.println("APPLICATION example");
out.println(pageContext.getAttribute("applicationdemo",PageContext.APPLICATION_SCOPE));
out.println("REQUEST example");
out.println(pageContext.getAttribute("requestdemo",PageContext.APPLICATION_SCOPE));
%></h1>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shivapreals.tech-Jsp implict object PageContext</title>
</head>
<body>
<%pageContext.setAttribute("pagedemo","pageValue",PageContext.PAGE_SCOPE);
pageContext.setAttribute("sessiondemo","sessionvalue",PageContext.SESSION_SCOPE);
pageContext.setAttribute("applicationdemo","applicationvalue",PageContext.APPLICATION_SCOPE);
pageContext.setAttribute("requestdemo","requestvalue",PageContext.REQUEST_SCOPE);
%>
<h1>
<%out.println("PAGE example  ");

out.println(pageContext.getAttribute("pagedemo",PageContext.PAGE_SCOPE));

out.println("Request example  ");

out.println(pageContext.getAttribute("requestdemo",PageContext.REQUEST_SCOPE));

%>
</h1>
<a href="/JEE/pageContextDisplay.jsp">To see the session and application values please click here</a>
</body>
</html>
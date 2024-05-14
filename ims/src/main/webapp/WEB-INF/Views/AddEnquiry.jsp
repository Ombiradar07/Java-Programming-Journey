<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD Inquiry</title>
</head>
<body>
		<h2>ADD Enquiry </h2>
		<%
	 if(request.getAttribute("msg")!=null)
	 {
		 out.print(request.getAttribute("msg"));
	 }
	%>
	<form action="addEnquiry" method ="post">
	<pre>
		Name : <input type="text" name = "name">
		Email : <input type="email" name = "email">
		Mobile : <input type=text name = "mobile">
		course : <input type="text" name = "course">
		</pre>
		
		<input type="submit">
	</form>
</body>
</html>
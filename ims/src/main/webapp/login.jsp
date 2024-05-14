<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Inquiry Management</title>
</head>
<body>
	<h2>...Login Here...</h2>
	<%
	 if(request.getAttribute("error")!=null)
	 {
		 out.print(request.getAttribute("error"));
	 }
	%>
	<form action="verifyLogin" method = "post">
	Email : <input type ="email" name ="email">
	Password : <input type ="password" name ="password">
	<input type="submit"> 
	</form>
</body>
</html>
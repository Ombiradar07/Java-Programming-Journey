<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition</title>
</head>
<body>
	<form action ="additionController" method ="post">
	Number 1  : <input type ="text" name="num1">
	Number 2 : <input type ="text" name = "num2">
	<input type ="submit" >
	</form>
	
	<%
	if(request.getAttribute("res")!=null)
	{
	out.println(request.getAttribute("res"));
	}
	%>
</body>
</html>
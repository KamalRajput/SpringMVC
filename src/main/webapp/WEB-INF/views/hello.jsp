<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<h1>Hello from JSP</h1>
<!--using request to get the  data from controller -->
	<%
	Integer id=(Integer)request.getAttribute("id");
	String name=(String)request.getAttribute("name");	
	String Salary=(String)request.getAttribute("Salary");
	out.println("id:"+id+ " , name:"+name+ ", salary:"+Salary);
	%>

<!--using Jsp exp. lngg to get the  data from controller -->
<br/>
Id: <b>${id}</b>
Name:<b>${name}</b>
Salary: <b>${Salary}</b>

</body>
</html>
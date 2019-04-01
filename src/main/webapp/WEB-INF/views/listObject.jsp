<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,com.kamal.SpringMvc.dto.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list Object</title>
</head>
<body>

<% 
List<Employee> list=(List<Employee>)request.getAttribute("employees");
for(Employee e:list){
	out.println(e.getId());
	out.println(e.getName());
	out.println(e.getSalary());
}
%>
</body>
</html>
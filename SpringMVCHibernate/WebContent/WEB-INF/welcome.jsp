<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome to String 

<form:form action="submitDetails" modelAttribute="user">
<p/>
Name : <form:input path="name"/>
<p/>
Gender : Male <form:radiobutton path="gender" value="male"/>
         Female <form:radiobutton path="gender" value="female"/>
<p/>
State : <form:select path="state">
			<form:option value="Maharashtra"></form:option>
			<form:option value="Gujrat"></form:option>
			<form:option value="Goa"></form:option>
			<form:option value="Uttar Pradesh"></form:option>
			<form:option value="Tamil Nadu"></form:option>
			<form:option value="Andhra Pradesh"></form:option>
			<form:option value="Punjab"></form:option>	
		</form:select>  
<p/>
<input type ="submit" value ="Submit">
</form:form>	

</body>
</html>
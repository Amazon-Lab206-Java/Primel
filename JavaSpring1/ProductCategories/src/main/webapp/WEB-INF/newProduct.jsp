<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Product</title>
</head>
<body>
	<h1>New Product</h1>
	
	<form:form action="/products/new" method="POST" modelAttribute="product">
		<form:label path="name">Name:</form:label>
		<form:input path="name" type="text"/>
		<form:label path="description">Description:</form:label>
		<form:input path="description" type="textarea"/>
		<form:label path="price">Price:</form:label>
		<form:input path="price" type="text"/>
		<input type="submit" value="Create" />
	</form:form>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit a Book</title>
</head>
<body>
	<form:form method="POST" action="/books/edit/${id}" modelAttribute="book">
	    <form:label path="title">Title
	    <form:errors path="title"/>
	    <form:input path="title"/></form:label>
	    
	    <form:label path="description">Description
	    <form:errors path="description"/>
	    <form:textarea path="description"/></form:label>
	    
	    <form:label path="language">language
	    <form:errors path="language"/>
	    <form:input path="language"/></form:label>
	    
	    <form:label path="numberOfPages">Pages
	    <form:errors path="numberOfPages"/>     
	    <form:input type="number" path="numberOfPages"/></form:label>
	    
	    <form:hidden path="id"/>
	    
	    <input type="submit" value="Submit"/>
	</form:form>
</body>
</html>
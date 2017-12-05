<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Language Info</title>
</head>
<body>
	<p><a href="/languages/delete/${language.id}">Delete</a></p>
	<p><a href="/languages"> Dashboard</a></p>
	
	<form:form method="POST" action="/languages/edit/${language.id}" modelAttribute="language">
	    <form:label path="name">Name
	    <form:errors path="name"/>
	    <form:input path="name"/></form:label>
	    
	    <form:label path="creator">Creator
	    <form:errors path="creator"/>
	    <form:input path="creator"/></form:label>
	    
	    <form:label path="currentVersion">Current Version
	    <form:errors path="currentVersion"/>
	    <form:input path="currentVersion"/></form:label>
	    
	    <input type="submit" value="Submit"/>
	</form:form>
</body>
</html>
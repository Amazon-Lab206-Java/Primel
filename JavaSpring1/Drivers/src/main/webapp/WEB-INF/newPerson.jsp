<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Person</title>
</head>
<body>
	<h1>New Person</h1>
	
	<form:form action="/persons/new" method="POST" modelAttribute="person">
			<p>
				<form:label path="firstName" for="firstName">First Name:</form:label>
				<form:input path="firstName" type="text" name="firstName"/>
			</p>
			<p>
				<form:label path="lastName" for="lastName">Last Name:</form:label>
				<form:input path="lastName" type="text" name="lastName"/>
			</p>	
			<input type="submit" value="Create" />
		</form:form>
</body>
</html>
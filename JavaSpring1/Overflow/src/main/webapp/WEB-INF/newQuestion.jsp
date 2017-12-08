<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ask A Question</title>
</head>
<body>
	<h1>What is your question?</h1>
	
	<form:form action="/questions/new" method="POST" modelAttribute="newQuestion">
		<p>
			<form:label path="question">Question:</form:label><br>
			<form:input type="textarea" path="question" />			
		</p>
		<p>
			<form:label path="tags">Tags:</form:label>
			<form:input type="text" path="tags" />			
		</p>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>
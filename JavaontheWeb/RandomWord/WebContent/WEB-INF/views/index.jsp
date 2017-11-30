<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Random Word Generator</title>
</head>
<body>
	<h2>You have generated a word <%= session.getAttribute("count") %> times.</h2>
	<h1><%= session.getAttribute("randWord") %></h1>
	
	<form action="Home">
		<input type="submit" name="generate" value="Generate">
	</form>
	
	<p>The last time you generated a word was:</p>
	<h3><%= session.getAttribute("generated") %></h3>
</body>
</html>
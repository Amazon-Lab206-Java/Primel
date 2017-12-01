<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<title>Counter</title>
</head>
<body>
<p>You have visited the site <c:out value="${count}"></c:out> times.</p>
<a href="/">Visit again?</a>
</body>
</html>
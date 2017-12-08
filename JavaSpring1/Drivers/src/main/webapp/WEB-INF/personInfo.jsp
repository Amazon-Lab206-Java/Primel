<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Driver info </title>
</head>
<body>
	<p>License Number: <c:out value="${person.license.number}" /></p>
	<p>State: <c:out value="${person.license.state}" /></p>
	<p>Expiration Date: <c:out value="${person.license.expirationDate}"/></p>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: auto;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
<title>Questions Dashboard</title>
</head>
<body>
<h1>Questions Dashboard</h1>

<table class="table">
		<thead>
			<tr>
				<th>Question</th>
				<th>Tags</th>
			<tr>
		</thead>
		<tbody>
			<c:forEach items="${questions}" var="question">
				<tr>    
				    <td><c:out value="${question.question}"/></td>
				    <td><c:forEach items="${question.tags}" var="tag">
				    	<c:out value="${tag.subject}"/><c:if test="${!loop.last}">,</c:if>
				    </c:forEach></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<a href="/questions/new">New Question</a>
</body>
</html>
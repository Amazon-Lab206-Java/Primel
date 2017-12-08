<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

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
<title>Question Answers</title>
</head>
<body>
	<h1><c:out value="${question.question}"></c:out></h1>
	<h3>Tags:</h3>
	<ul>
		<c:forEach items="${question.tags}" var="tag">
			<li><c:out value="${tag.subject}"/></li>
		</c:forEach>
	</ul>
	
	<table class="table">
		<thead>
			<tr>
				<th>Answers</th>
			<tr>
		</thead>
		<tbody>
			<c:forEach items="${question.answers}" var="answer">
				<tr>    
					<td><c:out value="${answer.answer}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<h3>Add your answer:</h3>
	<form:form action="/answers/add" method="POST" modelAttribute="newAnswer">
	<form:input type="hidden" path="question" value="${question.id}"/>
		<p>
			<form:label path="answer">Answer:</form:label><br>
			<form:input type="textarea" path="answer" />			
		</p>
		<input type="submit" value="Answer It!"/>
	</form:form>
</body>
</html>
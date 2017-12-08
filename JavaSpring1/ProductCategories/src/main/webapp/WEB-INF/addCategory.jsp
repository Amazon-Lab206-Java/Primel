<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Page</title>
</head>
<body>
	<h1><c:out value="${product.name}"></c:out></h1>
	<h3>Categories:</h3>
	
	<ul>
		<c:forEach var="category" items="${product.categories}">
			<li><c:out value="${category.name}"/></li>
		</c:forEach>
	</ul>
	
	<form:form action="/products/${product.id}/add" method="POST" modelAttribute="newCat">
		<p>
		<form:label path="products">Add Category:</form:label><br>
			<form:select path="products">
				<c:forEach items="${categories}" var="category">
					<form:option value="${category.id}" label="${category.name}" name="catId"/>
				</c:forEach>
			</form:select>
		</p>
		<input type="submit" value="Add"/>
	</form:form>
	
</body>
</html>
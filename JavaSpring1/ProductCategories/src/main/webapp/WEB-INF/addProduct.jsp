<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Page</title>
</head>
<body>
	<h1><c:out value="${category.name}"></c:out></h1>
	<h3>Products:</h3>
	<ul>
		<c:forEach var="product" items="${category.products}">
			<li><c:out value="${product.name}"/></li>
		</c:forEach>
	</ul>
	
	<form:form action="/categories/${category.id}/add" method="POST" modelAttribute="newProd">
		<p>
		<form:label path="categories">Add Product:</form:label><br>
			<form:select path="categories">
				<c:forEach items="${products}" var="product">
					<form:option value="${product.id}" label="${product.name}" name="prodId" />
				</c:forEach>
			</form:select>
		</p>
		<input type="submit" value="Add"/>
	</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Lookify by Artist</title>
</head>
<body>
	<h3>Songs by Artist: <c:out value="${artist}"/></h3>
	
	<form action="/search" method="post">
		<input type="text" name="artist"/>
        <input type="submit" value="Search Artists"/>
    </form>
	
	<a href="/dashboard">Dashboard</a>
	
	<table class="table">
		<tr>
			<th>Name</th>
			<th>Rating</th>
			<th>actions</th>
		<tr>
		<c:forEach items="${byArtist}" var="song">
			<tr>    
			    <td><a href="/songs/{song.id}"><c:out value="${song.title}"/></a></td>
			    <td><c:out value="${song.rating}"/></td>
			    <td><a href="/songs/delete/${song.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
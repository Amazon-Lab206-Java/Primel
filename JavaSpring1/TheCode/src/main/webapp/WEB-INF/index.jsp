<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<title>Secret Code</title>
</head>
<body>
<c:out value="${errors}"></c:out>
<h3>What is the code?!!</h3>
<form action="/trycode" method="POST">
	<input type="text" name="code">
	<input type="submit" value="Try Code">
</form>
</body>
</html>
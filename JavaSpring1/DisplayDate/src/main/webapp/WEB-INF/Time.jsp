<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<!DOCTYPE html>
<html>
<head>
<title>Time</title>
</head>
<body>
	<span id="time"><fmt:formatDate pattern="h:mm a" value="${time}"/></span>
</body>
</html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<!DOCTYPE html>
<html>
<head>
<title>Date</title>
</head>
<body>
	<span id="date"><fmt:formatDate pattern="EEEEE, 'the' dd 'of' MMMMM, yyyy" value="${date}"/></span>
</body>
</html>
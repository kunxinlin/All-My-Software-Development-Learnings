<!-- to use the foreach tag -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>
	The student is confirmed: ${student.firstName} ${student.lastName}
	<br><br>
	The student is from: ${student.country}
	<br><br>
	The student favorite language is: ${student.favoriteLanguage}
	<br><br>
	OS:
	
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li> ${temp} </li>
		</c:forEach>
	</ul>
	
</body>

</html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>
	</title>
</head>

<body>
	<form:form action="processForm" modelAttribute="student">
	
		First Name: <form:input path="firstName"/>
		<br>
		Last Name: <form:input path="lastName" />
		<br><br>
		
		Country:
		<form:select path="country">
<%-- 			<form:option value="Brazil" label ="Brazil"/>
			<form:option value="France" label ="France"/>
			<form:option value="Germany" label ="Germany"/>
			<form:option value="India" label ="India"/> --%>
			
			<form:options items="${student.countryOptions}" />
			
		</form:select>
		
		<br><br>
		Favorite Programming Language:
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C++ <form:radiobutton path="favoriteLanguage" value="C++" />	
		C# <form:radiobutton path="favoriteLanguage" value="C#" />	
		Python <form:radiobutton path="favoriteLanguage" value="Python" />					
		<br><br>
		
		Operating Systems:
		
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		Windows <form:checkbox path="operatingSystems" value="Windows" />
		
	
		
		<input type="submit" value="Submit" />
		
		
	</form:form>
</body>

</html>
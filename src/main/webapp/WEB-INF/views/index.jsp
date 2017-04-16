<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>hello</title>
</head>
<body>

<h1>Cars!</h1>

<form:form action="Add">
<button type="submit">Add Car</button>
</form:form>

<form:form action="Find">
<button type="submit">Find Car</button>
</form:form>

<form:form action="ViewAll">
<button type="submit">View All</button>
</form:form>
</body>
</html>
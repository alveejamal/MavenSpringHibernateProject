<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find</title>
</head>
<body>

<form:form action="find">

<div class="form-group">
  <label for="regNumber">Registration Number:</label>
  <input type="text" name="regNumber" class="form-control" id="text">
</div>

<button type="submit" class="btn btn-primary">Find</button>
</form:form>
</body>
</html>
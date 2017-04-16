<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add</title>
</head>
<body>

<form:form action="submitAdd">

<div class="form-group">
<label for="regNumber"> Registration Number:</label>
  <input type="text" name = "regNumber" class="form-control" id="regNumber">
</div>
<br>
<div class="form-group">
  <label for="ownerName">Owner:</label>
  <input type="text" name="ownerName" class="form-control" id="ownerName">
</div>
<br>
<div class="form-group">
  <label for="model">Model:</label>
  <input type="text" name="model" class="form-control" id="model">
</div>
<br>
<div class="form-group">
  <label for="pwd">Year:</label>
  <input type="text" name="year" class="form-control" id="year">
</div>

<button type="submit" class="btn btn-primary">Submit</button>
</form:form>

</body>
</html>
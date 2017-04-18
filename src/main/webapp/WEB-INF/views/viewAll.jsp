<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All</title>
</head>
<body>

	<table>
		<tr>
			<th>Registration Number</th>
			<th>Model</th>
			<th>Owner</th>
			<th>Year</th>
		</tr>

		<c:forEach items="${cars}" var="entry">
			<tr>

				<form:form action="ReadEntry" method="post">

					<td><c:out value="${entry.getRegNumber()}" /></td>
					<td><c:out value="${entry.getModel()}" /></td>
					<td><c:out value="${entry.getOwnerName()}" /></td>
					<td><c:out value="${entry.getYear()}" /></td>
				</form:form>
			</tr>
		</c:forEach>


	</table>

</body>
</html>
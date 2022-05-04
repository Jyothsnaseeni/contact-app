<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>Save Contact</h4>
	${succMsg} ${errMsg}

	<form:form action="saveContact?contactId=${contacts.contactId}"
		method="POST" modelAttribute="contacts">
		<table>
			<tr>
				<td>Contact Name</td>
				<td><form:input path="name"/></td>
			</tr>

			<tr>
				<td>Contact Number</td>
				<td><form:input path="phnNo"/></td>
			</tr>

			<tr>
				<td>Contact Email</td>
				<td><form:input path="email"/></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Sumbit"/></td>
			</tr>

		</table>

		<a href="viewContacts">View All Contacts</a>

	</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script>

function confirmDelete(){
	return confirm(" Are you sure, you want to delete?");
}
</script>

</head>
<body>

	<a href="loadForm">+ Add New Contact</a>
	
	<h3>View Contacts here</h3>

	<table>
		<thead>
			<tr>
				<th>Contact Name</th>
				<th>Contact Number</th>
				<th>Contact Email</th>
				<th>Action</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${contacts}" var="c">
                 <tr>
                     <td>${c.name}</td>
                     <td>${c.email}</td>
                     <td>${c.phnNo}</td>
                     <td>
                         <a href="edit?cid=${c.contactId}">Edit</a> &nbsp; &nbsp; 
                         <a href="delete?cid=${c.contactId}" onclick="return confirmDelete()">Delete</a>
                     </td>   
                 </tr>
             </c:forEach>
		</tbody>	
	</table>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Contacts</title>
</head>
<body>
	<a href="view">Create New Lead</a>
<h2>List of Contacts</h2>
	<table>
		<tr>	
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Lead Source</th>
			<th>Mobile</th>
			<th>Billing</th>
		</tr>
	<c:forEach items="${contacts}" var="contacts">
		<tr>
		<td>${contacts.id}</td>
		<td><a href="getContactById?id=${contacts.id}">${contacts.firstName}</a></td>
		<td>${contacts.lastName}</td>
		<td>${contacts.email}</td>
		<td>${contacts.leadSource}</td>
		<td>${contacts.mobile}</td>
		<td><a href="getContactById?id=${contacts.id}">Generate Bill</a></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>
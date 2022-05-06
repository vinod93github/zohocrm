<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads</title>
</head>
<body>
	<a href="view">Create New Lead</a>
<h2>List of Leads</h2>
	<table>
		<tr>	
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Lead Source</th>
			<th>Mobile</th>
		</tr>
	<c:forEach items="${leads}" var="lead1">
		<tr>
		<td>${lead1.id}</td>
		<td><a href="getLeadById?id=${lead1.id}">${lead1.firstName}</a></td>
		<td>${lead1.lastName}</td>
		<td>${lead1.email}</td>
		<td>${lead1.leadSource}</td>
		<td>${lead1.mobile}</td>
		
		</tr>
	</c:forEach>
	</table>
</body>
</html>
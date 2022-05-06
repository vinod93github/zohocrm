<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Billing customers</title>
</head>
<body>
	<a href="view">Create New Lead</a>
<h2>List of Bills</h2>
	<table>
		<tr>	
			<th>Id</th>
			<th>Amount</th>
			<th>Email</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Mobile</th>
			<th>Product Name</th>
		
		</tr>
	<c:forEach items="${billing}" var="bill">
		<tr>
		<td>${bill.id}</td>
		<td>${bill.amount}</td>
		<td>${bill.email}</td>
		<td>${bill.firstName}</td>
		<td>${bill.lastName}</td>
		<td>${bill.mobile}</td>
		<td>${bill.productName}</td>
		
		</tr>
	</c:forEach>
	</table>
</body>
</html>
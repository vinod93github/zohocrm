<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead | Create</title>
</head>
<body>
<h2>Lead  | Create</h2>
		<form action="generate" method="post">
				<pre>
				First Name<input type="text" name="firstName" value="${contact.firstName}"/>
				Last Name<input type="text" name="LastName"value="${contact.lastName}"/>
				Email <input type="text" name="email" value="${contact.email}"/>
				Mobile <input type="text" name="Mobile" value="${contact.mobile}"/>
				Product Name<input type="text" name="productName"/>
				Amount paid<input type="text" name="amount">
				<input type="submit" value="Generate Bill"/>
				</pre>
				${msg}
		</form>
		<form action="listbills" method="post">
		<input type="submit" value="Get bill details"/>
		</form>
</body>
</html>
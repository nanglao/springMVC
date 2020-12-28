<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body Bgcolor="pink">
	<div align="center"></div>
	<h1>Contact List</h1>
	<h3><a href="new">New Contact</a></h3>
	<table border="1" cellpadding="5">
		<tr>
			<th>No</th>
			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Phone</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${listContact}" var="contact" varStatus="status">
		<tr>
			<td>${status.index + 1 }</td>
			<td>${contact.name}</td>
			<td>${contact.email }</td>
			<td>${status.address}</td>
			<td>${status.phone}</td>
			<td>${status.action}</td>
		</tr>
		</c:forEach>
	</table>
	<h2>Hello World!</h2>
	<form action="add">

		<input type="text" name="t1"><br> <input type="text"
			name="t2"><br> <input type="submit">
	</form>
</body>
</html>

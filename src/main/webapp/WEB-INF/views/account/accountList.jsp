<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Account List Page</h1>
	
	<table>
		<thead>
			<tr>
				<th>Account Number</th>
				<th>Balance</th>
				<th>Date</th>
				<th>ID</th>
				<th>Book Number</th>
			</tr>
		</thead>
		
		<tbody>
		<c:forEach items="${account}" var="list">
			<tr>
				<td>${list.accountNumber}</td>
				<td>${list.accountBalance}</td>
				<td>${list.accountDate}</td>
				<td>${list.id}</td>
				<td><a href="../bankbook/bankbookSelect?bookNumber=${list.bookNumber}">${list.bookNumber}</a></td>
			</tr>
		</c:forEach>
		</tbody>
		
	</table>

</body>
</html>
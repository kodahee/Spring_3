<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<c:import url="../template/bootStrap.jsp"></c:import>

<title>Insert title here</title>
</head>
<body>

	<c:import url="../template/header.jsp"></c:import>

	<div class="container">
		<h2>BankBook List Page</h2>
		
		<table class="table table-hover">
			<thead>
				<tr>
					<th scope="col">Name</th>
					<th scope="col">Rate</th>
					<th scope="col">Sale</th>
				</tr>
			</thead>
			
			<tbody>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td><a href="./bankbookSelect?bookNumber=${dto.bookNumber}">${dto.bookName}</a></td>
					<td>${dto.bookRate}</td>
					<td>${dto.bookSale}</td>
				</tr>
			</c:forEach>
			</tbody>
			
		</table>
	</div>
	
	<div class="container">
		<ul class="pagination">
			<li class="page-item"><a class="page-link" href="#">Previous</a></li>
			
			<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
				<li class="page-item"><a class="page-link" href="./bankbookList?curPage=${i}">${i}</a></li>
			</c:forEach>
			
			<li class="page-item"><a class="page-link" href="#">Next</a></li>
		</ul>
	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="../template/bootStrap.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>

	<c:import url="../template/header.jsp"></c:import>

	<div class="container">
		
		<h2>${board} Select</h2>

		<table class="table table-hover">
			<thead>
				<tr>
					<th scope="col">NO</th>
					<th scope="col">TITLE</th>
					<th scope="col">NAME</th>
					<th scope="col">DATE</th>
					<th scope="col">HIT</th>
				</tr>
			</thead>

			<tbody>
				<tr>
					<td>${board.num}</td>
					<td>${board.title}</td>
					<td>${board.name}</td>
					<td>${board.regDate}</td>
					<td>${board.hit}</td>
				</tr>
			</tbody>

		</table>
	</div>


</body>
</html>
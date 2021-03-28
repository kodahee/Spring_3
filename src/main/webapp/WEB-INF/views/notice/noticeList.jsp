<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/bootStrap.jsp"></c:import>
</head>
<body>

	<c:import url="../template/header.jsp"></c:import>
	
	<div class="container">
		<h2>Notice List</h2>
		
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
			<c:forEach items="${list}" var="list">
				<tr>
					<td>${list.num}</td>
					<td><a href="./noticeSelect?num=${list.num}">${list.title}</a></td>
					<td>${list.name}</td>
					<td>${list.regDate}</td>
					<td>${list.hit}</td>
				</tr>
			</c:forEach>
			</tbody>
			
		</table>
		<a class="btn btn-primary" href="./noticeInsert" role="button">글작성</a>
	</div>

</body>
</html>
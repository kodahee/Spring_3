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
	
	<h1>Notice Select</h1>
	
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
					<th scope="col">CONTENTS</th>
				</tr>
			</thead>
			
			<tbody>
				<tr>
					<td>${dto.num}</td>
					<td>${dto.title}</td>
					<td>${dto.name}</td>
					<td>${dto.regDate}</td>
					<td>${dto.hit}</td>
					<td>${dto.contents}</td>
				</tr>
			</tbody>
			
		</table>
	</div>

</body>
</html>
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
		<h2>Notice Select</h2>
		
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
					<td>${notice.num}</td>
					<td>${notice.title}</td>
					<td>${notice.name}</td>
					<td>${notice.regDate}</td>
					<td>${notice.hit}</td>
					<td>${notice.contents}</td>
				</tr>
			</tbody>
			
		</table>
		<a class="btn btn-primary" href="./noticeUpdate" role="button">수정</a>
		<a class="btn btn-primary" href="./noticeDelete" role="button">삭제</a>
	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<c:if test="${member.name eq 'admin'}">
			<a class="btn btn-primary" href="./noticeInsert" role="button">글작성</a>
		</c:if>
	</div>

	<div class="container">
		<ul class="pagination">
			<c:if test="${pager.pre}">
				<li class="page-item"><a class="page-link" href="./noticeList?curPage=${pager.startNum-1}">Previous</a></li>
			</c:if>
			
			<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
				<li class="page-item"><a class="page-link" href="./noticeList?curPage=${i}">${i}</a></li>
			</c:forEach>
			
			<c:if test="${pager.next}">
				<li class="page-item"><a class="page-link" href="./noticeList?curPage=${pager.lastNum+1}">Next</a></li>
			</c:if>
		</ul>
	</div>

</body>
</html>
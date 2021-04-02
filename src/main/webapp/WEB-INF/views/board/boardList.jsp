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
		<!-- <div>
			<img alt="jjung" src="../resources/images/img1.jpeg">
		</div> -->
		<h2>${board} List</h2>

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
						<td><a href="./${board}Select?num=${list.num}">${list.title}</a></td>
						<td>${list.name}</td>
						<td>${list.regDate}</td>
						<td>${list.hit}</td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
	</div>

<%-- 
	<div class="container">
		<ul class="pagination">
			<c:if test="${pager.pre}">
				<li class="page-item">
					<a class="page-link" href="./noticeList?curPage=${pager.startNum-1}&kind=${pager.kind}&search=${pager.search}">Previous</a>
				</li>
			</c:if>

			<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
				<li class="page-item">
					<a class="page-link" href="./noticeList?curPage=${i}&kind=${pager.kind}&search=${pager.search}">${i}</a>
				</li>
			</c:forEach>

			<c:if test="${pager.next}">
				<li class="page-item">
					<a class="page-link" href="./noticeList?curPage=${pager.lastNum+1}&kind=${pager.kind}&search=${pager.search}">Next</a>
				</li>
			</c:if>
		</ul>

		<div class="input-group mt-3 mb-3">
			<form action="./noticeList" class="form-inline">
				<div class="input-group-prepend">
					<select class="form-control" name="kind" id="sel1">
						<option>Title</option>
						<option>Contents</option>
						<option>Name</option>
					</select>
				</div>
				<input type="text" class="form-control" name="search" placeholder="Search">
				<div class="input-group-append">
					<button class="btn btn-success" type="submit">Search</button>
				</div>
			</form>
		</div>
 --%>	
		<c:if test="${member.name eq 'admin'}">
			<a href="./${board}Insert" class="btn btn-primary" role="button">Write</a>
		</c:if>
	</div>



</body>
</html>
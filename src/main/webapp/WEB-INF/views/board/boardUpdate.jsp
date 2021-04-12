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
		<h2>${board} Update Page</h2>

		<form id="frm" action="./${board}Update" method="post">
			<input type="hidden" name="num" value="${param.num}">
			<div class="form-group">
				<label for="exampleFormControlInput1">Name</label> 
				<input class="form-control form-control-lg" type="text" value="${dto.name}" id="name" name="name" readonly="readonly">
			</div>
			<div class="form-group">
				<label for="exampleFormControlInput1">Title</label> 
				<input class="form-control form-control-lg" type="text" value="${dto.title}" name="title" id="title">
			</div>
			<div class="form-group">
				<label for="exampleFormControlTextarea1">Contents</label>
				<textarea class="form-control" id="contents" rows="10" name="contents">${dto.contents}</textarea>
			</div>
			
			<c:forEach items="${dto.boardFiles}" var="file">
				<div>
					<span>${file.originName}</span>
					<span class="fileDelete" title="${file.fileNum}">X</span>
				</div>
			</c:forEach>
			
			<!-- <button type="submit" class="btn btn-primary" onclick="insertCheck()">Submit</button>
			<input type="button" value="WRITE" class="btn btn-primary" onclick="insertCheck()"> -->
			<input type="submit" value="Update" id="btn" class="btn btn-primary">

		</form>
	</div>
	
	<script type="text/javascript" src="../resources/jquery/boardUpdate.js"></script>
	<!-- <script type="text/javascript" src="../resources/js/insertCheck.js"></script> -->
</body>
</html>
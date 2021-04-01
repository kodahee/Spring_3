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
		<h2>Notice Insert Page</h2>

		<form action="./noticeInsert" method="post">
			<%-- <div class="form-group">
				<input class="form-control" type="text"
					placeholder="${dto.name}" readonly>
			</div> --%>
			<div class="form-group">
				<label for="exampleFormControlInput1">Name</label> 
				<input class="form-control form-control-lg" type="text" value="${member.name}" id="name" name="name" readonly="readonly">
			</div>
			<div class="form-group">
				<label for="exampleFormControlInput1">Title</label> 
				<input class="form-control form-control-lg" type="text" name="title">
			</div>
			<div class="form-group">
				<label for="exampleFormControlTextarea1">Contents</label>
				<textarea class="form-control" id="contents" rows="10" name="contents"></textarea>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-primary" onclick="insertCheck()">Submit</button>
					<input type="button" value="WRITE" class="btn btn-primary" onclick="insertCheck()">
				</div>
			</div>
		</form>
	</div>
	
	<script type="text/javascript" src="../resources/js/insertCheck.js"></script>
</body>
</html>
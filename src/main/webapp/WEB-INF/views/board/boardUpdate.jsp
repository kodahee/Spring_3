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
		<h2>${board} Update Page</h2>

		<form id="frm" action="./${board}Update" method="post">
			
			<div class="form-group">
				<label for="exampleFormControlInput1">Name</label> 
				<input class="form-control form-control-lg" type="text" value="${member.name}" id="name" name="name" readonly="readonly">
			</div>
			<div class="form-group">
				<label for="exampleFormControlInput1">Title</label> 
				<input class="form-control form-control-lg" type="text" value="${dto.title}" name="title"id="title">
			</div>
			<div class="form-group">
				<label for="exampleFormControlTextarea1">Contents</label>
				<textarea class="form-control" id="contents" rows="10" value="${dto.contents}" name="contents"></textarea>
			</div>
			
			<input type="button" value="Update" id="btn" class="btn btn-primary">

		</form>
	</div>

</body>
</html>
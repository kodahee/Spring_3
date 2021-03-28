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
		<h2>Notice Select</h2>

		<form action="./noticeUpdate" method="post">
			<div class="form-group">
				<label for="exampleFormControlInput1">Name</label> 
				<input class="form-control form-control-lg" type="text" placeholder="${notice.name}" value="${notice.name}" name="name">
			</div>
			<div class="form-group">
				<label for="exampleFormControlInput1">Title</label> 
				<input class="form-control form-control-lg" type="text" placeholder="${notice.title}" value="${notice.title}" name="title">
			</div>
			<div class="form-group">
				<label for="exampleFormControlTextarea1">Contents</label>
				<textarea class="form-control" id="contents" rows="10" placeholder="${notice.contents}" value="${notice.contents}" name="contents"></textarea>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-primary">Submit</button>
				</div>
			</div>
		</form>


	</div>

</body>
</html>
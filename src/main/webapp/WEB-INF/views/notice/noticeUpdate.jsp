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
		<h2>Notice Update</h2>

		<form action="./noticeUpdate" method="post">
			<div class="form-group">
				<label class="control-label col-sm-2" for="title">Title</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="title"
						placeholder="Enter Title" name="title" value="${notice.title}">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="contents">Contents</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="contents"
						placeholder="Enter Contents" name="contents" value="${notice.contents}">
				</div>
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
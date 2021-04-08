<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/bootStrap.jsp"></c:import>
<style type="text/css">
	#sample {
		display: none;
	}
</style>
</head>
<body>

	<c:import url="../template/header.jsp"></c:import>

	<div class="container">
		<h2>${board} Insert Page</h2>

		<form id="frm" action="./${board}Insert" method="post" enctype="multipart/form-data">
			<%-- <div class="form-group">
				<input class="form-control" type="text"
					placeholder="${dto.name}" readonly>
			</div> --%>
			<div class="form-group">
				<label for="exampleFormControlInput1">Name</label> 
				<input class="form-control form-control-lg myCheck" type="text" value="${member.name}" id="name" name="name" readonly="readonly">
			</div>
			<div class="form-group">
				<label for="exampleFormControlInput1">Title</label> 
				<input class="form-control form-control-lg myCheck" type="text" name="title" id="title">
			</div>
			<div class="form-group">
				<label for="exampleFormControlTextarea1">Contents</label>
				<textarea class="form-control myCheck" id="contents" rows="10" name="contents"></textarea>
			</div>
			
			<input type="button" value="Add" id="add" class="btn btn-danger">
			<input type="button" value="Delete" id="del" class="btn btn-info">
			<div id="files">
				<!-- add button을 클릭하면 sample 안에 있는 div 태그가 복사돼서 여기 들어옴
				최대 5개까지만 -->
			</div>
			
			<input type="button" value="Write" id="btn" class="btn btn-primary">

		</form>
	</div>
	<div id="sample">
		<div class="input-group">
			<div class="custom-file">
				<input type="file"  id="inputGroupFile04"
					class="form-control-file border" name="files">
			</div>
			<div class="input-group-append delete">
				<input class="btn btn-outline-secondary" type="button"
					id="inputGroupFileAddon04" value="Delete">
			</div>
		</div>
	</div>
	
	
	<script type="text/javascript" src="../resources/jquery/boardInsert.js"></script>
	<script type="text/javascript" src="../resources/jquery/fileAdd.js"></script>
</body>
</html>
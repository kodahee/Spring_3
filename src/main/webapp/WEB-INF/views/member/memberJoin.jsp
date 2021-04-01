<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/bootStrap.jsp"></c:import>
<style type="text/css">
	.r1 {
		color: red;
	}
	
	.r2 {
		color: blue;
	}
</style>
</head>
<body>

	<c:import url="../template/header.jsp"></c:import>

	<div class="container">
		<h2>Member Join Page</h2>
		<form action="./memberJoin", method="post">
			<div class="form-group">
				<label for="id">ID</label> 
				<input type="text" class="form-control" id="id" aria-describedby="idHelp" name="id"> 
				<!-- ID 6글자 이상 -->
				<h4 id="idResult"></h4>
			</div>
			<div class="form-group">
				<label for="pw">Password</label> 
				<input type="password"class="form-control" id="pw" name="pw">
				<!-- PW 8글자 이상 -->
				<h4 id="pwResult"></h4>
			</div>
			<div class="form-group">
				<label for="pw">Password Check</label> 
				<input type="password"class="form-control" id="pw2" name="pw">
				<!-- PW 두개는 일치 -->
				<h4 id="pwResult2"></h4>
			</div>
			<div class="form-group">
				<label for="name">Name</label> 
				<input type="text" class="form-control" id="name" name="name"> 
				<!-- 비어있으면 안됨 -->
				<h4 id="nameResult"></h4>
			</div>
			<div class="form-group">
				<label for="phone">Phone</label> 
				<input type="text" class="form-control" id="phone" aria-describedby="phoneHelp" name="phone"> 
				<small id="phoneHelp" class="form-text text-muted">
					- 를 포함하여 작성해주세요.
				</small>
				<h4 id="phoneResult"></h4>
				<!-- 비어있으면 안됨 -->
			</div>
			<div class="form-group">
				<label for="email">Email</label> 
				<input type="text" class="form-control" id="email" name="email"> 
				<!-- 비어있으면 안됨 -->
				<h4 id="emailResult"></h4>
			</div>
			<div class="form-group form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1">
				<label class="form-check-label" for="exampleCheck1">Check me out</label>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
			<input type="button" value="JOIN" class="btn btn-primary">
		</form>
	</div>
	
	<script type="text/javascript" src="../resources/js/memberJoin.js"></script>
	
	
	<!-- <form class="form-horizontal" action="./memberJoin" method="post">
		<div class="form-group">
			<label class="control-label col-sm-2" for="id">ID</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="id"
					placeholder="Enter ID" name="id">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="pw">PW</label>
			<div class="col-sm-10">
				<input type="password" class="form-control" id="pw"
					placeholder="Enter Password" name="pw">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="name">Name</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="name"
					placeholder="Enter Name" name="name">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="phone">Phone</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="phone"
					placeholder="Enter Phone Number" name="phone">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="email">Email</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="email"
					placeholder="Enter Email" name="email">
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default">Submit</button>
			</div>
		</div>
	</form> -->

</body>
</html>
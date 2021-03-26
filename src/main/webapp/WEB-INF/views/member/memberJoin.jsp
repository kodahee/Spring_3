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

	<h1>Member Join Page</h1>
	
	<div class="container">
		<h2>Member Join Page</h2>
		<form action="./memberJoin", method="post">
			<div class="form-group">
				<label for="id">ID</label> 
				<input type="text" class="form-control" id="id" aria-describedby="idHelp" name="id"> 
			</div>
			<div class="form-group">
				<label for="pw">Password</label> 
				<input type="password"class="form-control" id="pw" name="pw">
			</div>
			<div class="form-group">
				<label for="name">Name</label> 
				<input type="text" class="form-control" id="name" name="name"> 
			</div>
			<div class="form-group">
				<label for="phone">Phone</label> 
				<input type="text" class="form-control" id="phone" aria-describedby="phoneHelp" name="phone"> 
				<small id="phoneHelp" class="form-text text-muted">
					- 를 포함하여 작성해주세요.
				</small>
			</div>
			<div class="form-group">
				<label for="email">Email</label> 
				<input type="text" class="form-control" id="email" name="email"> 
			</div>
			<div class="form-group form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1">
				<label class="form-check-label" for="exampleCheck1">Check me out</label>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
	
	
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
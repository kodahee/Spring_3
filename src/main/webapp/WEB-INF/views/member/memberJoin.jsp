<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<h1>Member Join Page</h1>
	
	
	<form class="form-horizontal" action="./memberJoin" method="post">
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
	</form>

</body>
</html>
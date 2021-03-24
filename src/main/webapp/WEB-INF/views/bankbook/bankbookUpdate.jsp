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

	<h1>BankBook Update Page</h1>

	<form class="form-horizontal" action="./bankbookUpdate" method="post">
		<div class="form-group">
			<div class="col-sm-10">
				<input type="hidden" class="form-control" id="bookNumber"
					 name="bookNumber" value="${dto.bookNumber}">
			</div>
		</div>
		<%-- <div class="form-group">
			<label class="control-label col-sm-2" for="bookNumber">Number</label>
			<div class="col-sm-10">
				<input type="number" class="form-control" id="bookNumber"
					 name="bookNumber" value="${dto.bookNumber}" readonly="readonly">
			</div>
		</div> --%>
		<div class="form-group">
			<label class="control-label col-sm-2" for="bookName">Name</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="bookName"
					placeholder="Enter Name" name="bookName" value="${dto.bookName}">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="bookRate">Rate</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="bookRate"
					placeholder="Enter Rate" name="bookRate" value="${dto.bookRate}">
			</div>
		</div>
		<div class="form-group">
			<label for="sel1">Select list:</label> <select class="form-control"
				id="bookSale" name=bookSale value="${dto.bookSale}">
				<option>Y</option>
				<option>N</option>
			</select>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default">Submit</button>
			</div>
		</div>
	</form>

</body>
</html>
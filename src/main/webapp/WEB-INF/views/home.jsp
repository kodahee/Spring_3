<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<c:import url="./template/bootStrap.jsp"></c:import>

<!-- <script type="text/javascript">
	alert('Hello World');
</script> -->

<link rel="stylesheet" href="./resources/css/test.css">

<title>Hello, world!</title>
<style type="text/css">
	#d1 {
		width: 200px;
		height: 200px;
		background-color: red;
		overflow: hidden;
	}
	
	#d2 {
		width: 50px;
		height: 50px;
		background-color: yellow;
		margin: 75px auto;
	}
</style>
</head>
<body>

	<c:import url="./template/header.jsp"></c:import>

	<button class="b">BUTTON</button>
	<button id="btn" class="b">CLICK</button>
	<button id="btn2" class="b">CLICK</button>
	
	<h2 id="t">version 3</h2>
	
	<!-- <div id="result"></div> -->
	<ol id="result">
		<li>A</li>
	</ol>
	
	<select id="mon"></select>
	
	<div id="d1">
		<div id="d2"></div>
	</div>
	
	<script type="text/javascript">
	
		/* $("#btn2").click(function() {
			$("#result").append('<a href="#">GO</a>');		// 클릭하면 계속 a태그가 늘어남
		}); */
		
		/* $("#btn2").click(function() {
			$("#result").prepend('<li>GO</li>');		// 클릭하면 계속 a태그가 늘어남
		}); */
		
		$("#btn2").click(function() {
			/* location.href="./test"; */
			$.get("./test", function(data) {		// ajax로 요청을 보냄, get method, url
				console.log(data);
				$("#d2").html(data);
			}); 
		});
		
		$("#btn").click(function() {
			for(let i=1; i<13; i++) {
				$("#mon").append("<option>"+i+"</option>")
			}
		});
		
		
		$("#d1").click(function() {
			console.log("parent");
		});
		
		$("#d2").click(function() {
			console.log("child");
		});
		
		
	</script>

</body>
</html>
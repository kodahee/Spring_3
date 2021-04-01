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
</head>
<body>

	<c:import url="./template/header.jsp"></c:import>

	<button onclick="go()">BUTTON</button>
	<button id="btn">CLICK</button>
	<button id="btn2">CLICK</button>
	
	<h2>version 3</h2>
	
	<script type="text/javascript">
	
		let btn = document.getElementById("btn");
		let btn2 = document.getElementById("btn2");
		
		// btn2.addEventListener("click", go);		// go() 라고 해버리면 함수가 바로 실행돼서 함수이름만 써야함
		btn2.addEventListener("click", function() {
			alert("btn2");
			go();
		}) 
		
		// btn.onclick = go;
		btn.onclick = function() {
			alert("익명함수");
			go();
		}
			
		function go() {
			alert("hello");
		}
		
		
	</script>

</body>
</html>
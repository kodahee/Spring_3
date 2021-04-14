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

<!-- map api -->
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=8f237cb2087e0a6cde77d5583c5c43ca"></script>

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
	<button id="btn2" class="b">CLICK2</button>
	
	<input type="text" id="num">
	
	<h2 id="t">version 3</h2>
	
	<!-- <div id="result"></div> -->
	<ol id="result">
		<li>A</li>
	</ol>
	
	<select id="mon"></select>
	
	<div id="d1">
		<div id="d2">
			<!-- title, contents -->
			<h3 id="d3"></h3>
			<h3 id="d4"></h3>
		</div>
	</div>
	
	<div id="map" style="width:500px;height:400px;"></div>
	
	<script type="text/javascript">
	
		$("#btn2").click(function() {
			let num = $("#num").val();
			$.get("https://jsonplaceholder.typicode.com/posts/"+num, function(data) {
				alert(data);
				console.log(data);
				$("#d3").html(data.title);
				$("#d4").html(data.body);
				alert(data.title);
				/* data = data.trim();
				data = JSON.parse(data);		// json object가 됨
				alert(data.name); */
			}) ;
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
		
		// map api
		var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스
		var options = { //지도를 생성할 때 필요한 기본 옵션
			center: new kakao.maps.LatLng(33.450701, 126.570667), //지도의 중심좌표.
			level: 3 //지도의 레벨(확대, 축소 정도)
		};
		
		var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴
	</script>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="../template/bootStrap.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>

	<c:import url="../template/header.jsp"></c:import>

	<div class="container">
		<h1>${board} Select Page</h1>
		<h3>Title : ${dto.title}</h3>
		<h3>Writer : ${dto.name}</h3>
		<h3>Contents : ${dto.contents}</h3>
		
		<a href="./${board}Update?num=${dto.num}" class="btn btn-danger">Update</a>
		<a href="#" id="del" class="btn btn-info">Delete</a>
		
		
		<c:if test="${board ne 'notice'}">
			<a href="./${board}Reply?num=${dto.num}" class="btn btn-primary">Reply</a>
		</c:if>
		
		<form action="./${board}Delete" id="frm">
			<input type="hidden" name="num" value="${dto.num}">
		</form>
		
	</div>
	
	
	<script type="text/javascript">
	
		const del = document.getElementById("del");
		const frm = document.getElementById("frm");
	
		/* callback 함수 */
		del.addEventListener("click", function del() {
			let result = confirm("Delete");
			console.log(result);
			
			if(result) {
				// frm.method = "post";
				frm.setAttribute("method", "post");		// 주소만 알면 지울 수 있기 때문에 이거 하면 그걸 좀 방지할 수 있음
				// location.href="./${board}Delete?num=${dto.num}";
				frm.submit();
			}
		});
	
	</script>


</body>
</html>
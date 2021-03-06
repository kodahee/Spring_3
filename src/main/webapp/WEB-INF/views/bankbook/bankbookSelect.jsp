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

	<h1>BankBook Select Page</h1>

	<h3>Name : ${dto.bookName}</h3>
	<h3>Number : ${dto.bookNumber}</h3>
	
	<a href="../account/accountInsert?bookNumber=${dto.bookNumber}">계좌개설</a>

	<c:catch>		<!-- java 에서의 try catch -->
	<c:if test="${ member.id eq 'admin' }">
		<a href="./bankbookDelete?bookNumber=${dto.bookNumber}">Delete</a>
		<a href="./bankbookUpdate?bookNumber=${dto.bookNumber}">Update</a>
	</c:if>
	</c:catch>

	<%-- <c:if test="${not empty member && member.id eq 'admin'}">
		<a href="./bankbookDelete?bookNumber=${dto.bookNumber}">Delete</a>
		<a href="./bankbookUpdate?bookNumber=${dto.bookNumber}">Update</a>
	</c:if> --%>

	<%-- <!-- 로그인 했을 때만 Delete, Update 보이게 -->
	<c:if test="${not empty member}">
		<!-- admin 관리자 계정만 Delete, Update 보이게 -->
		<c:if test="${member.id eq 'admin'}">
			<a href="./bankbookDelete?bookNumber=${dto.bookNumber}">Delete</a>
			<a href="./bankbookUpdate?bookNumber=${dto.bookNumber}">Update</a>
		</c:if>
	</c:if> --%>


</body>
</html>
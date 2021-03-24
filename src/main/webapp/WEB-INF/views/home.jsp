<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<a href="./bankbook/bankbookList">BankBook List</a>

<!-- before login -->
<c:if test="${empty member}">
	<a href="./member/memberJoin">Join</a>
	<a href="./member/memberLogin">Login</a>
</c:if>

<!-- after login -->
<c:if test="${not empty member}">
	<a href="./member/memberMyPage">MyPage</a>
	<a href="./member/memberLogout">Logout</a>
</c:if>

</body>
</html>

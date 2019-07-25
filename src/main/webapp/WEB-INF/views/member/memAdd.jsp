<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 관리</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="${pageContext.request.contextPath}/member/add.do" method="POST">
		ID : <input type="text" name="memId" /> <br />
		PASSWROD : <input type="text" name="memPass" /> <br />
		NAME : <input type="text" name="memName" /> <br />
		POINT: <input type="text" name="memPoint" /><br />
		<input type="submit" />
	</form>
</body>
</html>
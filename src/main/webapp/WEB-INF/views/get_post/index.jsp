<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%= request.getContextPath() %>
	<h1>get 방식 전송</h1>
	<form action="<%= request.getContextPath() %>/my/result" method="get">
		<input type="text" name ="name"><br>
		<input type="text" name ="age"><br>
		<input type="submit" value="전송">
	</form>
	<h1>post 방식 전송</h1>
	<form action="result" method="post">
		<input type="text" name ="name"><br>
		<input type="text" name ="age"><br>
		<input type="submit" value="전송">
	</form>

	<h1>dto로 처리하기</h1>
	<form action="result" method="post">
		<input type="text" name ="name"><br>
		<input type="text" name ="age"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>
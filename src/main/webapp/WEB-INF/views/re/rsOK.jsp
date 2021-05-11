<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>rsOK.jsp<br>
	<h1>rsOK 인증 성공</h1>
	<h2>
		결과 : ${success }<br>
		dto : ${dto }<br>
		dto.id : ${dto.id }
	
	</h2><!-- model은 controller에서 연결된 jsp페이지에만 전달된다 -->
	
</body>
</html>
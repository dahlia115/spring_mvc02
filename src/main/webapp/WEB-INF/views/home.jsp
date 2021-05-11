<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href="css/test.css" type="text/css" rel="stylesheet">
	<link href="resources/css/test.css" type="text/css" rel="stylesheet">
	<link href="<c:url value='/css/test.css'/>" type="text/css" rel="stylesheet">
</head>
<body>
<h1 class="test">
	Hello world!  
</h1>
<c:set var="contextPath" value="<%=request.getContextPath() %>"/>
<P>  The time on the server is ${serverTime}. </P>
<img src="resources/img/test.jpg" width="150px" height="150px">
<img src="<%=request.getContextPath() %>/resources/img/test.jpg" width="150px" height="150px">
<img src="img/test.jpg" width="150px" height="150px">
<img src="<c:url value='/img/test.jpg'/>" width="150px" height="150px">
<img src="${contextPath }/img/test.jpg" width="150px" height="150px">

</body>
</html>

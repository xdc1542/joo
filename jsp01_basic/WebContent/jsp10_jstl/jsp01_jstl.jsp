<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(true) {
%>
		<h2>${ "참입니다" }</h2>
<%
	} else {
%>
		<h2>${ "거짓입니다" }</h2>
<%
	}
%>

<c:if test="true">
	<h2>${ "참입니다" }</h2>
</c:if>

</body>
</html>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.io.InputStreamReader"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>application객체를 이용해서 파일 읽기</h1>
	<h2>application.getResourceAsStream(path)메서드 이용</h2>
	
	<%
		String path = "/jsp04_object/sample.txt";
		char[] cbuf = new char[128];
		int len = -1;
	
		try(InputStreamReader isr = new InputStreamReader(application.getResourceAsStream(path))) {
			while((len=isr.read(cbuf)) != -1) {
				out.println(new String(cbuf, 0, len));
			}
		} catch(Exception e) { 
			out.println("에러 : " + e.getLocalizedMessage());
		}	
	%>
	<hr />
	
	실제경로    = <%= application.getRealPath(path) %><br>
	ContextPath = <%= application.getContextPath() %>
</body>
</html>
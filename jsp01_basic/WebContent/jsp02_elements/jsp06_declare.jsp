<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%!
	// 메서드선언 : add, sub, mul, div
	int val1 = 0;
	int val2 = 0;
	int result1;
	
	public int add(int x, int y) { return x + y; }
	public int sub(int x, int y) { return x - y; }
	public int mul(int x, int y) { return x * y; }
	public double div(double x, double y) { return x / y; }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 실습1. add(), sub(), mul(), div() 메서드 생서후 각 결과를 출력하기 
	 val1 = 10
	 val2 = 10
	 val1 + val2 = result
	 메서드호출
	-->
	
	10 + 20 = <%= add(10, 20) %><br>
	10 - 20 = <%= sub(10, 20) %><br>
	10 * 20 = <%= mul(10, 20) %><br>
	10 / 20 = <%= div(10, 20) %><br>
	<hr>
	
	<%
		val1 = 10;
		val2 = 20;
		
		result1 = add(val1, val2);
		int result2 = sub(val1, val2);
		int result3 = mul(val1, val2);
		double result4 = div(val1, val2);
	%>
	
	<%= val1 %> + <%= val2 %> = <%= result1 %><br>
	<%= val1 %> - <%= val2 %> = <%= result2 %><br>
	<%= val1 %> * <%= val2 %> = <%= result3 %><br>
	<%= val1 %> / <%= val2 %> = <%= result4 %><br>
		
</body>
</html>
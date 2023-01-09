<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,javax.sql.*" %>
<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","scott","tiger");
		pstmt = conn.prepareStatement("select max(custno) from member_tbl_02");
		rs = pstmt.executeQuery();
		
		int custno=100001;
		if(rs.next()) {
			custno=rs.getInt(1) + 1;
		}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
   	header{
   		background-color: blue;
   		width: 100%;
   		text-align: center;
   		color: white;
   		line-height: 100px;
   		height: 100px;
   		padding: 0;
   		margin: 0;
   	}
   	nav{
   		background-color: skyblue;
   		height: 50px;
   		line-height: 50px;
   	}
   	footer{
   		background-color: blue;
   		text-align: center;
   		color: white;
   		height: 100px;
   		line-height: 100px;
   		bottom: 0;
   	}
</style>
<script>
	function checkForm(f) {
		if(f.custname.value.trim() == "") {
			alert("회원성명이 입력되지 않았습니다.");
			f.custname.focus();
			return false;
		}
		if(f.phone.value.trim() =="") {
			alert("회원전화번호가 입력되지 않았습니다.");
			f.phone.focus();
			return false;
		}
		if(f.address.value.trim() == "") {
			alert("회원주소가 입력되지 않았습니다.");
			f.address.focus();
			return false;
		}
		if(f.joindate.value.trim() == ""){
			alert("가입일자가 입력되지 않았습니다.");
			f.joindate.focus();
			return false;
		}
		if(f.grade.value.trim() ==""){
			alert("고객등급이 입력되지 않았습니다.");
			f.grade.focus();
			return false;
		}
		if(f.city.value.trim() ==""){
			alert("도시코드가 입력되지 않았습니다.");
			f.city.focus();
			return false;
		}
	}
</script>
</head>
<body>
<header>
	<h1>쇼핑몰 회원관리 ver 1.0</h1>
</header>
<nav>
	&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="joinForm.jsp">회원등록</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="memberForm.jsp">회원목록조회/수정</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="SaleForm.jsp">회원매출조회</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="index.jsp">홈으로</a>&nbsp;&nbsp;&nbsp;&nbsp;
</nav>
<section>
	<h2 style="text-align: center">홈쇼핑 회원등록</h2>
	<form action="joinProcess.jsp" name="f" method="post" onsubmit="return checkForm(this)">
		<table border="1" style="margin-left: auto; margin-right:auto;">
			<tr>
				<td>회원번호(자동생성)</td>
				<td><input type="text" name="custno" value="<%=custno%>"/></td>
			</tr>
			<tr>
				<td>회원성명</td>
				<td><input type="text" name="custname" /></td>
			</tr>
			<tr>
				<td>회원전화</td>
				<td><input type="text" name="phone" /></td>
			</tr>
			<tr>
				<td>회원주소</td>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td>가입일자</td>
				<td><input type="text" name="joindate" /></td>
			</tr>
			<tr>
				<td>고객등급[A:VIP, B:일반, C:직원]</td>
				<td><input type="text" name="grade" /></td>
			</tr>
			<tr>
				<td>도시코드</td>
				<td><input type="text" name="city" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align:center;">
					<input type="submit" value="등 록"/>
					<input type="button" value="조 회" onclick="location.href='memberForm.jsp'"/>
				</td>
				
			</tr>
		</table>
	</form>
</section>
<footer>
	<p>HRDJOREA Copyright&copy;2016 All right. Human Resources Development Service of Korea</p>
</footer>
</body>
</html>
<% 
	} catch (Exception e) {
	} finally {
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
	}
%>
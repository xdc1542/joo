<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.sql.*, javax.sql.*"%>
<%
	request.setCharacterEncoding("UTF-8");
	String custno = request.getParameter("custno");
	String custname = request.getParameter("custname");
	String phone = request.getParameter("phone");
	String address = request.getParameter("address");
	String joindate = request.getParameter("joindate");
	String grade = request.getParameter("grade");
	String city = request.getParameter("city");
	
	String sql = "update member_tbl_02 set"
			+ " custname=?, phone=?, address=?, joindate=?, grade=?, city=?"
			+ " where custno=?";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "scott", "tiger");
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, custname);
		pstmt.setString(2, phone);
		pstmt.setString(3, address);
		pstmt.setString(4, joindate);
		pstmt.setString(5, grade);
		pstmt.setString(6, city);
		pstmt.setString(7, custno);
		int result = pstmt.executeUpdate();
		
		if(result > 0) {
%>
<script>
	alert("회원수정이 완료되었습니다.");
	history.back();
</script>
<%
	} else {
%>
<script>
	alert("회원수정이 실패했습니다.");
	history.back();
</script>
<%
	}}catch(Exception e) {
		
	} finally {
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
	}
%>
<%@page import="java.sql.DriverManager"%>
<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String custno = request.getParameter("custno");
	String custname = request.getParameter("custname");
	String phone = request.getParameter("phone");
	String address = request.getParameter("address");
	String joindate = request.getParameter("joindate");
	String grade = request.getParameter("grade");
	String city = request.getParameter("city");
	
	String sql = "insert into member_tbl_02 values(?, ?, ?, ?, ?, ?, ?)";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "scott", "tiger");
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, custno);
		pstmt.setString(2, custname);
		pstmt.setString(3, phone);
		pstmt.setString(4, address);
		pstmt.setString(5, joindate);
		pstmt.setString(6, grade);
		pstmt.setString(7, city);
		int result = pstmt.executeUpdate();
		
		if(result > 0) {
%>
<script>
	alert("회원등록이 완료되었습니다.");
	history.back();
</script>
<%		} else { %>
<script>
	alert("회원등록이 실패했습니다.");
	history.back();
</script>
<%
} } catch(Exception e) {
} finally{
	if(pstmt != null) pstmt.close();
	if(conn != null) conn.close();
}
%>

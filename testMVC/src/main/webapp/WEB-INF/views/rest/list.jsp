<%@page import="dvided.divided.googlecheck_Simple_Origin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
function buttonClick(bt){
	alert("호재 덧냐")
}
</script>
<body>
<%googlecheck_Simple_Origin go=new googlecheck_Simple_Origin(); %>

<input type="button" onclick="buttonClick(this)">
</body>
</html>
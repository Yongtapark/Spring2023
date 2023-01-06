<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js">
</script>
<script type="text/javascript">
$(function(){
	$('#btnOk').click(function(){
		$('#restform').attr('action',$('#_method').val());
		$('#restform').submit();
	});
});
</script>
</head>
<body>
<h1>${msg}</h1>
<form action="action" id="restform">
		<select id="_method">
			<option value="get">get</option>
			<option value="post">post</option>
			<option value="put">put</option>
			<option value="delete">delete</option>
		</select> <input type="button" value="확인" id="btnOk">
	</form>
</body>
</html>
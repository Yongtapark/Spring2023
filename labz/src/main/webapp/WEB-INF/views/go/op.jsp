<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dvided.divided.googlecheck_Simple_Origin" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%googlecheck_Simple_Origin go=new googlecheck_Simple_Origin(); 
go.check();%>
<body>

온라인	: <%=go.resultList()%><br>
인원		: <%=go.resultList_size()%><br><br>
오프라인	: <%=go.resultOffline()%><br>
인원		: <%=go.resultOffline_size() %><br><br>
캠 on	: <%=go.resultCamon()%><br>
인원 		: <%=go.resultCamon_size() %><br><br>
캠 off	: <%=go.resultOffline()%><br>
인원		: <%=go.resultOffline_size() %><br><br>

		
</body>
</html>
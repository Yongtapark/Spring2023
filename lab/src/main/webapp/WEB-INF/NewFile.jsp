<%@page import="java.io.PrintWriter"%>
<%@page import="io.opentelemetry.exporter.logging.SystemOutLogRecordExporter"%>
<%@page import="Lab.googlecheck_Simple_window_open"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="google.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
googlecheck_Simple_Origin go = new googlecheck_Simple_Origin();
go.check();

%>

구글 체커<br><br><br>


<%try{ %>
<div style="green">
현재 온라인 : <%=go.resultList()%><br>
    총<%=go.resultList().size()%>명<br><br>
</div>
현재 오프라인 : <%=go.resultOffline()%><br>
    총<%=go.resultOffline().size()%>명<br><br>
현재 캠on : <%=go.resultCamon()%><br>
    총<%=go.resultCamon().size()%>명<br><br>
현재 캠off : <%=go.resultCamoff()%><br>
	총<%=go.resultCamoff().size()%>명<br><br>
<%}catch(Exception e){%>
	없음
	<% }%>



</body>
</html>
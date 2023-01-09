<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="empUpdateAction" method="post">
<input type="hidden" name="empno" id="empno" value="${empVO.empno}">
<table border="1">
<caption>사원수정</caption>
<tr>
	<td>이름</td>
	<td><input type="text" name="ename" value="${empVO.ename}"></td>
</tr>

<tr>
	<td>급여</td>
	<td><input type="text" name="sal" value="${empVO.sal}"></td>
</tr>

<tr>
	<td>부서</td>
	<td>
	<select name="deptno">
	<c:forEach items="${deptList}" var="dept">
	<option value="${dept.deptno}" selected>
	<c:if test="${dept.deptno==deptVO.deptno}">selected</c:if>
	${dept.dname}
	</option>
	</c:forEach>
	</select>
	</td>
</tr>
</table>
<br>
<input type="submit" value="수정">
</form>
</body>
</html>
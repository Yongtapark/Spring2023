<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function confirm_delete() {
	var yn=confirm("정말로 삭제?");
	if(yn){
		location.href="empDlete?empno="+empno;
	}
}
</script>
</head>
<body>
<table border="1">
<caption>사원리스트</caption>
<tr>
<td>사원번호</td>
<td>이름</td>
<td>급여</td>
<td>부서이름</td>
<td>액션</td>
</tr>
<c:forEach items="${empList}" var="emp">
<tr>
<th>${emp.empno}</th>
<th>${emp.ename}</th>
<th>${emp.sal}</th>
<th>${emp.deptVO.dname}</th>
<th>
<a href="empUpdate?empno=${emp.empno}">수정</a>
<a href="#" onclick="javascript:confirm_delete(${emp.empno});">삭제</a>

</th>
</tr>
</c:forEach>
<tr>
	<td colspan="5">전체급여합계:${totalSal}</td>
</tr>

</table>
<br>
<a href="empInsert">사원추가</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
	<c:when test="${!empty listDTO }">
		<table align="center" border="1">
			<tr>
				<th>EMP.NO</th>
				<th>EMP.NAME</th>
				<th>EMP.JOB</th>
				<th>EMP.SAL</th>
			</tr>
			<c:forEach var="emp" items="${listDTO}">
				<tr>
					<td>${emp.empNo}</td>
					<td>${emp.empName}</td>
					<td>${emp.empJob}</td>
					<td>${emp.empSal}</td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1>Details Not Found</h1>
	</c:otherwise>
</c:choose>
<br>
<br>
<a href="index.htm">home</a>
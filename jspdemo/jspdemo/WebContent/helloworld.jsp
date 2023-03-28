<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>TABLES</title>
</head>
<body>
	
 		<h1>Create Table</h1>
		<h2>
			<a href="<%=request.getContextPath()%>/new">Add New Table</a>
			&nbsp;&nbsp;&nbsp; <a href="<%=request.getContextPath()%>/list">List
				All Tables</a>

		</h2>
	
	<div align="center">
		<table border="1" cellpadding="5">
			<caption>
				<h2>List of Tables in database</h2>
			</caption>
			<tr>
				<th>TableName</th>
				
			</tr>
			<c:forEach var="book" items="${List_Table}">
				<tr>
					<td><c:out value="${table.tablename}" /></td>
				
					
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
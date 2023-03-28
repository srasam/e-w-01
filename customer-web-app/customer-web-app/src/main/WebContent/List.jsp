<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>City Table Contents</title>
<link rel="stylesheet" type="text/css"
        href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css" />
</head>
<body>

<h1>City Table</h1>
	
	<table id="table_id" border="1" cellpadding="5">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Country code</th>
					<th>District</th>
					<th>Info</th>
				</tr>
			</thead>
			<c:forEach var="city" items="${listCity}">
				<tr>
					<td><c:out value="${city.id}" /></td>
					<td><c:out value="${city.name}" /></td>
					<td><c:out value="${city.country_code}" /></td>
					<td><c:out value="${city.district}" /></td>
					<td><c:out value="${city.info}" /></td>
					
				</tr>
			</c:forEach>
		</table>
		<script type="text/javascript" charset="utf8"
			src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
		<script type="text/javascript" charset="utf8"
			src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>
		<script>
        $(function () {
            $("#table_id").dataTable();
        });
    </script>
	

</body>
</html>
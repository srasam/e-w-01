<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create a Table in DB</title>
</head>
<body>
	
		<h1>Add Table</h1>
		<form action="TableServlet">
		<table>
				<tbody>
					<tr>
						<td><label>Table name:</label></td>
						<td><input type="text" name="tablename" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Add" class="save" /></td>
					</tr>
</tbody>
			</table>
</body>
</html>
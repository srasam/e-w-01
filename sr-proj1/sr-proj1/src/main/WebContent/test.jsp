<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TEST JSP TABLE PAGE</title>
</head>
<body>
<h1>Add Table</h1>
		<form action="">
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
			<br>
			</form>
			<br></br>
		<h2>List of Tables in DB</h2>
<%
Connection jdbcConnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore?enabledTLSProtocols=TLSv1.2","root","root");
DatabaseMetaData databaseMetaData = jdbcConnection.getMetaData();

String [] types= {"TABLE"};
ResultSet resultSet=databaseMetaData.getTables(null,null, "%", types);%>
<TABLE BORDER="1">
      <TR>
      <TH>Table Name</TH>
       </TR>
       <% while(resultSet.next()){ %>
      <TR>
       <TD> 
       <%= resultSet.getString("TABLE_NAME") %>
       </td>
         </TR>
         <%} %>
         </TABLE>
</body>
</html>
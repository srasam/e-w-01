<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>DataBase Tables</title>
</head>

<body>
	<form action="new" method="POST">
	
		Table Name: <input type="text" name="table_name"> <br /> 
		<input type="submit" value="create table" />
	</form>
<%@page import="java.util.ArrayList"%>      <%--Importing all the dependent classes--%>
<%@page import="jspdemo.TableDao"%>
<%@page import="java.util.Iterator"%> 

<% ArrayList<TableDao> tableList = (ArrayList)request.getAttribute("List_Table");%> <%--Assigning ArrayList object containing Employee data to the local object --%>

<strong><a href="<%=request.getContextPath()%>/TableServlet">Show Table </a></strong>
<br></br>

<table cellspacing="2" cellpadding="2">

<tr><th>Table Name</th>
<%
// Iterating through subjectList

if(request.getAttribute("List_Table") != null)  // Null check for the object
{
	Iterator<TableDao> iterator = tableList.iterator();  // Iterator interface
	
	while(iterator.hasNext())  // iterate through all the data until the last record
	{
		TableDao table = iterator.next(); //assign individual employee record to the employee class object
	%>
	<tr>
	<td><%= table.listAllTables()%></td>
		
	</tr>
	<%
	}
}
%>
</table>	
</body>
</html>
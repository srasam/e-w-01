<%@ page import="java.util.*" %>
<html>
<body>
<form action="todo.jsp">
Add items to to-do list: <input type="text" name="addItem"/>
<input type="submit" value="ADD">
</form>

<% 
List<String> items=(List<String>) session.getAttribute("myToDoList");
if(items==null){
	items=new ArrayList<String>();
	session.setAttribute("myToDoList",items);
}

String theItem=request.getParameter("addItem");
if(theItem!=null){
	items.add(theItem);
}

%>
<hr>
<b>TO-DO LIST:</b>
<ol>
<%
for(String temp:items){
out.println("<li>"+temp+"</li>");
}
%></ol>

</body></html>
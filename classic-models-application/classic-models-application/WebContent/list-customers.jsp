<%@ page import="java.util.*, com.classicmodels.app.*" %>
<!DOCTYPE html>
<html>
<head>
<title>Classic Models Application</title>
</head>
<%
//get the customers from the request object(sent by servlet)
List<Customer> theCustomer=(List<Customer>) request.getAttribute("CUSTOMER_LIST");
%>
<body>
<%= theCustomer %>
</body>
</html>
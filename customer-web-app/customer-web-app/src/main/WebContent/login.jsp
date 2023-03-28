<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Web App</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.min.js"
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous"></script>
<script type="text/javascript"
    src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.0/dist/jquery.validate.min.js"></script>

</head>
<body>
<div style="text-align: center">
        <h1>Customer Login</h1>
        <form action="<%=request.getContextPath()%>/login" method="post">
            <table style="with: 100%">
    <tr>
     <td>CustomerName</td>
     <td><input type="text" name="username" /></td>
    </tr>
    <tr>
     <td>CustomerNumner</td>
     <td><input type="password" name="password" /></td>
    </tr>

   </table>
   <input type="submit" value="Submit" />
  </form>
    </div>

</body>
<script type="text/javascript">
 
    $(document).ready(function() {
        $("#loginForm").validate({
            rules: {
                customerName: {
                    required: true,
                    customerName: true
                },
         
                customerNumber: "required",
            },
             
            messages: {
            	customerName: {
                    required: "Please enter customer name",
                    customerName: "Please enter a valid customer name "
                },
                 
                customerNumber: "Please enter customer number"
            }
        });
 
    });
</script>
</html>
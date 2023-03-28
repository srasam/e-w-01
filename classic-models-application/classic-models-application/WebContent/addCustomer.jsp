<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Classic Models Application</title>
</head>
<body>
<center>
        <h1>The Office</h1>
        <h2>
            <a href="/new">Add New Customer</a>
            &nbsp;&nbsp;&nbsp;
            <a href="/list">List All Customers</a>
             
        </h2>
    </center>
    <div align="center">
        <c:if test="${customer != null}">
            <form action="update" method="post">
        </c:if>
        <c:if test="${customer == null}">
            <form action="insert" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    <c:if test="${customer != null}">
                        Edit Customer
                    </c:if>
                    <c:if test="${customer == null}">
                        Add New Customer
                    </c:if>
                </h2>
            </caption>
                <c:if test="${customer != null}">
                    <input type="hidden" name="id" value="<c:out value='${customer.id}' />" />
                </c:if>           
            <tr>
                <th>Customer Name: </th>
                <td>
                    <input type="text" name="title" size="45"
                            value="<c:out value='${customer.customerName}' />"
                        />
                </td>
            </tr>
            <tr>
                <th>First Name:</th>
                <td>
                    <input type="text" name="author" size="45"
                            value="<c:out value='${customer.firstName}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Last Name</th>
                <td>
                    <input type="text" name="price" size="5"
                            value="<c:out value='${customer.lastName}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Phone</th>
                <td>
                    <input type="text" name="price" size="5"
                            value="<c:out value='${customer.phone}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>AddressLine1</th>
                <td>
                    <input type="text" name="price" size="5"
                            value="<c:out value='${customer.addressLine1}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>AddressLine2</th>
                <td>
                    <input type="text" name="price" size="5"
                            value="<c:out value='${customer.addressline2}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>City</th>
                <td>
                    <input type="text" name="price" size="5"
                            value="<c:out value='${customer.city}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>State</th>
                <td>
                    <input type="text" name="price" size="5"
                            value="<c:out value='${customer.state}' />"
                    />
                </td>
            </tr>
             <tr>
                <th>Postal Code</th>
                <td>
                    <input type="text" name="price" size="5"
                            value="<c:out value='${customer.postalCode}' />"
                    />
                </td>
            </tr>
             <tr>
                <th>Country</th>
                <td>
                    <input type="text" name="price" size="5"
                            value="<c:out value='${customer.country}' />"
                    />
                </td>
            </tr>
             <tr>
                <th>Sales Representative Employee Number</th>
                <td>
                    <input type="text" name="price" size="5"
                            value="<c:out value='${customer.salesRepEmployeeNumber}' />"
                    />
                </td>
            </tr>
             <tr>
                <th>Credit Limit</th>
                <td>
                    <input type="text" name="price" size="5"
                            value="<c:out value='${customer.creditLimit}' />"
                    />
                </td>
            </tr>
            
            
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save" />
                </td>
            </tr>
        </table>
        </form>
    </div>
</body>
</html>
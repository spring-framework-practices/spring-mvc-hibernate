<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
    <title>Customer List.</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>

<div id="wrapper">
    <div id="header">
        <h2>Customer list.</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <input type="button" value="Add consumer" onclick="window.location.href='showFormForAdd'; return false;" class="add-button"/>

        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Action</th>
            </tr>
            <c:forEach var="customer" items="${customers}">

                <c:url var="updateLink" value="/customer/showFormForUpdate">
                    <c:param name="customerId" value="${customer.id}"/>
                </c:url>

                <tr>
                    <td>${customer.firstName}</td>
                    <td>${customer.lastName}</td>
                    <td>${customer.email}</td>
                    <td>
                        <a href="${updateLink}">Update</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

</body>
</html>

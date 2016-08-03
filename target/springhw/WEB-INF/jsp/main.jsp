<%--
  Created by IntelliJ IDEA.
  User: codecadet
  Date: 21/07/16
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
    <title>Main</title>
</head>
<body>

<h2>${greeting} ${loggedUser.name}</h2>
<form:form method="post" modelAttribute="loggedUser">
    <input type="submit" value="Logout">
    <p>Name: <form:input path="name"/>Email: <form:input path="mail"/>Password: <form:password path="pass"/></p>
    <input type="submit" value="Add"/>
</form:form>

<table>
    <tr>
        <th>Name</th>
        <th>Mail</th>
        <th>Actions</th>
    </tr>
    <tr>
        <td>
            <label for="name" id="name" class="control-label col-xs-4">${loggedUser.name}</label>
        </td>
        <td>
            <label for="mail" id="mail" class="control-label col-xs-4">${loggedUser.mail}</label>
        </td>
        <td>
            <pre><input type="button" value="Edit"><input type="button" value="Delete"></pre>
        </td>
    </tr>
</table>
</body>
</html>

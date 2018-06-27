<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: grzegorzjarocki
  Date: 18.06.18
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
   <style type="text/css"><%@include file="/resources/static/bootstrap.min.css"%></style>

</head>
<body>
<header class="jumbotron"><h1>Clients</h1></header>
<div class ="container">

    <table class="table table-hover table table-bordered" >


            <th>First name</th>
            <th>Last name</th>
            <th>email</th>
            <th>Action</th>


        <c:forEach items="${clients}" var="client">

            <tr>
                <td>${client.firstName} </td>
                <td>${client.lastName} </td>
                <td>${client.email}</td>
                <td>
                    <button class= "btn btn-primary" onClick="javascript:location.href='add?id=${client.id}'">Edit</button>
                    <%--<button class= "btn btn-primary" onClick="javascript:location.href='confirmDelete?id=${client.id}'">Delete</button>--%>

                </td>
            </tr>
        </c:forEach>

    </table>
    <button class= "btn btn-primary" onClick="javascript:location.href='add'">Add</button>
    <button class= "btn btn-primary" onClick="javascript:location.href='/'">HOME</button>
</div>

<script src="../../../../resources/static/jquery-3.3.1.min.js"></script>
<script src="../../../../resources/static/bootstrap.min.js"></script>
</body>
</html>

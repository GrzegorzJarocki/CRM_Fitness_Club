<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: grzegorzjarocki
  Date: 19.06.18
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css"><%@include file="/resources/static/bootstrap.min.css"%></style>

</head>
<body>
<header class="jumbotron"><h1>FITNESS</h1></header>
<div class ="container">

    <table class="table table-hover table table-bordered" >


        <th>Price</th>
        <th>Start</th>
        <th>Finish</th>
        <th>Client</th>
        <th>Action</th>


        <c:forEach items="${fitnesses}" var="fitness">

            <tr>
                <td>${fitness.finalPrice} </td>
                <td>${fitness.start} </td>
                <td>${fitness.finish}</td>
                <td>${fitness.client.fullName}</td>
                <td>
                    <button class= "btn btn-primary" onClick="javascript:location.href='add?id=${fitness.id}'">Edit</button>
                    <button class= "btn btn-primary" onClick="javascript:location.href='confirmDelete?id=${fitness.id}'">Delete</button>

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

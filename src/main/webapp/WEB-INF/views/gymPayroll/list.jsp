<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: grzegorzjarocki
  Date: 19.06.18
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>

        .error{
            color: #ff0000;
            font-weight: bold;
        }
    </style>
    <style type="text/css"><%@include file="/resources/static/bootstrap.min.css"%></style>
</head>
<body>
<header class="jumbotron"><h1>Gym payroll</h1></header>
<div class ="container">

    <table class="table table-hover table table-bordered" >



    <th>Month</th>
    <th>Gym Instructors</th>
    <th>Action</th>
        <c:forEach items="${gymPayrolls}" var="gp">
    <tr>
        <td> ${gp.month}</td>

        <td>
        <c:forEach items="${gp.gymInstructors}" var="gymInstructors">

               ${gymInstructors.fullName}
            ${gymInstructors.salary}<br/>

    </c:forEach>
        </td>
        <td>
    <button class= "btn btn-primary" onClick="javascript:location.href='add?id=${gp.id}'">Edit</button>
    <%--<button class= "btn btn-primary" onClick="javascript:location.href='confirmDelete?id=${gp.id}'">Delete</button>--%>
        </td>
    </tr>
</c:forEach>
    </table>
<button class= "btn btn-primary" onClick="javascript:location.href='add'">Add</button>
    <button class= "btn btn-primary" onClick="javascript:location.href='/'">HOME</button>
</div>
</body>
</html>
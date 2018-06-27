<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: grzegorzjarocki
  Date: 19.06.18
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css"><%@include file="/resources/static/bootstrap.min.css"%></style>

</head>
<body>
<header class="jumbotron"><h1>Fitness Instructors</h1></header>
<div class ="container">

    <table class="table table-hover table table-bordered" >


        <th>First name</th>
        <th>Last name</th>
        <th>salary</th>
        <th>Action</th>


        <c:forEach items="${fitnessInstructorss}" var="finstructor">

            <tr>
                <td>${finstructor.firstName} </td>
                <td>${finstructor.lastName} </td>
                <td>${finstructor.salary}</td>
                <td>
                    <button class= "btn btn-primary" onClick="javascript:location.href='add?id=${finstructor.id}'">Edit</button>
                    <%--<button class= "btn btn-primary" onClick="javascript:location.href='confirmDelete?id=${finstructor.id}'">Delete</button>--%>

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

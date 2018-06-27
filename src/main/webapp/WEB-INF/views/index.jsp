<%--
  Created by IntelliJ IDEA.
  User: grzegorzjarocki
  Date: 18.06.18
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css"><%@include file="/resources/static/bootstrap.min.css"%></style>
    <style>
        body {
            background-image: url("../../resources/IMG_4383-1.jpg");
            height: 100%;
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;

        }

    </style>
</head>
<body>
<header class="jumbotron"><h1>Administrator panel</h1></header>
<button class= "btn btn-primary" onClick="javascript:location.href='/client/add'">Add Client</button>
<button class= "btn btn-primary" onClick="javascript:location.href='/client/all'">Client list</button>
<button class= "btn btn-primary" onClick="javascript:location.href='/gym/add'">Add Gym pass</button>
<button class= "btn btn-primary" onClick="javascript:location.href='/gym/all'">Show gym passes</button>
<button class= "btn btn-primary" onClick="javascript:location.href='/fitness/add'">Add Fitness pass</button>
<button class= "btn btn-primary" onClick="javascript:location.href='/fitness/all'">Show fitness passes</button>
<button class= "btn btn-primary" onClick="javascript:location.href='/gyminstructors/add'">Add Gym instructor</button>
<br/>
<br/>
<button class= "btn btn-primary" onClick="javascript:location.href='/gyminstructors/all'">Gym instructors list</button>
<button class= "btn btn-primary" onClick="javascript:location.href='/fitnessinstructors/add'">Add Fitness instructor</button>
<button class= "btn btn-primary" onClick="javascript:location.href='/fitnessinstructors/all'">Fitness instructors list</button>
<button class= "btn btn-primary" onClick="javascript:location.href='/gympayroll/add'">Add gym payroll</button>
<button class= "btn btn-primary" onClick="javascript:location.href='/gympayroll/all'">Gym payroll list</button>
<button class= "btn btn-primary" onClick="javascript:location.href='/fitnesspayroll/add'">Add fitness payroll</button>
<button class= "btn btn-primary" onClick="javascript:location.href='/fitnesspayroll/all'">Fitness payroll list</button>
<br/>
<br/>
<button class= "btn btn-primary" onClick="javascript:location.href='/reports'">Reports</button>
</body>
</html>

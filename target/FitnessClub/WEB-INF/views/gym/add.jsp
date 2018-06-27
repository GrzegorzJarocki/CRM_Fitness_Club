<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: grzegorzjarocki
  Date: 19.06.18
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            background-image: url("../../../resources/TEMP-Articles.jpg");
            height: 100%;
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;

        }
        div{
            color: white;
        }
        .error{
            color: #ff0000;
            font-weight: bold;
        }
    </style>
    <style type="text/css"><%@include file="/resources/static/bootstrap.min.css"%></style>
</head>
<body>
<header class="jumbotron"><h1>GYM</h1></header>
<div cssClass="text-center">

    <form:form  cssClass="form-inline" modelAttribute ="gym" method="POST">
        <form:hidden path="id"/><br/>
        Price: 129 zł
        Client: <form:select items="${clients}" path="client" itemValue="id" itemLabel="fullName" />
        <input type="submit" value="Submit"/>
    </form:form>
    <button class= "btn btn-primary" onClick="javascript:location.href='all'">List</button>
    <button class= "btn btn-primary" onClick="javascript:location.href='/'">HOME</button>
</div>
</body>
</html>

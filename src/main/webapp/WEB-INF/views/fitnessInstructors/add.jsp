<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <style>
        body {
            background-image: url("../../../resources/DSC_6893-Edit-BWb.jpg");
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
<header class="jumbotron"><h1>Fitness Instructors</h1></header>
<div cssClass="text-center">
    <form:form  cssClass="form-inline" modelAttribute ="fitnessInstructors" method="POST">
        <form:hidden path="id"/><br/>
        First name: <form:input cssClass="form-control mr-sm-2" path="firstName"/><br/>
        <form:errors path="firstName" element="div" cssClass="error" />
        Last name:<form:input path="lastName"/><br/>
        <form:errors path="lastName" element="div" cssClass="error" />
        Salary per hour:<form:input path="salaryPerHour"/><br/>
        <form:errors path="salaryPerHour" element="div" cssClass="error" />
        Hours: <form:select cssClass="form-control mr-sm-2" path="hours" items="${hours}" /><br/>
        <form:errors path="hours"  element="div" cssClass="error" />
        <input type="submit" value="Submit"/>
    </form:form>
    <button class= "btn btn-primary" onClick="javascript:location.href='all'">List</button>
    <button class= "btn btn-primary" onClick="javascript:location.href='/'">HOME</button>
</div>
</body>
</html>

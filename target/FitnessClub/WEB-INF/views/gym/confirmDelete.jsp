<%--
  Created by IntelliJ IDEA.
  User: grzegorzjarocki
  Date: 19.06.18
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css"><%@include file="/resources/static/bootstrap.min.css"%></style>
</head>
<body>
<header class="jumbotron"><h1>GYM</h1></header>
<h5>Do you really want to delete gym pass with ID ${param.id}?</h5>
<button class= "btn btn-primary" onClick="javascript:location.href='delete?id=${param.id}'">OK</button>
<button class= "btn btn-primary" onClick="javascript:location.href='all'">Cancel</button>
</body>
</html>

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
<h5>Do you really want to delete client with ID ${param.id}?</h5>
<button onClick="javascript:location.href='delete?id=${param.id}'">OK</button>
<button onClick="javascript:location.href='all'">Cancel</button>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: grzegorzjarocki
  Date: 20.06.18
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<header class="jumbotron"><h1>Fitness payroll</h1></header>
<h5>Do you really want to delete fitness payroll with ID ${param.id}?</h5>
<button onClick="javascript:location.href='delete?id=${param.id}'">OK</button>
<button onClick="javascript:location.href='all'">Cancel</button>
</body>
</html>

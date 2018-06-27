<%--
  Created by IntelliJ IDEA.
  User: grzegorzjarocki
  Date: 21.06.18
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css"><%@include file="/resources/static/bootstrap.min.css"%></style>
</head>
<body>
<header class="jumbotron"><h1>Reports</h1></header>
<form class="form-inline" method="post">
    <select name="date1">
        <option value="2018-06-01">Czerwiec</option>
        <option value="2018-07-01">lipiec</option>
        <option value="2018-08-01">Sierpień</option>
    </select>

    <input type="submit" value="Submit">
</form>
<button class= "btn btn-primary" onClick="javascript:location.href='/reports'">REPORTS</button>
<button class= "btn btn-primary" onClick="javascript:location.href='/'">HOME</button>
</body>
</html>

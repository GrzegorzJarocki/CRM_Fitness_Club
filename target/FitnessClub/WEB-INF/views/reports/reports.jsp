<%--
  Created by IntelliJ IDEA.
  User: grzegorzjarocki
  Date: 20.06.18
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css"><%@include file="/resources/static/bootstrap.min.css"%></style>
<style>
    body {
    background-image: url("../../../resources/Sales-Reports.jpg");
        height: 100%;
        background-position: center;
        background-repeat: no-repeat;
        background-size: cover;

    }



    div{
    color: black;
    }</style>

</head>
<body>
<header class="jumbotron"><h1>Reports</h1></header>
<div>
<%--<a href="/reports/1/gympayroll">Płace instruktorów siłowni za lipiec 2018</a><br>--%>
<%--<a href="/reports/1/fitnesspayroll">Płace instruktorów fitness za lipiec 2018</a><br>--%>
<%--<a href="/reports/1/allpayrolls">Płace wszystkich instruktorów za lipiec 2018</a><br>--%>
<%--<a href="/reports/2018-07-01/2018-07-31/gympasses">Przychody z karnetów za siłownie za lipiec 2018</a><br>--%>
<%--<a href="/reports/2018-07-01/2018-07-31/fitnesspasses">Przychody z karnetów za fitness za lipiec 2018</a><br>--%>
<%--<a href="/reports/2018-07-01/2018-07-31/allpasses">Przychody z karnetów za siłownie i fitness za lipiec 2018</a><br>--%>
<%--<a href="/reports/1/2018-07-01/2018-07-31/money">Zysk/Strata za lipiec 2018</a><br>--%>
<%--<a href="/reports/2018-06-01/2018-06-30/2018-07-01/2018-07-31/countgym">Wzrost/spadek liczby klientów siłowni za lipiec 2018</a><br>--%>
<%--<a href="/reports/2018-06-01/2018-06-30/2018-07-01/2018-07-31/countfitness">Wzrost/spadek liczby klientów fitness za lipiec 2018</a><br>--%>
<%--<a href="/reports/2018-06-01/2018-06-30/2018-07-01/2018-07-31/countall">Wzrost/spadek liczby klientów klubu za lipiec 2018</a><br>--%>
<br/>
    <button class= "btn btn-primary btn-block" onClick="javascript:location.href='/reportsgympayroll'">Wybierz raport płac instruktorów siłowni za dany miesiąc</button>
    <button class= "btn btn-primary btn-block" onClick="javascript:location.href='/reportsfitnesspayroll'">Wybierz raport płac instruktorów fitness za dany miesiąc</button>
    <button class= "btn btn-primary btn-block" onClick="javascript:location.href='/reportsallpayroll'">Wybierz raport płac wszystkich pracowników za dany miesiąc</button>
    <button class= "btn btn-primary btn-block" onClick="javascript:location.href='/reportgymincome'">Wybierz przychody ze sprzedaży karnetów na siłownie za dany miesiąc</button>
    <button class= "btn btn-primary btn-block" onClick="javascript:location.href='/reportfitnessincome'">Wybierz przychody ze sprzedaży karnetów na fitness za dany miesiąc</button>
    <button class= "btn btn-primary btn-block" onClick="javascript:location.href='/reportallincome'">Wybierz przychody ze sprzedaży karnetów na siłownie i fitness za dany miesiąc</button>
    <button class= "btn btn-primary btn-block" onClick="javascript:location.href='/reportprofit'">Zysk/Strata w danym miesiącu</button>
    <button class= "btn btn-primary btn-block" onClick="javascript:location.href='/reportgymgrowth'">Wzrost/Spadek liczby klientów siłowni w danym miesiącu</button>
    <button class= "btn btn-primary btn-block" onClick="javascript:location.href='/reportfitnessgrowth'">Wzrost/Spadek liczby klientów fitness w danym miesiącu</button>
    <button class= "btn btn-primary btn-block" onClick="javascript:location.href='/reportallgrowth'">Wzrost/Spadek liczby klientów klubu w danym miesiącu</button>
<br/>


</div>

<button class= "btn btn-primary" onClick="javascript:location.href='../../..'">HOME</button>
</body>
</html>

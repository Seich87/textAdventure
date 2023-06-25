<%@ page import="service.Forms" %>
<%@ page import="service.User" %>
<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 16.06.2023
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/mycss/lose.css" />

    </head>

    <body background="<%=Forms.getBackground()%>">

    <div id="myTitleLose"><h1> <%= Forms.getTitle()%> </h1></div>
    <br/>
    <br/>
    <br/>
    <br/>

    <button id="myButtonLose" type="button" onclick="window.location.href='/hello'">Начать заново игру</button>

    <div class="statistic3" style="position: fixed; top: 520px; left: 1100px">Статистика:<br/>
        IP address: <%= User.getSessionID()%><br/>
        Имя в игре: <%= User.getName()%><br/>
    </div>

    </body>
</html>

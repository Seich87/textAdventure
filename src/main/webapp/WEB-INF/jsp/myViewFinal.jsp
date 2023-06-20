<%@ page import="service.User" %>
<%@ page import="service.Forms" %><%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 20.06.2023
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Моя игра</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

    </head>

    <body>


        <form method="post" action="http://localhost:8080/mySetServlet">
            <div id="myTitle"><h1> <%= Forms.getTitle()%></h1></div>

            <input type="radio" name="selection" value="selection1" checked="checked"/><%= Forms.getText1()%>
            <br/>
            <input type="radio" name="selection" value="selection2"/><%= Forms.getText2()%><br />

            <button type="submit">Ответить</button>
        </form>

        <br/>
        <br/>
        <br/>
        <br/>

        <div>Статистика:<br/>
            IP address: <%= User.getSessionID()%><br/>
            Имя в игре: <%= User.getName()%><br/>
        </div>
    </body>
</html>

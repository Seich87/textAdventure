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
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/mycss/myView.css" />

    </head>

    <body background="<%=Forms.getBackground()%>">


        <form method="post" action="http://localhost:8080/mySetServlet">
            <div id="myTitle" style="width: 750px"><h1> <%= Forms.getTitle()%></h1></div>

            <label class="select2" style="position: fixed; top: 320px; left: 30px">
                <input type="radio" name="selection" value="selection1" checked="checked"/><%= Forms.getText1()%>
                <br/>
                <input type="radio" name="selection" value="selection2"/><%= Forms.getText2()%><br>
            </label>

            <button type="submit" style="position: fixed; top: 382px; left: 35px">Ответить</button>
        </form>

        <br/>
        <br/>
        <br/>
        <br/>

        <div class="statistic2" style="position: fixed; top: 520px; left: 1100px">Статистика:<br/>
            IP address: <%= User.getSessionID()%><br/>
            Имя в игре: <%= User.getName()%><br/>
            Количество игр: <%= session.getAttribute("count")%>
        </div>
    </body>
</html>

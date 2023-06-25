<%@ page import="service.Forms" %>
<%@ page import="service.User" %><%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 17.06.2023
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Путешествие начинается</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/mycss/page2.css" />

    </head>
    <body>

        <p>
        <h1>Собственно та история, из-за которой мы тут все собрались...</h1>
        <br/>
        <br/>
        <br/>
        <h4 style="width: 480px"> После долгих лет путешествий по бескрайнему космосу происходит нечто неординарное.
            Вы видите ослепляюще яркий свет, все приборы корабля начинают отказывать.
            Раздается громкий звук. Ваши члены команды исчезают у вас на глазах. Они просто испарились...
            <br> Вы понимаете, что теряете сознание...
        </h4>
        <br/>
        <br/>
        <%--Кнопка--%>


        <form method="get" action="http://localhost:8080/mySetServlet">
            <button type="submit">Продолжить</button>
        </form>

        <br/>
        <br/>
        <br/>
        <br/>

        <div class="statistic" style="position: fixed; top: 520px; left: 1100px">Статистика:<br/>
             IP address: <%= User.getSessionID()%><br/>
             Имя в игре: <%= User.getName()%><br/>
        </div>

    </body>
</html>

<%@ page import="service.User" %><%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 20.06.2023
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>UserName</title>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

  </head>

  <body>
      <h1>Пролог</h1>
      <h4 style="width: 480px">Ты стоишь в космическом порту и готов подняться на борт
          своего корабля. Разве ты не об этом мечтал? Стать капитаном
          галактического судна с экипажем, который будет совершать
          подвиги под твоим командованием.
          Так что вперед!
      </h4>
      <br/>
      <br/>
      <br/>
      <h1>Знакомство с экипажем</h1>
      <h4>
          Когда ты поднялся на борт корабля, тебя поприветсвовала девушка с черной палкой в руках:
          - Здравтсуйте, командир! Я Зинаида - ваша помощница. Видите? Там в углу пьет кофе
          наш штурман - сержант Перегарный Шлейф, под штурвалом спит наш бортмеханик - Черный Богдан,
          а как обращаться к вам?
      </h4>

      <br/>
      <br/>
      <br/>
      <br/>

      <%
          String insertName;
      if (User.getInsertName() == null) {
          insertName = "";
      } else {
          insertName = User.getInsertName();
      }
      %>

      <div style="color: red"><%= insertName%></div>
      <form method="post" action="http://localhost:8080/userName">
          <label>
              <input type="text" name="name"><br />
          </label>
          <button type="submit">Представиться</button>
      </form>

  </body>
</html>

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
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/mycss/userTest.css" />
  </head>

  <body>
  <p>
  <h1 style="position: fixed; top: 10px; left: 50px">Пролог</h1>
      <h4 style="position: fixed; top: 80px; left: 15px; width: 350px">
          <span>Ты стоишь в космическом порту и готов подняться на борт
              своего корабля.</span><br> <span>Разве ты не об этом мечтал?</span><br> <span>Стать капитаном
          галактического судна с экипажем, который будет совершать
          подвиги под твоим командованием.</span> <br>
          Так что вперед!
      </h4>
      <br/>
      <br/>

      <h1 style="position: fixed; top: 300px; left: 750px">Знакомство с экипажем</h1>

      <h4 style="position: fixed; top: 350px; left: 800px; width: 350px">
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

      <div class="insertName" style="color: red; position: fixed; top: 310px; left: 50px"><%= insertName%></div>
      <form method="post" action="http://localhost:8080/userName">
          <label>
              <input type="text" name="name" style="position: fixed; top: 330px; left: 50px; "><br />
          </label>
          <button type="submit" style="position: fixed; top: 351px;left: 50px">Представиться</button>
      </form>

  </body>
</html>

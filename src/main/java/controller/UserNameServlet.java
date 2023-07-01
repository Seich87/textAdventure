package controller;

import service.Forms;
import service.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/userName")
public class UserNameServlet extends HttpServlet {

    private static String path;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (User.getName().equals("")) {
            User.setInsertName("Необходимо ввести имя!!!");
            path = "WEB-INF/jsp/userTest.jsp";
        } else {
            path = "WEB-INF/jsp/page2.jsp";
        }

        req.getRequestDispatcher(path).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String sessionId = req.getRemoteAddr();
        int count;

        if (Forms.getMap().get(name) == null) {
            Forms.addMap(name, 0);
        }

            count = Forms.getMap().get(name);


        HttpSession session = req.getSession();
        session.setAttribute("count", count + 1);
        Forms.addMap(name, (Integer) session.getAttribute("count"));

        Forms.setTitle("Очнувшись, ты ничего не помнишь...<br>Ты потерял память...<br>Перед тобой огромный летающий каробль.<br>Тебя приглашают подняться.<br>Принять вызов?");
        Forms.setText1("Принять вызов");
        Forms.setText2("Отклонить вызов");
        Forms.setLocation("/mySetServlet");
        Forms.setBackground("/mycss/NLO.jpg");

        User.setName(name);
        User.setSessionID(sessionId);

        doGet(req, resp);
    }
}

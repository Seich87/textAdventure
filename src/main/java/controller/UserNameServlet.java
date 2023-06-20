package controller;

import service.Forms;
import service.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

        Forms.setTitle("Ты потерял память. Принять вызов НЛО?");
        Forms.setText1("Принять вызов");
        Forms.setText2("Отклонить вызов");
        Forms.setLocation("/mySetServlet");


        User.setName(name);
        User.setSessionID(sessionId);

        doGet(req, resp);
    }
}

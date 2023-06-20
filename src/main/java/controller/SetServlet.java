package controller;

import service.Forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/mySetServlet")
public class SetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (Forms.getLocation().equals("/lose")) {
            req.getRequestDispatcher("WEB-INF/jsp/lose.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("WEB-INF/jsp/myViewFinal.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String myTitle = Forms.getTitle();
        String selection = req.getParameter("selection");


        Forms.execute(myTitle, selection);

        doGet(req, resp);
    }
}

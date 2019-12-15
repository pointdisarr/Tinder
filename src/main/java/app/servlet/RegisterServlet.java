package app.servlet;

import app.TemplateEngine;
import app.service.RegisterService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
    private final TemplateEngine te;
    private final RegisterService rs = new RegisterService();

    public RegisterServlet(TemplateEngine te) {
        this.te = te;
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        te.render("register.ftl", resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String pass = req.getParameter("password");
        // =========================
        boolean res = rs.check_register(email, pass);
        // =========================
        PrintWriter w = resp.getWriter();
        if (res) {
            resp.sendRedirect("/login/*");
        } else {
            w.println("ERR");
        }
    }
}

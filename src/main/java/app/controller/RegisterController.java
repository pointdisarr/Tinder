package app.controller;

import app.TemplateEngine;
import app.service.RegisterService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterController extends HttpServlet {
    private final TemplateEngine te;
    private final RegisterService rs = new RegisterService();

    public RegisterController(TemplateEngine te) {
        this.te = te;
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        te.render("register.ftl", resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("inputEmail");
        String pass = req.getParameter("inputPassword");
        // =========================
        boolean res = rs.check_register(email, pass);
        // =========================
        PrintWriter w = resp.getWriter();
        if (res) {
            w.println("OK");
        } else {
            w.println("ERR");
        }
    }
}

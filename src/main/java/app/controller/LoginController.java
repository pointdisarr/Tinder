package app.controller;


import app.TemplateEngine;
import app.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {
    private LoginService loginService = new LoginService();
    private final TemplateEngine te;

    public LoginController(TemplateEngine te) {
        this.te = te;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        te.render("login.ftl", resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      loginService.signIn(req);
    }
}

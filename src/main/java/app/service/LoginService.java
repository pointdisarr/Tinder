package app.service;
import app.entity.Users;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginService {

    public Users signUp()
    public HttpServletResponse signIn(HttpServletRequest req){
          String email = req.getParameter("inputEmail");
          String pass = req.getParameter("inputPassword");


    }

}

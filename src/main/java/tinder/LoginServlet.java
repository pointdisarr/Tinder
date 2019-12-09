package tinder;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {

  private final TemplateEngine te;
  private final Auth auth;

  public LoginServlet(TemplateEngine te, Auth auth) {
    this.te = te;
    this.auth = auth;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    te.render("login.ftl", resp);
  }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String email=req.getParameter("inputEmail");
       String password=req.getParameter("inputPassword");
      try {
        if (auth.check(email,password)){
          resp.sendRedirect("/users/*");
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
}

package tinder;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class MessagesServlet extends HttpServlet {

  private final TemplateEngine te;

  public MessagesServlet(TemplateEngine te) {
    this.te = te;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    te.render("chat.ftl", resp);
  }
}

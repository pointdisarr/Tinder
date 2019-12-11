package app;

import app.controller.*;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * http://localhost:2001/users/
 * http://localhost:2001/liked/
 * http://localhost:2001/login/
 * http://localhost:2001/messages/
 */
public class Application {
    public static void main(String[] args) throws Exception {
        TemplateEngine te = TemplateEngine.resources("/templates");
        ServletContextHandler handler = new ServletContextHandler();

        handler.addServlet((new ServletHolder(new StaticContentServlet("content"))), "/static/*");
        handler.addServlet((new ServletHolder(new UserController(te))), "/users/*");
        handler.addServlet((new ServletHolder(new LikedController(te))), "/liked/*");
        handler.addServlet((new ServletHolder(new MessagesController(te))), "/messages/*");
        handler.addServlet((new ServletHolder(new LoginController(te))), "/login/*");
        Server server = new Server(2001);
        server.setHandler(handler);
        server.start();
        server.join();
    }

}

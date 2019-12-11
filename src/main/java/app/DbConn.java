package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {

  private static Connection conn;

  public static Connection get() throws SQLException {
    if (conn == null) {
      conn = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/",
          "root",
          ""
      );
    }
    return conn;
  }
}

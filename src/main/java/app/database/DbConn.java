package app.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {

  private static Connection conn;

  public static Connection get() throws SQLException {
    String s;
    if (conn == null) {
      conn = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/",
          "root",
          "root"
      );
    }
    return conn;
  }
}

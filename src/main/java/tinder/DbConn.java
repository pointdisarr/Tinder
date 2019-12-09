package tinder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {

  private static Connection conn;

  public static Connection get(){
    if (conn == null) {
      try {
        conn = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/postgres",
            "postgres",
            "123456"
        );
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return conn;
  }
}

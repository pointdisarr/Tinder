package app.DAO;

import app.database.DbConn;
import app.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOUser implements DAO<User> {

    List<User> users = new ArrayList<User>();
    String email;
    String pass;

    @Override
    public User get(int id) {
        try {
            Connection conn = DbConn.getConnection();
            PreparedStatement st = conn.prepareStatement("SELECT email, pass from users where userId=id");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                email = rs.getString(id);
                pass = rs.getString(id);
            }
        } catch (SQLException se) {
            throw new IllegalArgumentException("DAO<User>, get method sql error", se);
        }
        return new User(email, pass);
    }

    @Override
    public List<User> getAll() {
        try {
            Connection conn = DbConn.getConnection();
            PreparedStatement st = conn.prepareStatement("SELECT * from users");
            ResultSet rs = st.executeQuery();
            if (rs != null) {
                rs.absolute(1);
            }
            do {
                email = rs.getString("email");
                pass = rs.getString("pass");
            }
            while (rs.next());
            users.add(new User(email, pass));
        } catch (SQLException se) {
            throw new IllegalArgumentException("DAO<User>, get method sql error", se);
        }
        return users;
    }
    @Override
    public void put(User o) {
        try {
            Connection conn = DbConn.getConnection();
            PreparedStatement st = conn.prepareStatement("INSERT INTO users (email, pass) VALUES  (?, ?)");
            st.setString(1, o.getEmail());
            st.setString(2, o.getPassword());
            st.execute();
        } catch(SQLException se) {
            throw new IllegalArgumentException(" DAO<User>, put method sql error", se);
        }
    }

    @Override
    public void delete(int id) {
        throw new IllegalArgumentException("DAO<User>:delete hasn't implemented");
    }
}

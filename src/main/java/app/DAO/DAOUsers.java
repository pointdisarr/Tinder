package app.DAO;

import app.database.DbConn;
import app.database.DbOpsUser;
import app.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DAOUsers implements DAO<User> {
    DbOpsUser dbUsers = new DbOpsUser();

    @Override
    public User get(int id) {
        throw new IllegalArgumentException("DAO<User>:get() hasn't implemented");
    }

    @Override
    public List<User> getAll() {
        throw new IllegalArgumentException("DAO<User>:getAll hasn't implemented");
    }

    @Override
    public void put(User o) {
        try {
            Connection conn = DbConn.get();
            PreparedStatement st = conn.prepareStatement("INSERT into users (name, pass) VALUES  (?, ?)");
            st.setString(1, o.getEmail());
            st.setString(2, o.getPassword());
            st.execute();
        } catch (SQLException se) {
            throw new IllegalArgumentException("SMTH went wrong", se);
        }
    }

    @Override
    public void delete(int id) {
        throw new IllegalArgumentException("DAO<User>:delete hasn't implemented");
    }
}

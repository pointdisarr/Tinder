package tinder.model;


import tinder.DbConn;
import tinder.UserBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements Dao<UserBean> {

    private Connection connection= DbConn.get();

    public UserDao(){
    }

    @Override
    public void store(UserBean entity) {

    }

    @Override
    public void update(UserBean entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<UserBean> all() throws SQLException {
        List<UserBean> user=new ArrayList<>();
        String sql = "select * from users";
        PreparedStatement ps;
        ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            user.add(new UserBean(rs.getInt("id"),
                    rs.getString("email"),
                    rs.getString("password")));
        }
        return user;
    }
}

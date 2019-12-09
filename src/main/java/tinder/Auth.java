package tinder;




import tinder.model.UserDao;


import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;


class Auth {

    private UserDao users = new UserDao();
    boolean check(String email, String password) throws SQLException {
        if (users.all()!=null){
            List<UserBean> collect = users.all().stream().filter(userBean -> userBean.getEmail().equals(email) && userBean.getPassword().equals(password)).collect(Collectors.toList());
         return collect.isEmpty();

        }
        return true;
    }
    }

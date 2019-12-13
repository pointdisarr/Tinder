package app.service;

import app.DAO.DAOUsers;
import app.entity.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class RegisterService {
    DAOUsers daoUsers = new DAOUsers();
    PrintWriter writer;

    public boolean check_register(String email, String pass ) throws IOException {
        List<User> all = daoUsers.getAll();
        boolean found = false;
        for (User u: all) {
            if (u.getEmail().equals(email)) {
                found = true;
                break;
            }
        }
        if (!found) {
            daoUsers.put(new User(email, pass));
            return true;
        }
        return false;
    }
}

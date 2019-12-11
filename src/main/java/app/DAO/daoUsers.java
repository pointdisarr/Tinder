package app.DAO;

import app.entity.Users;

import java.util.ArrayList;
import java.util.List;

public class daoUsers implements DAO {
    List<Users> usersList = new ArrayList<Users>();

    @Override
    public Object get(int id) {
        return usersList.get(id);
    }

    @Override
    public List getAll() {
        return usersList;
    }

    @Override
    public void put(Object o) {
        usersList.add((Users) o);
    }

    @Override
    public void delete(int id) {
        usersList.remove(id);
    }
}

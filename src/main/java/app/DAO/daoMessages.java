package app.DAO;

import app.entity.Messages;

import java.util.ArrayList;
import java.util.List;

public class daoMessages implements DAO {
    List<Messages> messages = new ArrayList<>();

    @Override
    public Object get(int id) {
        return messages.get(id);
    }

    @Override
    public List getAll() {
        return messages;
    }

    @Override
    public void put(Object o) {
        messages.add((Messages) o);
    }

    @Override
    public void delete(int id) {
        messages.remove(id);
    }
}

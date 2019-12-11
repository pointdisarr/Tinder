package app.DAO;

import app.entity.Profile;

import java.util.ArrayList;
import java.util.List;

public class daoProfile implements DAO {
    List<Profile> profiles = new ArrayList<>();
    @Override
    public Object get(int id) {
        return profiles.get(id);
    }

    @Override
    public List getAll() {
        return profiles;
    }

    @Override
    public void put(Object o) {
        profiles.add((Profile) o);
    }

    @Override
    public void delete(int id) {
        profiles.remove(id);
    }
}

package app.DAO;

import app.entity.Liked;

import java.util.ArrayList;
import java.util.List;

public class daoLiked implements DAO {
    List<Liked> likedList = new ArrayList<Liked>();

    @Override
    public Object get(int id) {
        return likedList.get(id);
    }

    @Override
    public List getAll() {
        return likedList;
    }

    @Override
    public void put(Object o) {
        likedList.add((Liked) o);
    }

    @Override
    public void delete(int id) {
        likedList.remove(id);
    }
}

package tinder.model;


import tinder.UserBean;

import java.sql.SQLException;
import java.util.List;
import java.util.function.Predicate;

public interface Dao<T> {
    void store(T entity);
    void update(T entity);
    void delete(int id);
    List<T> all() throws SQLException;
}

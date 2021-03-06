package data.service;

import data.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(long id);
    void save(User user);
    void remove(long id);

    void update(long id, User user);
}

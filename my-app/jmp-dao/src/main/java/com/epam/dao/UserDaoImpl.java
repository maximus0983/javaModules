package com.epam.dao;

import com.epam.api.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {
    private List<User> users = new ArrayList<>();

    @Override
    public User create(String name, String surname, LocalDate birthday) {
        var user = new User(name, surname, birthday);
        user.setId(users.size());
        users.add(user);
        return user;
    }

    @Override
    public User modify(User user) {
        var userDb = getById(user.getId());
        User modifyUser = null;
        if (userDb.isPresent()) {
            modifyUser = userDb.get();
            modifyUser.setName(user.getName());
            modifyUser.setSurname(user.getSurname());
            modifyUser.setBirthday(user.getBirthday());
        }
        return modifyUser;
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    private Optional<User> getById(long id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }
}

package com.epam.dao;

import com.epam.api.User;

import java.time.LocalDate;
import java.util.List;

public interface UserDao {

    User create(String name, String surname, LocalDate birthday);

    User modify(User user);

    List<User> getAll();
}

package com.example.user_crud_boot.service;


import com.example.user_crud_boot.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    void delete(Long id);

    User getUser(Long id);
}

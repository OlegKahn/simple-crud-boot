package com.example.user_crud_boot.service;

import com.example.user_crud_boot.dao.UserDao;
import com.example.user_crud_boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;


    @Autowired
    ApplicationContext applicationContext;


    @Override
    public void add(User user) {
//        userDao.add(user);
        userDao.save(user);
    }


    @Override
    public List<User> listUsers() {
//        return userDao.listUsers();
        return userDao.findAll();
    }


    @Override
    public void delete(Long id) {
//        userDao.delete(id);
        userDao.deleteById(id);
    }


    @Override
    public User getUser(Long id) {
//        return userDao.getUser(id);
        User user = null;
        Optional<User> optional = userDao.findById(id);
        if (optional.isPresent()) {
            user = optional.get();
        }
        return user;
    }
}

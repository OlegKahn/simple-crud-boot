package com.example.user_crud_boot.dao;

import com.example.user_crud_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {


}

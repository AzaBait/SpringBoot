package com.example.springboot.dao;

import com.example.springboot.entity.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers ();
    User getById(Long id);
    void save(User user);
    void delete(Long id);
    void update(User user);
}

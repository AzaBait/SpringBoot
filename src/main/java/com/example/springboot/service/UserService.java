package com.example.springboot.service;

import com.example.springboot.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void save(User user);
    Object getById(Long id);
    void update(User user);
    void delete(Long id);
    List<User> getAllUsers();
}

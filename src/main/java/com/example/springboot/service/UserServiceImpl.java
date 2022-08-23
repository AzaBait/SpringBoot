package com.example.springboot.service;

import com.example.springboot.entity.User;
import com.example.springboot.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService{

    private UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public Optional<User> getById(Long id) {
        return userRepo.findById(id);
    }

    @Override
    public void update(User user) {
        userRepo.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}

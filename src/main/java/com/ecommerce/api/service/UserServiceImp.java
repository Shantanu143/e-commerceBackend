package com.ecommerce.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.api.model.User;
import com.ecommerce.api.repositories.UserRepositories;


@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserRepositories userRepositories;

    @Override
    public User createUser(User user) {
        return userRepositories.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepositories.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepositories.findById(id).orElse(null);
    }

    @Override
    public void deleteUser(int id) {
        userRepositories.findById(id).ifPresent(userRepositories::delete);
    }

    @Override
    public User updateUser(User user, int id) {

        return userRepositories.findById(id).map(oldUser -> {
            oldUser.setId(id);
            return userRepositories.save(user);
        }).orElse(null);

    }

}

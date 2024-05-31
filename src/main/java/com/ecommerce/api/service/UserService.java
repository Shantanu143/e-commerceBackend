package com.ecommerce.api.service;

import java.util.List;

import com.ecommerce.api.model.User;

public interface UserService {

    User createUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);

    void deleteUser(int id);

    User updateUser(User user , int id);

}

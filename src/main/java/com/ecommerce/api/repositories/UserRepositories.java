package com.ecommerce.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.api.model.User;

public interface UserRepositories extends JpaRepository<User, Integer>{

}

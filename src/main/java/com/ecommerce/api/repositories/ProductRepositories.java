package com.ecommerce.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.api.model.Product;

public interface ProductRepositories extends JpaRepository<Product, Integer>{

}

package com.ecommerce.api.service;

import java.util.List;

import com.ecommerce.api.model.Product;

public interface ProductService {

    Product createProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(int id);

    void deleteProduct(int id);

    Product updateProduct(Product product, int id);

}

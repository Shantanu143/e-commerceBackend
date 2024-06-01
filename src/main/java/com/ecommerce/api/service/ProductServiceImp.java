package com.ecommerce.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.api.model.Product;
import com.ecommerce.api.repositories.ProductRepositories;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    ProductRepositories productRepositories;

    @Override
    public Product createProduct(Product product) {
        return productRepositories.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepositories.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return productRepositories.findById(id).orElse(null);

    }

    @Override
    public void deleteProduct(int id) {
        productRepositories.findById(id).ifPresent(productRepositories::delete);
    }

    @Override
    public Product updateProduct(Product product, int id) {
        return productRepositories.findById(id).map(oldProduct -> {
            oldProduct.setId(id);
            return productRepositories.save(product);
        }).orElse(null);
    }

}

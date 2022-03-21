package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> displayAllProduct();

    int findIndexById(int id);

    Product findProductById(int id);

    void createProduct(Product product);

    void editProduct(int id, Product product);

    void deleteProduct(int  id);
}

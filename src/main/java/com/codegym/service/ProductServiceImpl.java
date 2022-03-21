package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private static List<Product> products;

    static {
        products = new ArrayList<>();
        products.add(new Product(1, "Iphone 13 Pro Max", 1500, "New", "webapp/WEB-INF/img/13PM.jpg"));
        products.add(new Product(2, "Iphone 13 Pro", 1300, "New", "webapp/WEB-INF/img/13P.jpg"));
        products.add(new Product(3, "Samsung S22 Ultra", 1500, "New", "webapp/WEB-INF/img/s22ultra.jpg"));
    }

    @Override
    public List<Product> displayAllProduct() {
        return products;
    }

    @Override
    public int findIndexById(int id) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public Product findProductById(int id) {
        int index = findIndexById(id);
        if (index != -1) {
            return products.get(index);
        }
        return null;
    }

    @Override
    public void createProduct(Product product) {
        products.add(product);
    }

    @Override
    public void editProduct(int id, Product product) {
        int index = findIndexById(id);
        products.set(index, product);
    }

    @Override
    public void deleteProduct(int id) {
        int index = findIndexById(id);
        products.remove(index);
    }
}

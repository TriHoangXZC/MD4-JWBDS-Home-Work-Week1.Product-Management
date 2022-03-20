package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ModelAndView displayAllProduct() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Product> products = productService.displayAllProduct();
        modelAndView.addObject("products", products);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateProductForm() {
        ModelAndView modelAndView = new ModelAndView("create");
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createProduct(int id, String name, double price, String description, String image){
        ModelAndView modelAndView = new ModelAndView("redirect:/products");
        Product product = new Product(id, name, price, description, image);
        productService.createProduct(product);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditProductForm(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        Product product = productService.findProductById(id);
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @PostMapping("/edit/{id}")
    public ModelAndView editProduct(@PathVariable int id, String name, double price, String description, String image) {
        ModelAndView modelAndView = new ModelAndView("redirect:/products");
        Product product = new Product(id, name, price, description, image);
        productService.editProduct(id, product);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteProductForm(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("delete");
        Product product = productService.findProductById(id);
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @PostMapping("/delete/{id}")
    public ModelAndView deleteProduct(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/products");
        Product product = productService.findProductById(id);
        productService.deleteProduct(product);
        return modelAndView;
    }
}

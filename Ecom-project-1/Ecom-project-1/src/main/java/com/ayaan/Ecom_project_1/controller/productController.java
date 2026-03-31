package com.ayaan.Ecom_project_1.controller;

import com.ayaan.Ecom_project_1.model.Product;
import com.ayaan.Ecom_project_1.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class productController {
    @Autowired
    private productService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }
}

package com.example.spring_web_tut_1.Controller;

import com.example.spring_web_tut_1.Model.Product;
import com.example.spring_web_tut_1.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {

   @Autowired
    ProductServices services;

   @RequestMapping("/products")
    public List<Product> getProducts() {
        return services.getProduct();
    }

    @RequestMapping("/products/{productId}")
    public Product getProductById( @PathVariable int productId) {
       return services.getProductById(productId);
    }

    @PostMapping("/products")
    public String addProduct( @RequestBody Product product) {
        services.addProduct(product);
        System.out.println(product);
        return "Added product successfully";
    }
}

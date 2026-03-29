package com.example.spring_web_tut_1.Services;

import com.example.spring_web_tut_1.Model.Product;
import com.example.spring_web_tut_1.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductServices {
    @Autowired
    ProductRepo repo;
//    List<Product> products= new ArrayList<>( Arrays.asList(
//            new Product(101,"Iphone",50000),
//            new Product(102,"Camera",60000)
//    ));

    public List<Product> getProduct() {
        return repo.findAll();
    }

    public Product getProductById(int productId) {
       return repo.findById(productId).orElse(null);
    }

    public void addProduct(Product product){
       repo.save(product);
    }

    public void updateProduct(Product product) {
       repo.save(product);
        }

    public void deleteProduct(int product) {
       repo.deleteById(product);
    }
}

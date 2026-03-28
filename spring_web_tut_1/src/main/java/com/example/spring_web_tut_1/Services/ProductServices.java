package com.example.spring_web_tut_1.Services;

import com.example.spring_web_tut_1.Model.Product;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductServices {

    public Product getProductById;
    List<Product> products= new ArrayList<>( Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Camera",60000)
    ));

    public List<Product> getProduct() {
        return products;
    }

    public Product getProductById(int productId) {
       return products.stream()
               .filter(p -> p.getProductId() == productId )
               .findFirst().orElse(null);
    }

    public void addProduct(Product product){
        products.add(product);
    }
}

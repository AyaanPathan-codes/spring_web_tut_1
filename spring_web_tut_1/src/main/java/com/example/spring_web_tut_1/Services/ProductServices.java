package com.example.spring_web_tut_1.Services;

import com.example.spring_web_tut_1.Model.Product;

import java.util.Arrays;
import java.util.List;

public class ProductServices {

    List<Product> products= Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Camera",60000)
    );

    public List<Product> getProductList() {
        return products;
    }
}

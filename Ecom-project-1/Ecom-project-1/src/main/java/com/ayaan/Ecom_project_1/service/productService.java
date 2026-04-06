package com.ayaan.Ecom_project_1.service;

import com.ayaan.Ecom_project_1.model.Product;
import com.ayaan.Ecom_project_1.repository.ProductData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productService {
    @Autowired
   private ProductData repo;
    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product addProduct(Product product) {
        return repo.save(product);
    }

    public Product updateProduct(Product product) {
        return repo.save(product);
    }

    public void deleteProduct(Integer id) {
        repo.deleteById(id);
    }

    public Product getProductById(Integer id) {
        return repo.findById(id).orElse(
                null
        );
    }
}

package com.ayaan.Ecom_project_1.service;

import com.ayaan.Ecom_project_1.model.Product;
import com.ayaan.Ecom_project_1.repository.ProductData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class productService {
    @Autowired
   private ProductData repo;
    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
        product.setPrice(product.getPrice());
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

    public Product updateProduct(int id, MultipartFile imageFile, Product product) throws IOException {
        product.setImageData(imageFile.getBytes());
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        return repo.save(product);

    }
}

package com.example.configureswagger.service;

import com.example.configureswagger.entity.Product;
import com.example.configureswagger.entity.ResponseMessage;
import com.example.configureswagger.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {

    @Autowired(required = false)
    ProductRepository productRepository;

    public List<Product> getProducts() {
        List<Product> productList = productRepository.findAll();
        return productList;
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

//    public Product addProduct(Product product) {
//        Product response = productRepository.save(product);
//        return productRepository.findById(Long.valueOf(response.getId())).get();
//    }

    public Product addProduct(Product product) {
        long size = productRepository.count();
        Long newId = size + 1;
        Product saveProduct = new Product(newId, product.getName(), product.getDescription(), product.getStock(), product.getPrice());
        productRepository.save(saveProduct);
        return productRepository.findById(newId).get();
    }

    public Product updateProduct(Product product) {
        productRepository.save(product);
        return productRepository.findById(product.getId()).get();
    }

    public ResponseMessage deleteProduct(Long id) {
        productRepository.deleteById(id);
        return new ResponseMessage("Product Deleted");
    }
}

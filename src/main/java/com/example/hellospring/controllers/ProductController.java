package com.example.hellospring.controllers;

import com.example.hellospring.model.Product;
import com.example.hellospring.repository.ProductRepository;
import com.example.hellospring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private ProductService productService;

    @Autowired
    ProductController(ProductService productService){
        this.productService = productService;
    }


    @PutMapping // пут запрос по /продукту
    public Product saveProduct(@RequestParam(value="name") String name, @RequestParam(value="category") String category) {
        return productService.save(name, category);
    }


}

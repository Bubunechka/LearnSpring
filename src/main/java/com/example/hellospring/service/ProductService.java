package com.example.hellospring.service;

//TODO: Сервис будет обрабатывать GET запросы для /greeting, дополнительно - параметр name в строке запроса.
// GET запрос должен возвращать ответ со статусом 200 OK и JSON в теле, которое соответствует сообщению приветствия
// Для модели представления создаем класс, представляющий ресурс:

import com.example.hellospring.model.Product;
import com.example.hellospring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService{

    private ProductRepository productRepository;

    @Autowired
    ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Product save(String name, String category){
        Product product = new Product(name, category);
        return productRepository.save(product);
    }


}

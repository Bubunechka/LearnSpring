package com.example.hellospring.repository;

import com.example.hellospring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product getProductsById(Long id);

    Product save(Product product); // mtnjl

}

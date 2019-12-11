package com.stiick.stockback.repository;

import com.stiick.stockback.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProductRepository extends MongoRepository<Product, String> {

}

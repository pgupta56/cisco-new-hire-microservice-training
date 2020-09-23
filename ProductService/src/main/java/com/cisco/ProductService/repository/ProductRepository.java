package com.cisco.ProductService.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.cisco.ProductService.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{
	public Product findByItem(String Item);
}
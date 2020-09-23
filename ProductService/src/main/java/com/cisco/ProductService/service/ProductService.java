package com.cisco.ProductService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.ProductService.model.Product;
import com.cisco.ProductService.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	// 1.Create operation
	public Product create(int id, String item, int count) {
		return productRepository.save(new Product(id, item, count));
	}

	// 2.Retrieve operation - All
	public List<Product> getAll() {
		return productRepository.findAll();
	}

	// 3.Retrieve operation - Specific
	public Product getByItem(String item) {
		return productRepository.findByItem(item);
	}

	// 4.Update operation
	public Product update(int id, String item, int count) {
		Product p = productRepository.findByItem(item);
		p.setId(id);
		p.setItem(item);
		p.setCount(count);
		return productRepository.save(p);
	}

	// 5.Delete all operation
	public void deleteAll() {
		productRepository.deleteAll();
	}

	// 6.Delete a Specific Person
	public void delete(String item) {
		Product p = productRepository.findByItem(item);
		productRepository.delete(p);
	}

}
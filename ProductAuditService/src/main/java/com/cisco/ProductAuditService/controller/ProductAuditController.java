package com.cisco.ProductAuditService.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.ProductAuditService.client.ProductAuditFeignClient;
import com.cisco.ProductAuditService.model.Product;

@RestController
public class ProductAuditController {

	@Autowired
	private ProductAuditFeignClient productServiceClient;

	@GetMapping("/audit-products")
	public Collection<Product> auditItems() {
		return productServiceClient.readItems()
				.stream().filter(this::isGreat).collect(Collectors.toList());
	}

	private boolean isGreat(Product product) {
		return product.getCount() > 500;
	}

}

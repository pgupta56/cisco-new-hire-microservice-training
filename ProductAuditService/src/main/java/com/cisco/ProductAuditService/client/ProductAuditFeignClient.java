package com.cisco.ProductAuditService.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.cisco.ProductAuditService.model.Product;

@FeignClient("product-service")
public interface ProductAuditFeignClient {

    @GetMapping("/getAll")
    List<Product> readItems();
}
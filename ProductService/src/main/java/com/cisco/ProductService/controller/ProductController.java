package com.cisco.ProductService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.ProductService.model.Product;
import com.cisco.ProductService.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/create")
	public String create(@RequestParam int id, @RequestParam String item, @RequestParam int count) {
		Product p = productService.create(id, item, count);
		return "Product Created ="+p.getId()+" "+p.getItem()+" "+p.getCount();
	}

	@RequestMapping("/get")
	public Product getItem(@RequestParam String item) {
		return productService.getByItem(item);
	}

	@RequestMapping("/getAll")
	public List<Product> getAll() {
		return productService.getAll();
	}

	@RequestMapping("/update")
	public String update(@RequestParam int id, @RequestParam String item, @RequestParam int count) {
		Product p = productService.update(id, item, count);
		return p.toString();
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam String item) {
		productService.delete(item);
		return "Deleted " + item;
	}

	@RequestMapping("/deleteAll")
	public String deleteAll() {
		productService.deleteAll();
		return "Deleted all records";
	}

}
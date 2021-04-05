package com.ojas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.model.Product;
import com.ojas.services.ProductService;

@RestController
@RequestMapping("/rest/product")
public class ProductController {
	
	@Autowired
	ProductService pserv;
	
	@PostMapping("/createProduct")
	public Product insertProduct(@RequestBody Product product) {
		return pserv.insertProduct(product);
	}
	
}

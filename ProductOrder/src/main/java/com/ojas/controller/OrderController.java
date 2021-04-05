package com.ojas.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.model.Order;
import com.ojas.model.Product;
import com.ojas.services.OrderServices;
import com.ojas.services.ProductService;

@RestController
@RequestMapping("/rest/product")
public class OrderController {
	@Autowired
	OrderServices oserv;
	
	@Autowired
	ProductService pserv;
	
	@PostMapping("/order")
	public Order createOrder(@RequestBody Order order) {
		return oserv.createOrder(order);
	}
	
	@GetMapping("/orderlist")
	public Iterable<Order> getAll() {
		return oserv.getAll();
	}
	@GetMapping("/get")
	public Optional<Order> getByID(@RequestParam("id") Integer id) {
		return oserv.getByID(id);
	}
	@GetMapping("/checkproduct") 
	public Optional<Product> checkProduct(@RequestParam("id") Integer id) {
		return pserv.checkProduct(id);
	}
	
	@GetMapping("/checkproducts")
	public Iterable<Product> checkProducts() {
		return pserv.checkProducts();
	}
	@GetMapping("/update/{id}&quantity/{quantity}")
	public Optional<Order> updateOrder(@RequestParam("id") Integer id,@RequestParam Integer quanti) {
		return oserv.getByID(id);
	}
	
}

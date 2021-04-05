package com.ojas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.dao.ProductDao;
import com.ojas.model.Order;
import com.ojas.model.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductDao pdao;
	
	public Product insertProduct(Product product) {
		return pdao.save(product);
	}

	public Optional<Product> checkProduct(Integer pid) {
		Optional<Product> result = null ;
		Optional<Product> productid = pdao.findById(pid);
		if (productid != null) {
			result = pdao.findById(pid);
		} else {
			result = pdao.findById(pid);
		}
		return result;
	}
	
	public Iterable<Product> checkProducts() {
		return pdao.findAll();
	}
}

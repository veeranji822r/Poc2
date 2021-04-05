package com.ojas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ojas.dao.OrderDao;
import com.ojas.dao.ProductDao;
import com.ojas.model.Order;
import com.ojas.model.Product;

@Service
public class OrderServices {
	@Autowired
	OrderDao odao;

	@Autowired
	ProductDao pdao;

	public Order createOrder(Order order) {
		return odao.save(order);
	}

	public Iterable<Order> getAll() {
		return odao.findAll();
	}

	public Optional<Order> getByID(Integer id) {
		return odao.findById(id);
	}
//	public Optional<Order> updateOrder(Integer oid,Integer quantity) {
//		return odao.
//	}
}

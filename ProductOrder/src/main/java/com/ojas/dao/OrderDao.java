package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.model.Order;

public interface OrderDao extends JpaRepository<Order, Integer> {

}

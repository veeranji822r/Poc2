package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.model.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}

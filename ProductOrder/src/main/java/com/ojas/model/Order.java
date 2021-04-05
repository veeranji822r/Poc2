package com.ojas.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orderinfo")
public class Order {
	@Id
	@Column(name="oid")
	private int id;
	@Column(name="odate")
	private Date date;
	@Column(name="quantity")
	private int quantity;
	@Column(name="omodified")
	private int ordermodified;
	@Column(name="oproduct")
	@OneToMany(cascade=CascadeType.ALL)
	private List<Product> product;
	public Order() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getOrdermodified() {
		return ordermodified;
	}
	public void setOrdermodified(int ordermodified) {
		this.ordermodified = ordermodified;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
}

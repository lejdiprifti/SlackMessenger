package com.transit.model;

public class OrderModel {

	public OrderModel() {

	}

	private Long id;
	private String customer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "OrderModel [id=" + id + ", customer=" + customer + "]";
	}

}

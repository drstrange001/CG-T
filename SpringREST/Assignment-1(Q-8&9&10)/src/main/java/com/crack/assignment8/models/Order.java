package com.crack.assignment8.models;

import java.util.Date;
import java.util.List;

public class Order {
	private int id;
	private float total;
	private Date date; 
	private Customer customer;
	private List<LineItem> items;

	public Order(int id, float total, Date date, Customer customer, List<LineItem> items) {
		super();
		this.id = id;
		this.total = total;
		this.date = date;
		this.customer = customer;
		this.items = items;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void setItems(List<LineItem> items) {
		this.items = items;
	}

}

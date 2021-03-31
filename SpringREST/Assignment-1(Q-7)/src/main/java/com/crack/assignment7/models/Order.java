package com.crack.assignment7.models;

public class Order {

	private int id;
	private int quantity;
	private String itemName;
	private double price;
	private String address;

	public Order(int id, int quantity, String itemName, double price, String address) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.itemName = itemName;
		this.price = price;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


}

package com.crack.assignment8.models;

public class Product {
	private int id;
	private String name;
	private float cost;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.cost = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return cost;
	}

	public void setPrice(float price) {
		this.cost = price;
	}

}

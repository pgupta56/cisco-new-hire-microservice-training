package com.cisco.ProductAuditService.model;

public class Product {

	private int id;

	private String item;

	private int count;

	public Product(int id, String item, int count) {
		super();
		this.id = id;
		this.item = item;
		this.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
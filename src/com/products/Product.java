package com.products;

import com.productFactories.ProductFactory;

public abstract class Product {
	protected String name;
	protected double price;
	protected Boolean imported;
	protected int quantity;
	protected double costWithTax;
	
	public Product() {
		// TODO Auto-generated constructor stub
		this.name = "";
		this.price = 0.0;
		this.imported = false;
		this.quantity = 0;
		this.costWithTax = 0.0;
	}

	public Product(String name, double price, Boolean imported, int quantity) {
		super();
		this.name = name;
		this.price = price * quantity;
		this.imported = imported;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Boolean isImported() {
		return imported;
	}

	public void setImported(Boolean imported) {
		this.imported = imported;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCostWithTax() {
		return costWithTax;
	}

	public void setCostWithTax(double costWithTax) {
		this.costWithTax = costWithTax;
	}

	@Override
	public String toString() {
		return (quantity +" "+ toString(imported) + " " + name + " : " + costWithTax);
	}
	
	public String toString(boolean imported) {
		if(imported == false)
			return "";
		else
			return "imported";
	}
	
	public abstract ProductFactory getFactory();
	public abstract double getTax(String country);
}

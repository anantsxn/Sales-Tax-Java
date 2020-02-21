package com.billingdomain;

import java.util.*;

import com.products.Product;

public class Reciept {
	private List<Product> productList;
	private double totalSalesTax;
	private double totalAmount;
	
	public Reciept(List<Product> prod, double tax, double amount){
		productList = prod;
		totalSalesTax = tax;
		totalAmount = amount;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public double getTotalSalesTax() {
		return totalSalesTax;
	}

	public void setTotalSalesTax(double totalSalesTax) {
		this.totalSalesTax = totalSalesTax;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public int getTotalNumberOfItems() {
		return productList.size();
	}
	
	@Override
	public String toString() {
		String receipt = "";
		for(Product p: productList)
			receipt += (p.toString() + "\n");
		
		receipt += "Total Sales Tax = " + totalSalesTax + "\n";
		receipt += "Total Amount = " + totalAmount + "\n";
		
		return receipt;
	}
	
}

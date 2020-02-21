package com.shopdomain;

import java.util.ArrayList;
import java.util.List;

import com.products.Product;

public class ShoppingCart {
	private List<Product> productList;

	public ShoppingCart() {
		productList = new ArrayList<Product>();
		// TODO Auto-generated constructor stub
	}
	
	public void addItemToCart(Product product) {
		productList.add(product);
	}
	
	public List<Product> getItemFromCart(){
		return productList;
	}
	
	public int getCartSize() {
		return productList.size();
	}
}

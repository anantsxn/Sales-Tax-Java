package com.productFactories;

import com.products.BookProduct;

public class BookProductFactory extends ProductFactory{

	@Override
	public BookProduct createProduct(String name, double price, boolean imported, int quantity) {
		// TODO Auto-generated method stub
		return new BookProduct(name, price, imported, quantity);
	}
	
}

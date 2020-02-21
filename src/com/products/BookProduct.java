package com.products;

import com.productFactories.BookProductFactory;
import com.productFactories.ProductFactory;
import com.taxCalculations.LocalTaxValues;

public class BookProduct extends Product {

	public BookProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookProduct(String name, double price, Boolean imported, int quantity) {
		super(name, price, imported, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProductFactory getFactory() {
		// TODO Auto-generated method stub
		return new BookProductFactory();
	}

	@Override
	public double getTax(String country) {
		// TODO Auto-generated method stub
		if(country == "Local")
			return LocalTaxValues.BOOK_TAX.getTax();
		else
			return 0;
	}
	
}

package com.products;

import com.productFactories.FoodProductFactory;
import com.taxCalculations.LocalTaxValues;

public class FoodProduct extends Product {

	public FoodProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodProduct(String name, double price, Boolean imported, int quantity) {
		super(name, price, imported, quantity);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public FoodProductFactory getFactory() {
		return new FoodProductFactory();
	}

	@Override
	public double getTax(String country) {
		// TODO Auto-generated method stub
		if(country == "Local")
			return LocalTaxValues.FOOD_TAX.getTax();
		else
			return 0;
	}
	
	
}

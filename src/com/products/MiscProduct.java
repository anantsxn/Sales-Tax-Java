package com.products;

import com.productFactories.MiscProductFactory;
import com.productFactories.ProductFactory;
import com.taxCalculations.LocalTaxValues;

public class MiscProduct extends Product {

	
	
	public MiscProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MiscProduct(String name, double price, Boolean imported, int quantity) {
		super(name, price, imported, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProductFactory getFactory() {
		// TODO Auto-generated method stub
		return new MiscProductFactory();
	}

	@Override
	public double getTax(String country) {
		// TODO Auto-generated method stub
		if(country == "Local")
			return LocalTaxValues.MISC_TAX.getTax();
		else
			return 0;
	}
	
}

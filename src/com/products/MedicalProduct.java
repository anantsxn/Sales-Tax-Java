package com.products;

import com.productFactories.MedicalProductFactory;
import com.productFactories.ProductFactory;
import com.taxCalculations.LocalTaxValues;

public class MedicalProduct extends Product {

	
	
	public MedicalProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedicalProduct(String name, double price, Boolean imported, int quantity) {
		super(name, price, imported, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProductFactory getFactory() {
		// TODO Auto-generated method stub
		return new MedicalProductFactory();
	}

	@Override
	public double getTax(String country) {
		// TODO Auto-generated method stub
		if(country == "Local")
			return LocalTaxValues.MEDICAL_TAX.getTax();
		else
			return 0;
	}
	
}

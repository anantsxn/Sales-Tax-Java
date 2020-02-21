package com.productFactories;

import com.products.MiscProduct;

public class MiscProductFactory extends ProductFactory{
	@Override
	public MiscProduct createProduct(String name, double price, boolean imported, int quantity) {
		return new MiscProduct(name, price, imported, quantity);
	}
}

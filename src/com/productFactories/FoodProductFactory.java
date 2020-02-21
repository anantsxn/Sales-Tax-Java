package com.productFactories;

import com.products.FoodProduct;

public class FoodProductFactory extends ProductFactory {
	@Override
	public FoodProduct createProduct(String name, double price, boolean imported, int quantity) {
		return new FoodProduct(name, price, imported, quantity);
	}
}

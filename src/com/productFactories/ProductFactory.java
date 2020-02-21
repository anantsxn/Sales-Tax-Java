package com.productFactories;
import com.products.Product;

public abstract class ProductFactory {
	public abstract Product createProduct(String name, double price, boolean imported, int quantity);
}

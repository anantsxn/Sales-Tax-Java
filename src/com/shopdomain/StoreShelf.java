package com.shopdomain;

import java.util.*;
import com.products.*;

public class StoreShelf {
	private HashMap<String, Product> productItems;
	
	public StoreShelf() {
		productItems = new HashMap<String, Product>();
		addProductItemsToShelf("book", new BookProduct());
		addProductItemsToShelf("music CD" , new MiscProduct());
		addProductItemsToShelf("chocolate bar", new FoodProduct());
		addProductItemsToShelf("box of chocolates" , new FoodProduct());
		addProductItemsToShelf("bottle of perfume", new MiscProduct());
		addProductItemsToShelf("packet of headache pills", new MedicalProduct());
	}
	
	public void addProductItemsToShelf(String productItem, Product productCategory) {
		productItems.put(productItem, productCategory);
	}
	
	public Product searchAndRetrieveItemFromShelf(String name, double price, boolean imported, int quantity) {
		Product productItem = productItems.get(name).getFactory().createProduct(name, price, imported, quantity);
		return productItem;
	}
	
	public int getShelfSize() {
		return productItems.size();
	}
}

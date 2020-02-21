package com.shopdomain;

import java.util.Scanner;

import com.billingdomain.PaymentCounter;
import com.billingdomain.Reciept;
import com.products.Product;

public class ShoppingStore {
	private ShoppingCart sc;
	private StoreShelf ss;
	private PaymentCounter pc;
	private Scanner input;
	String country;
	
	public ShoppingStore() {
		country = "Local";
		sc = new ShoppingCart();
		ss = new StoreShelf();
		pc = new PaymentCounter(country);
		input = new Scanner(System.in);
	}
	
	public void getSalesOrder() {
		do {
			String name = getProductName();
			double price = getProductPrice();
			boolean imported = isProductImported();
			int quantity = getQuantity();
			retrieveOrderAndPlaceInCart(name, price, imported, quantity);
		}while(isAddAnotherProduct());
	}

	public void retrieveOrderAndPlaceInCart(String name, double price, boolean imported, int quantity) {
		// TODO Auto-generated method stub
		Product product = ss.searchAndRetrieveItemFromShelf(name, price, imported, quantity);
		sc.addItemToCart(product);
	}
	
	public void checkOut() {
		pc.billItemsInCart(sc);
		Reciept receipt = pc.getReceipt();
		pc.printReceipt(receipt);
	}
	
	public String getProductName() {
		System.out.println("Enter Product Name: \n");
		return input.nextLine();
	}
	
	public double getProductPrice() {
		System.out.println("Enter Product Price: \n");
		while(!(input.hasNextDouble())) {
			System.out.println("Invalid price. Enter a number.");
		}
		return input.nextDouble();
	}
	
	public boolean isProductImported() {
		System.out.println("Is product imported or not? (Y/N): \n");
		while(!(input.hasNext())) {
			System.out.println("Invalid input. Enter(Y/N):");
		}
		char ans = input.next().charAt(0);
		boolean imported = parseBoolean(ans);
		return imported;
	}
	
	public int getQuantity() {
		System.out.println("Enter the quantity: \n");
		while(!(input.hasNextInt())) {
			System.out.println("Invalid input. Enter an integer:");
		}
		return input.nextInt();
	}
	
	public boolean isAddAnotherProduct() {
		System.out.println("Do you want another product? (Y/N):");
		while(!(input.hasNext())) {
			System.out.println("Invalid input. Enter (Y/N):");
		}
		char ans = input.next().charAt(0);
		boolean addAnotherProduct = parseBoolean(ans);
		input.nextLine();
		return addAnotherProduct;
	}
	
	public boolean parseBoolean(char value) {
		boolean flag = true;
		boolean boolValue = false;
		
		while(flag) {
			if(value == 'Y' || value == 'y') {
				boolValue = true;
				flag = false;
			}
			else if(value == 'N' || value == 'n') {
				boolValue = false;
				flag = false;
			}
			else {
				System.out.println("Invalid input. Enter (Y/N)");
			}
		}
		return boolValue;
	}
	
	public ShoppingCart getCart() {
		return sc;
	}
	
	public PaymentCounter getPaymentCounter() {
		return pc;
	}
}

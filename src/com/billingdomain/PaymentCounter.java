package com.billingdomain;

import java.util.List;

import com.products.Product;
import com.shopdomain.ShoppingCart;
import com.taxCalculations.ITTaxCalculator;
import com.taxCalculations.TaxCalculatorFactory;

public class PaymentCounter {
	private Biller b1;
	private Reciept receipt;
	private List<Product> productList;
	private String country;
	
	public PaymentCounter(String country) {
		this.country = country;
	}
	
	public void billItemsInCart(ShoppingCart cart) {
		productList = cart.getItemFromCart();
		for(Product p: productList) {
			b1 = getBiller(country);
			
			double productTax = b1.calculateTax(p.getPrice(), p.getTax(country), p.isImported());
			
			double taxedCost = b1.calcTotalProductCost(p.getPrice(), productTax);
			
			p.setCostWithTax(taxedCost);
		}
	}
	
	public Reciept getReceipt() {
		double totalTax = b1.calcTotalTax(productList);
		double totalAmount = b1.calcTotalAmount(productList);
		receipt = b1.createNewReceipt(productList, totalTax, totalAmount);
		return receipt;
	}
	
	public void printReceipt(Reciept receipt) {
		b1.generateReceipt(receipt);
	}
	
	public Biller getBiller(String strategy) {
		TaxCalculatorFactory factory = new TaxCalculatorFactory();
		ITTaxCalculator taxCalc = factory.getTaxCalculator(strategy);
		return new Biller(taxCalc);
	}
}

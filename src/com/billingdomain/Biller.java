package com.billingdomain;

import java.util.List;

import com.products.Product;
import com.taxCalculations.ITTaxCalculator;
import com.taxCalculations.MathHelper;

public class Biller {
	ITTaxCalculator taxCalculator;
	
	public Biller(ITTaxCalculator taxCalc) {
		taxCalculator = taxCalc;
	}
	
	public double calculateTax(double price,double tax, boolean imported) {
		double totalProductTax = taxCalculator.calculateTax(price, tax, imported);
		return totalProductTax;
	}
	
	public double calcTotalProductCost(double price, double tax) {
		return MathHelper.truncate(price + tax);
	}
	
	public double calcTotalTax(List<Product> prodList) {
		double totalTax = 0.0;
		
		for(Product p: prodList) {
			totalTax += (p.getCostWithTax() - p.getPrice());
		}
		return MathHelper.truncate(totalTax);
	}
	
	public double calcTotalAmount(List<Product> prodList) {
		double totalAmount = 0.0;
		
		for(Product p: prodList)
			totalAmount += p.getCostWithTax();
		
		return MathHelper.truncate(totalAmount);
	}
	
	public Reciept createNewReceipt(List<Product> productList, double totalTax, double totalAmount) {
		return new Reciept(productList, totalTax, totalAmount);
	}
	
	public void generateReceipt(Reciept r) {
		String receipt = r.toString();
		System.out.println(receipt);
	}
}

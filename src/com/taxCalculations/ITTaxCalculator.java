package com.taxCalculations;

public interface ITTaxCalculator {
	public double calculateTax(double price, double tax, boolean imported);
}

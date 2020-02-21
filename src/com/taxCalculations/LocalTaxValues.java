package com.taxCalculations;

public enum LocalTaxValues implements ITTaxValues {
	BOOK_TAX(0.0),
	FOOD_TAX(0.0),
	MEDICAL_TAX(0.0),
	MISC_TAX(0.0);
	
	private double itemTaxValue;
	
	private LocalTaxValues(double taxValue) {
		itemTaxValue = taxValue;
	}
	
	public double getTax() {
		return itemTaxValue;
	}
}

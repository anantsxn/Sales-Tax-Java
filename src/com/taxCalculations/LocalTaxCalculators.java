package com.taxCalculations;

public class LocalTaxCalculators implements ITTaxCalculator {
	@Override
	public double calculateTax(double price, double localTax, boolean imported) {
		double tax = price * localTax;
		if(imported == true)
			tax += (price * 0.05);
		tax = MathHelper.roundoff(tax);
		return tax;
	}
}

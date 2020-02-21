package com.taxCalculations;

import java.util.HashMap;

public class TaxCalculatorFactory {
	private HashMap<String, ITTaxCalculator> taxCalculators;
	
	public TaxCalculatorFactory() {
		taxCalculators = new HashMap<String, ITTaxCalculator>();
		registerInFactory("Local", new LocalTaxCalculators());
	}
	
	public void registerInFactory(String strategy, ITTaxCalculator taxCalc) {
		taxCalculators.put(strategy, taxCalc);
	}
	
	public ITTaxCalculator getTaxCalculator(String strategy) {
		ITTaxCalculator taxCalc = (ITTaxCalculator)taxCalculators.get(strategy);
		return taxCalc;
	}
	
	public int getFactorySize() {
		return taxCalculators.size();
	}
}

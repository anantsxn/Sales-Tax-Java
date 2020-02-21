package com.taxCalculations;

import java.text.DecimalFormat;

public class MathHelper {
	private static final double ROUND_OFF = 0.05;
	
	public static double roundoff(double value) {
		return (int)(value / ROUND_OFF + 0.5) * 0.05;
	}
	
	public static double truncate(double value) {
		String result = new DecimalFormat("0.00").format(value);
		return Double.parseDouble(result);
	}
}

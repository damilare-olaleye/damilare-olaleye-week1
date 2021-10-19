package com.revature.utils;

public class MathUtility { // The Math utility class contains methods that are useful to perform math operations

	// This method is used to compute exponents
	// for example 2^4 = 2 * 2 * 2 * 2
	public static int power(int base, int exponent) {
		int result = 1;
		for(int i = 1; i <= exponent; i++) {
			result *= base;
		}
		
		return result;
	}
	
	public static double calculateCirlceArea(double radius) {
		return 3.14159 * radius * radius;
	}
}

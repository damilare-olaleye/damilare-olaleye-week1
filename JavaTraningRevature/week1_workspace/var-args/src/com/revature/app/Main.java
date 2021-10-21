package com.revature.app;

public class Main {

	public static void main(String... args) { // ... is what is known as var-args
		// The purpose of var-args is to have the ability to provide an arbitary number of parameters (of a particular type)
		System.out.println("Hello " + args[0] + " " + args[1]);
		
		// This case will be using the overloaded getSum method with 2 double parameters
		System.out.println(getSum(10, 320));
		
		// These 3 cases below will all be using the overloaded getSum method with var-args
		System.out.println(getSum(1.1,1,2,1.3,1.3));
//		System.out.println(getSum());
//		System.out.println(getSum(10.5));
	}
	
	public static double getSum(double a, double b) {
		System.out.println("getSum with 2 double invoked");
		
		return a + b; 
	}
	
	// Two rules for var-args
	// 	1. var-args must go at the end of the parameter list
	//	2. You can only have one var-arg for a parameter
	
	public static double getSum(double d1, double d2, double... numbers) { //double... numbers is a var-arg parameter
		// The numbers variable that is defined in the paramenter of this method
		// The numbers variable is a reference variable to a double array
		
		System.out.println("getSum with var-args invoked");
		
		double sum = 0;
		sum += d1;
		sum += d2;
		
		for(double num : numbers) {
			sum += num;
		}
		
		return sum;
	}

}

package com.revature.app;

import com.revature.utils.MathUtility;

import model.Square;

public class Main {
	
	/*
	 * Variable scopes
	 * 
	 * 1. Class scope (sometimes known as global scope): any field that has the static keyword is class scoped. This means the variable belongs to the class itself. 
	 * 2. Instance scope: any field that is non-static (does not have the static keyword) is instance scoped. This means that every single instance has its own copy of this variable
	 * 3. Method scope: any variable that is declared inside of a method is method scoped. This means that you can only access this variable within that particular method, and the variable.
	 * 		is destroyed whenever the method is done executing. (this method exists within the stack frame).
	 * 4.) Block scope: within methods, we can have different code blocks (if statements blocks, for loops, while loops, etc.) Variables that are declared inside of those blocks are only available. 
	 */

	public static void main(String[] args) {

		Main.aStaticMethod();
		aStaticMethod(); // Because aStaticMehtod is in the same class as where we are invoking the method, we do not need to reference the <Class name>.<method name()>

		int results = MathUtility.power(2, 4); // power is an example of a static method that we can access from another class
		System.out.println("2 to the power of 4 is " + results);
		
		double area = MathUtility.calculateCirlceArea(5);
		System.out.println("area of a circle with radius 5 is " + area);
		
		Square s1 = new Square(5);
		Square s2 = new Square(10);
		Square s3 = new Square(15);
		
		System.out.println("numberOfInstances =" + Square.numberOfInstances); // Because numberOfInstances is a static variable, it belongs to the Square class itself.
		
		
		Square.numberOfInstances = 10000;
		
		System.out.println(s1.numberOfInstances);
		System.out.println(s2.numberOfInstances);
		System.out.println(s3.numberOfInstances);
	}
	
	public static void aStaticMethod() {
		System.out.println("Invoked aStaticMethod");
	}

}

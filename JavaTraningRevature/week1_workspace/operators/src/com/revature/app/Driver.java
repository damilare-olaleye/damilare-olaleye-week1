package com.revature.app;


public class Driver {
	
	public static void main(String[] args) {
		/*
		 * Binary Arithmetic Operators
		 * 
		 *  +: Addition
		 *  -: Subtraction
		 *  *: Multiplication
		 *  %: Modulus (get the remainder when dividing, ex. 5 % 2 = 1)
		 */
		
		// /: Division
		
		int x = 10;
		int mySum = x + 20;
		System.out.println(mySum);
		
		int myDifference = mySum - 25;
		System.out.println("myDifference " + myDifference);
		
		int myProduct = mySum * 2;
		System.out.println("myProduct " + myProduct);
		
		// division 
		int numerator = 16;
		int denominator = 5;
		System.out.println("numerator / denominator: " + (numerator / denominator)); //this will print out a single digit since numerator or denominator is not a double
		
		//Modulus
		int myReminder = 5 % 2;
		System.out.println("myReminder: " + myReminder);
		
		/*
		 * 
		 * Numeric promotion
		 * 
		 * When we are dealing with binary operator (+, -, /, *, %), we have this concept of numeric promotion
		 * 
		 * 1. Primitive variable will be promoted to the widest operand.
		 * 2. If all operands are narrower than int, they will all be promoted to int.
		 */
		
		System.out.println(10.23 / 4); // double  / int -> double / double = double
		System.out.print(3.14159f / 3); // float / int -> float / float = float.
		
		byte byte1 = 10;
		byte byte2 = 3;
		
		byte myByte = (byte) (byte1 + byte2); // byte + byte -> int + int  = int
		System.out.println("myByte " + myByte);
		
		/*
		 * Comparison operators
		 * 
		 * How we compare values
		 * 
		 * == equals
		 * != not equals
		 * > greater than
		 * < less than
		 * >= grater than or equal to
		 * <= less than or equal to
		 * 
		 * Comparison operators take two operands and evaluate to a boolean
		 * 
		 */
		
		int z = 10;
		System.out.println(z > 0);
		System.out.println(z < 0);
		System.out.println(z != 0);
		System.out.println(z == 0);
		System.out.println(z <= 0);
		System.out.println(z >= 0);
		
		/*
		 * Logical operators
		 * 
		 * <operand> <operators> <operand>
		 * 
		 * The operands should be booleans
		 * 
		 * &&: AND (binary)
		 * ||: OR (binary)
		 * !:  NOT (single operand)
		 * 
		 * 
		 */
		getTrue();		
			
	}
	
	public static boolean getTrue() {
		System.out.println("getTrue() invked");
		return true;
	}
	
	public static boolean getfalse() {
		System.out.println("getfalse() invked");
		return false;
	}

}

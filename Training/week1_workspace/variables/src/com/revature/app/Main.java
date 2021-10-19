package com.revature.app;

public class Main {
	
	/*
	 * Variables
	 * 
	 * What types of variables do we have in Java?
	 * 
	 * 1. Primitive variables
	 * 2. reference variables
	 * 
	 * What types of primitive variables do we have?
	 *  1. int
	 *  2. double 
	 *  3. boolean
	 *  4. char
	 *  5. float 
	 *  6. long
	 *  7. byte
	 *  8. short
	 *  
	 *  3 Overarching primitive types: 
	 *  	1. boolean
	 *  	2. integral types (byte, short, char, int, long)
	 *  	3. floating types (float, double)
	 *  
	 *  1. boolean: technically 1 bit, JVM dependent (sometimes the JVM allocates, for example 8 bits, but in reality you just need 1 bit)
	 *  2. byte: 8 bites (bits are the smallest units of data that can be either 0 or 1). Bye has a range from -128 to 127 (integral types)
	 *  3. short: 16 bits. -32768 to 32767. (integral types)
	 *  4. char: 16 bits. 0 to 65535. Typically not used to store numbers. (integral types)
	 *  5. int: 32 bits. (integral types)
	 *  6. long: 64 bits. (integral types)
	 *  7. float: 32 bits. (floating point types)
	 *  8. double: 64 bits. (floating point types)
	 *  
	 */

	public static void main(String[] args) {
		/*
		 * Integral Types
		 */
		
		// 8 bits
		byte myByte = 10; // Variable declaration
		System.out.println("myByte = " + myByte);
		
		byte anotherByte = 10; // Initialization = the initial assignment of a value to a local variable. 
		
		System.out.println("anotherByte = " + anotherByte);
		
		
		// 16 bits
		short myShort = 25_767; // _  is used for readability cannot be used at the beginning or at the end
		
	}

}

package com.revature.app;

public class Driver {

	public static void main(String[] args) {
		// String an object whose role is to provide a structure for a  sequence of character
		String s1 = "Hello world";
		
		char[] myCharacter = {'H', 'e', 'l','l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
		String s2 = new String(myCharacter);
		
		System.out.println("s1" + s1);
		System.out.println("s2" + s2);
		
		System.out.println("s1 == s2: " + (s1 == s2));
		
		// we are using the s1 String object's instance method, equals() to compare values of different String object
		System.out.println("s1.equals(s2): " + (s1.equals(s2))); // true, because these two String objects have the same underlying value.
		
		// concat() method: used to add two strings together
		String s3 = "Hello";
		String s4 = "world"; 
		s3 = s3.concat(s4);// String are immutable, means that they cannot be changed.
		// the concat method in other words will create a new String object, and you then need to point to that new String object
		System.out.println(s3);
		
		System.out.println("Hello" + (" world") == (s3)); // false
		System.out.println("Hello" + (" world") == "Hello world"); // true
		
		System.out.println(s3);
		s3 = s3.replace('l', 'x'); // s3 is now pointing to the object that was created by s3.replace('l', 's')
		System.out.println(s3);
		
		/*
		 * Commonly used String methods
		 * 
		 * The big difference between String instance methods and instance methods of  most other classes (including the ones we create ourselves) is that String instance methods
		 * DO NOT modify the properties of the String object itself.
		 * 
		 * Why? Because Strings are IMMUTABLE. You CANNOT change the value of a String object one it has been created
		 * 
		 * So, methods such as concat or replace do not modify the exisiting String object. They instead create a new String object in the regular heap.
		 * 
		 * API (Application Programming Interface):
		 * We commonly refer to the String class and its associated methods as the "String API"
		 * An API, is a collection of routins/sub-routines/methods/backend interface that:
		 * 	1. Takes in an input
		 * 	2. Returns an output 
		 * 
		 */
		
		// String concat(String str)
		// boolean startsWith(String str)
		// boolean endsWith(String str)
		// boolean contains(String str)
		// char charAt(int index)
		// boolean matches(String regex)
		// String substring(int beginIndex)
		// String substring(int beginIndex, int endIndex) (endIndex is non-inclusive)
		// String[] split(Strings regex)
		
		String s5 = "Hello, world, my, name, is , Dammy";
		String[] myStrings = s5.split(", ");
		
		for(int i = 0; i < myStrings.length; i++) {
			System.out.println(myStrings[i]);
		}
	}

}

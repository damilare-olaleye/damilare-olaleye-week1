package com.revature.app;

public class Application {

	public static void main(String[] args) {
		/*
		 * 
		 * Casting is the conversion from one type to another
		 * 
		 * Remember that we have two different types of variables
		 * 1. Primitive variables
		 * 2. reference variables
		 * 
		 * This means, we also have 2 different types of casting:
		 * 1. Widening/narrowing conversions (primitives)
		 * 2. Upcasting/downcasting conversions (reference types)
		 */
		
		/*
		 * Widening/narrowing conversions
		 * 
		 * when we convert from one primitive type to another, we are either widening or narrowing our type
		 * 
		 * byte, short, char, int, long, float, double
		 * 
		 * This type of casting can either be implicit or explicit
		 * 
		 * implicit: occurs when you want to fit a narrower type into a larger type
		 * explicit: we need to explicitly specify that we want to convert from a wider types of narrower type
		 * 	We need to do this, because a number of outside of the range of the narrower type, we will lose that information
		 * 	Another way of putting it is that going from a wider to a narrower type is a "dangerous conversion" (we could lose information)
		 */

		// Implicit
		long myLong;
		int myInt = 1000;
		
		myLong = myInt; // we know that the long variable can ALWAYS store anything that the int variable stores
		
		//Explicit
		int myInt2;
		myInt2 = (int) myLong; // A long can contain a value outside the range of what an int can store.
		System.out.println("myInt2: " + myInt2); // myInt2 will print out a value of 1000 as well, because 1000 fits inside an int as well.
		
		myInt2 = (int) 3_000_000_000L; // a long is  64 bits, we are cutting off the 32 leftmost bits of information to fit this value into an int
		// we lose, in other words, 32 bits of informations. The remaining 32 bits of information to the right represent the number -1294967296
		System.out.println("myInt2: " + myInt2);
	}

}

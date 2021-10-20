package com.revature.app;

public class SodaCan {

	public static void main(String[] args) {
		/*
		 * Control flow is the core of any programming language
		 * 
		 * If you want to ask yourself if something is a programming language or not, typically the best way to go about evaluting if it is or not is whether or not
		 * it has if statements, loops, anything to do with control flow.
		 * 
		 * Control flow: controlling what gets executed under certain condition.
		 */
		
		// If statement
		// if-else statement
		// while loop
		// for loop
		// do while
		// switch
		// for each (enhanced for loop): special syntax for a for loop
		
		// if(<boolean expression>){// code inside here}
		
		int num = 100;
		if (num < 200) {
			System.out.println("The num variable is less than 200. It is " + num);
			
		}
		
		// if-else statement
		// if (<boolean expression>) {...} else {...}
		if(num < 200) {
			System.out.println("The num variable is less than 200. It is " + num);
		} else {
			System.out.println("The num variable is 200 or larger. It is " + num);
		}
		
		/*
		 * Switch statements
		 */
		
		int month = 1;
		switch (month) { // variables that can be used include byte, short, char, int, string, and enums
			case 1 :
				System.out.println("It is January");
				break;
			case 2 :
				System.out.println("It is Feb");
				break;
			case 3 :
				System.out.println("It is Mar");
				break;
			case 4 :
				System.out.println("It is April");
				break;
			case 5 :
				System.out.println("It is May");
				break;
			case 6 :
				System.out.println("It is June");
				break; // if we do not use the break keyword, it is known as "fall-through" (it might be useful in some circumstances, which is why Java designed switch block to be this way)
			default:
				System.out.println("It is not the right month");
			
		}
		
		/*
		 * Loops
		 * 
		 * For loop
		 * While Loop
		 * Do While loop
		 */
		
		for(int i = 0; i < 123; i++) { //int i is a "block scoped" variable. It is scoped to the for loop block specifically
			System.out.println(i);
		}
		
		
		for (int i = 5; i > 0; i--) { // 5,4, 3.. 1
			System.out.println(i);
		}
		
		// For loops are the most common type of loop you would use.
		
		// while loop
		int number = 10;
		while (number >= 0) {
			System.out.println(number);
			number--;
		}
		
		/*
		 * break, continue keywords
		 */
		
		//Continue
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 1) {
				continue; //continue will skip us to the next iteration
			}
			
			System.out.println("i: " + i); // if continue is execute, then code below it will not run
		}
		
		//Break
		for(int i = 0; i <= 100; i++) {
			if(i == 50) {
				break; // end the loop imediately 
			}
			
			System.out.println("i: " + i);
		}
		
	}
	
	public static void printNumbers() {
		for(int i = 0; i <= 100; i++) {
			if(i == 50) {
				return; // same as break
			}
			
			System.out.println("i: " + i);
		}
	}

}

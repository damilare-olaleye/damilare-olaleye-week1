package com.revature.app;

public class Main {

	public static void main(String[] args) {
		/*
		 * Array: a collection of elements of a fixed size that are ordered and accessible by an index
		 */
		
		// Define a reference variable for an array
		// An array is an object
		int[] myIntArray = new int[10]; // the size of the array we created is 10
		
		// Arrays have default values (it works exactly the same default values for fields)
		// numbers 0 or 0.0
		// boolean false
		// reference type null
		
		// you cannot change the size of an array object one it has been created!
		// In the example above, when the array is created, it is given 10 blocks of memory which are 32 bits each (because an int is 32 bits)
		// These blocks of memory are adjacent to each other in the heap
		// This is why we cannot change the size of an array once it is created, because the blocks of memory muust be next to each other.
		
		// An array has indicies ranging from 0 to the size of the array -1
		
		myIntArray[0] = 10;
		myIntArray[1] = 1;
		myIntArray[2] = 7;
		myIntArray[5] = 10;
		
		
		for(int i = 0; i < myIntArray.length; i++) {
			System.out.println(myIntArray[i]);
		}
		
		int[] myOtherIntArray = {14,12,5}; // we can use this shorthand notation to populate values ahead of time
		System.out.println(myOtherIntArray);
		
		int[] intArr = myOtherIntArray;
		intArr[0] = -10000000;
		
		System.out.println(myOtherIntArray[0]);
		
		System.out.println(intArr == myOtherIntArray); // If you are using == to compare reference vairables, you are checking to see if the reference variables are pointing to the same object
		
		// for-each (enhanced for loop)
		for(int element : intArr) { // element represent a particular element that we are currrently iterating over within the intArr array
			
		}
		// enhanced for loops are less flexible, but more convinent if you are using wanting to iterate from the 0th index to the largest index.
		
		for(int i = intArr.length - 1; i >= 0; i--) {
			System.out.println(intArr[i]);
		}
		
		/*
		 * Arrays are not limited to just primitive type
		 * 
		 * We can have reference variable array as well
		 */
		
		String[] myStrings = {"Jan","Feb","Mar"};
		System.out.println(myStrings);
		
		for(int i = 0; i < myStrings.length; i++) {
			System.out.println(i);
		}
		
		// Multi-dimensional arrays
		int[][] my2DArray = new int[][] {{1,2,3,4,5,6}, {2,3,4,5,6,7}}; // we have 2 arrays with 5 elements each inside of another array
		
		for (int i = 0; i < my2DArray.length; i++) {
			for(int j = 0; j < my2DArray[i].length; j++) {
				System.out.println("i: " + i + ", j" + j + " : " + my2DArray[i][j]);
			}
		}
		
		//enchanced for loop
		for(int[] myArray : my2DArray) {
			for(int element : myArray) {
				System.out.println(element);
			}
		}
		

	}

}

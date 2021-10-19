package model;

public class Square {
	
	// Fields, whether they are non-static OR static, will have default values... Static to keep track of it globally belongs to the class, non static belongs to the object... does not keep track of it globally
	public double side;	// default value of 0
	public static int numberOfInstances; // default value of 0
	
	public Square(double side) {
		this.side = side;
		
		numberOfInstances += 1;
	}
	
}

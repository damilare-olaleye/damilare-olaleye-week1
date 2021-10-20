package com.revature.app;

import com.revature.model.Student;

public class Main {

	public static void main(String[] args) {
		
		welcomeStudent();
		
		Student student = new Student(4132, "John Baptise", "1500 John rd", 23);
		
		student.studentInformation();
		System.out.println(student.id);
		
		student.studentInformation(4123, 23);
		System.out.println(student.age);
		
//		student.studentInformation("Mattew", "1500 John rd");
//		System.out.println(student.name + " " + student.address);
		
		
	}
	
	public static void welcomeStudent() {
		System.out.println("*** Hello new student! tell us about yourself ***");
		System.out.println();
	}

}

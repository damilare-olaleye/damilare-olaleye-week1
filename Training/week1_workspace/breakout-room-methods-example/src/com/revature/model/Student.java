package com.revature.model;

public class Student {
	
	public int id;
	public String name;
	public String address;
	public int age;
	
	public Student(int id, String name, String address, int age) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public void studentInformation() {
		System.out.println("my id is: " + this.id);
		System.out.println("my name is: " + this.name);
		System.out.println("I live at: " + this.address);
		System.out.println("I am: " + this.age + " years old.");
	}
	
	
	public void studentInformation(int id, int age) {
		System.out.println(this.id + 4100);
		System.out.println(this.age + 23);
	}
	
	public void studentInformation(String name, String address) {
		System.out.println(this.name + "name is Mattew" + this.address + "address");
	}
	
}

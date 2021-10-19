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
		System.out.println(this.id + this.name + this.address + this.age);
	}
	
	
	public void studentInformation(int id) {
		System.out.println(this.id + 001);
	}
	
	public void studentInformation(String name, String address) {
		System.out.println(this.name + "name is Mattew" + this.address + "address");
	}
	
}

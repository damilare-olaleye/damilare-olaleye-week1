package com.revature.app;

import com.revature.model.Animal;
import com.revature.model.Food;

public class Application {

	public static void main(String[] args) {
		
		printHelloWorld();
		Animal animal = new Animal("Dog", "Fido", 7, 100);
	
		
		animal.play("fetch"); // overloaded method #2
		
		System.out.println(animal.energyLevel);
		
		animal.play(30);  // overloaded method #3
		
		System.out.println(animal.energyLevel);
		
		animal.play();  // overloaded method #1
		
		System.out.println(animal.energyLevel);
		
		Food food = new Food("Steak", 50);
		animal.eat(food);
		System.out.println();

	}
	
	public static void printHelloWorld() {
		System.out.println("Hello world");
	}

}

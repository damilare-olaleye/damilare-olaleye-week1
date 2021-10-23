package com.revature.controller;

import com.revature.service.ArithmeticService;

import io.javalin.Javalin;
import io.javalin.http.Handler;

// The purpose of the controller layer is to receive information from a request
// we don't want to do actual data processing inside the controller layer
// 	that is the role of the service layer

public class ArithemticController {
	
	public ArithmeticService arithmeticService;
	
	// Constructor
	public ArithemticController() {
		this.arithmeticService = new ArithmeticService();
	}

	// This is what is known as a lambda
	// Think of it as similar to a method, but it is a method that can be passed around
	public Handler add = (ctx) -> {
		ctx.result("add lamda invoked");
		
		// Double class
		// the Double class has a static method called parseDouble that can take a String and return a double primitive representation of that String
		
		String number1String = ctx.formParam("number1");
		String number2String = ctx.formParam("number2");
		
		ctx.result(arithmeticService.doAddition(number1String, number2String)) ; // Just Strings concatination and not our actual number
	};
	
	
	public Handler divide = (ctx) -> {
		ctx.result("add lamda invoked");
		
		// Double class
		// the Dobule class has a static method called parseDouble that can take a String and return a double primitive representation of that String
		
		String number1String = ctx.formParam("number1");
		String number2String = ctx.formParam("number2");
	
		ctx.result(arithmeticService.doDivide(number1String, number2String)) ; // Just Strings concatination and not our actual number
	};
	
	public Handler multiply = (ctx) -> {
		ctx.result("multiply lamda invoked");
		
		// Double class
		// the Double class has a static method called parseDouble that can take a String and return a double primitive representation of that String
		
		String number1String = ctx.formParam("number1");
		String number2String = ctx.formParam("number2");
		
		
		ctx.result(arithmeticService.doMultiply(number1String, number2String)) ; // Just Strings concatination and not our actual number
	};
	
	public Handler subract = (ctx) -> {
		ctx.result("subtract lamda invoked");
		
		// Double class
		// the Dobule class has a static method called parseDouble that can take a String and return a double primitive representation of that String
		
		String number1String = ctx.formParam("number1");
		String number2String = ctx.formParam("number2");
		
		
		ctx.result(arithmeticService.doSubtract(number1String, number2String)) ; // Just Strings concatination and not our actual number
	};

	// Define an instance method here
	public void registerEndpoint(Javalin app) {
		app.post("/add", add); // we are mapping the add lambda, whcih will be invked whenever a client sends a post request
		app.post("/divide", divide);
		app.post("/multiply", multiply);
		app.post("/subtract", subract); 
	}

}

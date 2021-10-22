package com.revature.controller;

import com.revature.service.SubtractionService;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class SubtractionController {
	
public SubtractionService subtractionService;
	
	// Constructor
	public SubtractionController() {
		this.subtractionService = new SubtractionService();
	}
	
	public Handler subract = (ctx) -> {
		ctx.result("subtract lamda invoked");
		
		// Double class
		// the Dobule class has a static method called parseDouble that can take a String and return a double primitive representation of that String
		
		String number1String = ctx.formParam("number1");
		String number2String = ctx.formParam("number2");
		
//		double number1 = Double.parseDouble(number1String);
//		double number2 = Double.parseDouble(number2String);
		
		
		ctx.result(subtractionService.doSubtract(number1String, number2String)) ; // Just Strings concatination and not our actual number
	};
	
	// Define an instance method here
		public void registerEndpoint(Javalin app) {
			app.post("/subtract", subract); // we are mapping the add lambda, whcih will be invked whenever a client sends a post request
		}

}

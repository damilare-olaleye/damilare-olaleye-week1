package com.revature.controller;

import com.revature.service.ArithmeticService;
import com.revature.service.DivisionService;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class DivisionController {
	
	public DivisionService divisionService;
	
	// Constructor
		public DivisionController() {
			this.divisionService = new DivisionService();
		}
		
		
		public Handler divide = (ctx) -> {
			ctx.result("add lamda invoked");
			
			// Double class
			// the Dobule class has a static method called parseDouble that can take a String and return a double primitive representation of that String
			
			String number1String = ctx.formParam("number1");
			String number2String = ctx.formParam("number2");
			
			double number1 = Double.parseDouble(number1String);
			double number2 = Double.parseDouble(number2String);
			
			
			ctx.result(divisionService.doDivide(number1String, number2String)) ; // Just Strings concatination and not our actual number
		};
		
		// Define an instance method here
		public void registerEndpoint(Javalin app) {
			app.post("/divide", divide); // we are mapping the add lambda, whcih will be invked whenever a client sends a post request
		}


}

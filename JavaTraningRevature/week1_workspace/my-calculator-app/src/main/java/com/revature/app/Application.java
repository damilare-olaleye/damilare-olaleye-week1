package com.revature.app;

import com.revature.controller.ArithemticController;
import com.revature.controller.DivisionController;
import com.revature.controller.MultiplicationController;
import com.revature.controller.SubtractionController;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Application {

	public static void main(String[] args) {
		
		 // here we are using the create() static method that belongs to the Javalin class to create a Javalin object
		// This Javalin object is what gives us a "handle" on the Jetty webserver that will receive HTTP request and send HTTP responses
		
		Javalin app = Javalin.create(config -> {
			config.addStaticFiles("/", Location.CLASSPATH);
		});
		
		// Instantiate our Controller
		ArithemticController arithemticController = new ArithemticController();
		MultiplicationController mutlplicationController = new MultiplicationController();
		SubtractionController subtractionController = new SubtractionController();
		DivisionController divisionController = new DivisionController();
		
		arithemticController.registerEndpoint(app);
		mutlplicationController.registerEndpoint(app);
		subtractionController.registerEndpoint(app);
		divisionController.registerEndpoint(app);
		
		app.start(8080); // start server on port 8080

	}

}

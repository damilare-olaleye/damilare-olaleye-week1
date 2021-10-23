package com.revature.service;

// The service layer is responsible for the processing of data. We would perform business logic inside of the service layer
// Ex. imagine you are developing the backend for Twitter. The service layer of Twitter backend would contain business logic related to providing friend
// All sorts of complex algorithms could be develooed, and those would ultimately be part of this "service" layer
// Sometimes, the service layer will be pretty simple (especially for CRUD applications)
// CRUD = Create, Read, Update, Delete
// CRUD application are applications that are primarily designed to keep records of data

public class ArithmeticService {

	public String doAddition(String number1String, String number2String) {

		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double sum = number1 + number2;

		String result = "" + sum; // Convert from double representation of a number to a String representation

		return result;
	}

	public String doDivide(String number1String, String number2String) {

		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double divide = number1 / number2;

		String result = "" + divide; // Convert from double representation of a number to a String representation

		return result;
	}

	public String doMultiply(String number1String, String number2String) {

		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double multiply = number1 * number2;

		String result = "" + multiply; // Convert from double representation of a number to a String representation

		return result;
	}

	public String doSubtract(String number1String, String number2String) {

		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double subract = number1 - number2;

		String result = "" + subract; // Convert from double representation of a number to a String representation

		return result;
	}

}

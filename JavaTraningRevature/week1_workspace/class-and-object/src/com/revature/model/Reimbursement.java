package com.revature.model;

// A class is intented to function as a blueprint for various objects
// An object is a real world instance that has various properties and behaviors defined in a blueprint

// Classes are used to actually create objects of that particular type
public class Reimbursement {
	
	
	// These are properties of Reimbursement objects
	// They are technically referred to as "fields"
	public String submitter; // This is the name of the person who submitted the reimbursement
	public String description; // This is the description for that particular reimbursement
	public boolean approved; // if this Reimbursement is approved, then the value of this property should be true, and false if it is pending or denied
	public double amount;
}

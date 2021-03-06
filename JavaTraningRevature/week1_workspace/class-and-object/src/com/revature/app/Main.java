package com.revature.app; // This line of code is specifying what package this class belongs to

// cmd + shift + o to auto-complete
import com.revature.model.Reimbursement;

// It belongs to the com.revature.app package
// packages follow a "reverse domain" naming convention
// So, if you work for google, your package names will usually start with com.google. <whatever else you want>. <even more of what you want>


public class Main {
	// The shortcut we can use to create our main method is by typing main followed by ctrl + space
	// ctrl + space will give you a dropdown containing suggestions that you can use
	
	public static void main(String[] args) {
		
		System.out.println("Hi there");
		
		// This is how you create a new object, the new keyword followed by what is known as a constructor will instatiate
				// based on that particular class.
		Reimbursement reimbursement1 = new Reimbursement();
		Reimbursement reimbursement2 = new Reimbursement();
		
		reimbursement1.approved = true;
		reimbursement1.description = "This is a reimbursement for travel expenses using Uber";
		reimbursement1.submitter =  "Damilare Olaleye";
		reimbursement1.amount = 100.2;
		
		reimbursement2.approved = true;
		reimbursement2.description = "This is a reimbursement for travel expenses using Uber";
		reimbursement2.submitter =  "Damilare Olaleye";
		reimbursement2.amount = 75.5;
		
		System.out.println(reimbursement1.approved);
		System.out.println(reimbursement1.description);
		System.out.println(reimbursement1.submitter);
		System.out.println(reimbursement1.amount);
		
		System.out.println();
		
		System.out.println(reimbursement2.approved);
		System.out.println(reimbursement2.description);
		System.out.println(reimbursement2.submitter);
		System.out.println(reimbursement2.amount);
	}

}

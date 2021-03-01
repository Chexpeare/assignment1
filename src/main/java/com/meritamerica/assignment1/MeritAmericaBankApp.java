package com.meritamerica.assignment1;

/** The MeritAmericaBankApp is the main program for retrieving client
 * information from the AccountHolder, CheckingAccount, SavingsAccount
 */

public class MeritAmericaBankApp {
		
	public static void main(String[] args) {

//		Input: First customer query 
    	AccountHolder accountCall = new AccountHolder("John", "James", "Doe", "123-45-6789", 100.0, 1000.0);
    	System.out.println(accountCall.toString());

//		Output: Current state of checking and savings account for specified customer
    	accountCall.getCheckingAccount().deposit(500.00);
    	accountCall.getSavingsAccount().withdraw(800.00);
    	System.out.println(accountCall.getCheckingAccount().toString());    	
    	System.out.println(accountCall.getSavingsAccount().toString());    	

    	System.out.println("_______________________________________________" + "\n");

//		Input: Second customer query
    	AccountHolder accCallTwo = new AccountHolder("Betty", "Jane", "Doe", "987-45-4321", 200.0, 500.0);
    	System.out.println(accCallTwo.toString());

//		Output: Current state of checking and savings account for specified customer
    	accCallTwo.getCheckingAccount().deposit(-500.00);
    	accCallTwo.getSavingsAccount().withdraw(600.00);
    	System.out.println(accCallTwo.getCheckingAccount().toString());
    	System.out.println(accCallTwo.getSavingsAccount().toString());
    }
}

// End MeritAmericaBankApp.java










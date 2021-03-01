package com.meritamerica.assignment1;

/** The AccountHolder constructor keeps track of the following pieces of data
 * about a customer: First Name, Middle Name, Last Name, Social Security Number, 
 * Checking Account, and Savings Account. All of this information is entirely 
 * private to the class. Clients such as the MeritAmericaBankApp can obtain this 
 * information only by using the various methods defined by the class.
 */

public class AccountHolder {
	
	/** 
	 * Creates a new AccountHolder object with the specified name and ID
	 * @param firstName:	String - customer's First Name 
	 * @param middleName:	String - customer's Middle Name
	 * @param lastName:		String - customer's Last Name
	 * @param ssn:			String - customer's SSN number
	 */
	
	/* Private instance variables */
	private String firstName;		/* Customer's First Name		*/
	private String middleName;		/* Customer's Middle Name		*/
	private String lastName;		/* Customer's Last Name			*/
	private String ssn;				/* customer's SSN number		*/
	private CheckingAccount chk;
	private SavingsAccount sav;
	
	public AccountHolder(String firstName, 
							String middleName, 
							String lastName, 
							String ssn, 
							double ckBal, 
							double savBal) { 
		
		 this.firstName = firstName;
		 this.middleName = middleName;
		 this.lastName = lastName;
		 this.ssn = ssn;
		 this.chk = new CheckingAccount(ckBal);
		 this.sav = new SavingsAccount(savBal);
	}

	/** 
	 * Gets the First Name of the customer
	 * @return the First Name of the customer 
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/** 
	 * Sets the First Name of the customer
	 * @return the First Name of the customer 
	 */
	public void setFirstName(String firstName) {

	}
	
	/** 
	 * Gets the Middle Name of the customer
	 * @return the Middle name of this customer 
	 */
	public String getMiddleName() {
		return this.middleName;
	}

	/** 
	 * Sets the Middle Name of the customer
	 * @return the Middle name of this customer 
	 */
	public void setMiddleName(String middleName) {
	
	}
	
	/** 
	 * Gets the Last Name of the customer
	 * @return the Last Name of the customer 
	 */
	public String getLastName() {
		return this.lastName;
	}

	/** 
	 * Sets the Last Name of the customer
	 * @return the Last Name of the customer 
	 */
	public void setLastName(String lastName) {
	}
	
	/** 
	 * Gets the SSN of the customer
	 * @return the SSN of the customer 
	 */
	public String getSSN() {
		return ssn;
	}

	/** 
	 * Sets the SSN of the customer
	 * @return the SSN of the customer 
	 */
	public void setSSN(String ssn) {
		
	}
	
	/** 
	 * Calls the CheckingAccount class
	 * @return Calls the CheckingAccount class 
	 */
	public CheckingAccount getCheckingAccount() {
		return chk;
	}

	/** 
	 * Calls the SavingsAccount class
	 * @return Calls the SavingsAccount class 
	 */
	public SavingsAccount getSavingsAccount() {		
		return sav;
	}
	
	/** 
	 * Sets and returns the toString() method back to main()
	 * @return Sets and returns the toString() method back to main() 
	 */
	public String toString() {
		String fullName = firstName + " " + middleName + " " + lastName;
		String concat1 = fullName + "\n" + "SSN: " + ssn + "\n"; 
		String concat2 = this.chk.toString() + "\n"; 
		String concat3 = this.sav.toString();
		String concatAcct = concat1 + concat2 + concat3;
		
		return concatAcct;
	}
}

// End AccountHolder.java


	
	
	
	
	



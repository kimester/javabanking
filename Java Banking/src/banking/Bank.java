package banking;

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank accounts
 * @author kimester
 *
 */
public class Bank {

	public static void main(String[] args) {
		//creates new instead of Bank class
		Bank bank = new Bank();
		
		//calls the run method in the bank class
		bank.run();

	}
	/**
	 * Runs the program by initializing and managing, bank accounts and customers.
	 */
public void run() {
	System.out.println("Hello, What is your name");
	
	//create scanner to get user input
	Scanner scanner = new Scanner(System.in);
	
	//get the next token(word)(customer's name)
	String name = scanner.next();
	System.out.println("Hello " + name + "! We are creating checking and saving accounts for you");
	
	//Create customer with given name
	Customer customer = new Customer(name);
	
	// get address
	System.out.println("What is your address");
	
	//get next token(word, which is the customer's address
	String address = scanner.next();
	
	//set the customer's address
	customer.setAddress(address);
			
	//create a checking account for customer
	BankAccount checkingAccount = new BankAccount("checking", customer);
	
	//create a saving account for customer
	BankAccount savingsAccount = new BankAccount("savings", customer);
	
	//gets and prints the customer info associated with the checking account
	System.out.println();
	System.out.println("Customer info:" );
	System.out.println(checkingAccount.getCustomerInfo());
	
	//get and print account info for checking account
	System.out.println("Checking account: ");
	System.out.println(checkingAccount.getAccountInfo());
	
	//get and print account info for checking account
	System.out.println("Savings account: ");
	System.out.println(savingsAccount.getAccountInfo());
	
	//deposits
	
	// into checking 
	System.out.println();
	System.out.println ("Amount (decimal)to deposit into your checking account?");
	double amount = scanner.nextDouble();	//get next to token(double)
	checkingAccount.deposit(amount); //deposit into checking account
	
	// into savings
	System.out.println();
	System.out.println ("Amount (decimal)to deposit into your savings account?");
    amount = scanner.nextDouble();	//get next to token(double)
	savingsAccount.deposit(amount);//deposit into savings account
	
	System.out.println(checkingAccount.getAccountInfo());
	System.out.println(savingsAccount.getAccountInfo());
	
	//withdrawals
	
	//from checking
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

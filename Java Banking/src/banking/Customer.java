package banking;

/**
 * Represents a customer of a bank
 * @author kimester
 *
 */
public class Customer {

	//instance vars
	/**
	 * Name of customer
	 */
	String name;
	
	/**
	 * Address of customer
	 */
	String address;
	
	//constructor
	/**
	 * Creates a customer with the given name
	 * @param name
	 */
	public Customer(String name) {
		//sets instance var name to given name
	this.name = name;	
	}
	
	//methods 
	/**
	 * Sets address of customer to be given address.
	 * @param address
	 */
	public void serAddress(String address) {
	this.address = address;	
	}
	/**
	 * Returns customer's name
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address2) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Returns customer's address
	 */
	
	
	
	
	
	
}

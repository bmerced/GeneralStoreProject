public class FloorAssociate extends StoreEmployee {

  // Constructor
	public FloorAssociate(String firstName, String lastName, String employeeId) {
		super(firstName, lastName, employeeId);
	}
	//no new instance var. overriding salary because floor associate gets paid differently.

	/**
	 * Identify yourself and approach Customers Politely
	 * @return
	 */
	//only floor associates know how to assist customers so I create this method to return a simple greeting with the first anme
	public String assistCustomers(){ 
		return "This is " + getFirstName() + ". How may I help you?";
	}
	
	/**
	 * Stack the shelves where necessary/
	 */
	//only floor associates know how to stock shevles so I create this method to return a a print explaing stocking shelves
	public void stockShelves(){ 
		System.out.println("Empty? Load it up!");
	}
	
	@Override
	public double getSalary() { 
		return super.getSalary() + 10000;//$10,000 more than general employee
	}
}

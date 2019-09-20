// A class to represent behavior common to all type of General Store employees.
//every store employee gets a first name and last name because person.java has that information in its class.
public class StoreEmployee extends Person{
	 private String employeeId; //v
//every store employee has 3 pieces of info because of private string employee id and then the info passed from person.java
	/**
	 * Takes
	 * @param firstName
	 * @param lastName
	 * @param employeeId
	 */
		 
	public StoreEmployee(String firstName, String lastName, String employeeId) {
		super(firstName, lastName);
		this.employeeId=employeeId;	
	}

	//gets info from private info at line 4
	public String getEmployeeId() { 
		return employeeId;
	}
//these are constant because I am hard coding these integers/double/strings
	public int getHours() { 
        return 40;           // Standard employee works 40 hours / week
    }

    public double getSalary() { 
        return 30000.0;      // Base Salary of $30,000.00 / year
    }

    public int getVacationDays() { 
        return 10;           // Base Vacation - 2 weeks
    }

    public String getVacationForm() { 
        return "yellow";     // use the yellow vacation slip
    }

    public String getStoreLocation() { 
	        return "Rutgers Campus, New Brunswick, NJ";//address of the store where all the employee works for this store
    }

}
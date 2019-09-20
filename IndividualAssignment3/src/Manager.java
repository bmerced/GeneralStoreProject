
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//void prints and doesnt return

// A class to represent GeneralStore Manager.

public class Manager extends StoreEmployee {

  	// Constructor
    public Manager(String firstName, String lastName, String employeeId) {
		super(firstName, lastName, employeeId);
	}
    //no new instance var. no overriding methods.
    
//method created to explain managerial expressions to employees
		public void monitorEmployees() { 
	        System.out.println("Monitoring Empoyees work! Great Job! Keep it going!");
    }
    
		//java provides this dates and times so I am invoking the constructor to create a new simple date instance
		//then prints the date and date format
		// then prints out statement with employees first name, last name, id, and date format "yyyy/MM/dd HH:mm:ss"
    public void assignWork(StoreEmployee employee) { 
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				System.out.println(dateFormat.format(date));
		    System.out.println("Assigning Work to: Associate Name:" + employee.getFirstName() +  " " +employee.getLastName() + " Associate Employee ID:" + employee.getEmployeeId() + " @ " + dateFormat.format(date));
    }

}
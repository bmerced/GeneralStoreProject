public class Janitor extends StoreEmployee {
	public Janitor(String firstName, String lastName, String employeeId) {
		super(firstName, lastName, employeeId);
		/*provide this constructor to call the initialize the instance variables in the parent class. this janitor doesnt have any new isntance variables. I am overriding 
		to change behavior of the getSalary, not mutating it. This janitor has a different salary,hours, etc so we change behavior*/
	}

	@Override
	public double getSalary() { 
		return super.getSalary() - 10000;
	}

	@Override
	public int getVacationDays() {  
		int vac = super.getVacationDays();
		return vac / 2;
	}

	@Override
	public int getHours() { 
		int hrs = super.getHours();
		return hrs * 2;
	}

	public void clean() { 
		System.out.println("Working for General Store");
	}

}

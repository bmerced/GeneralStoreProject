public class CartStacker extends StoreEmployee {
	public CartStacker(String firstName, String lastName, String employeeId) {
		super(firstName, lastName, employeeId);
		//no new instance variables. overriding salary, hours, and vacation to change behavior because cart stacker has different rules for this position. 
	}

	@Override
	public double getSalary() { 
		return super.getSalary()*1.05;
	}
	

	@Override
	public int getHours() { 
		int hrs = super.getHours();
		return hrs + 5;
	}

	@Override
	public String getVacationForm() { 
		String s1 = super.getVacationForm();
			return s1 + s1 + s1;
	}
	//method to return "move in move in" that will be called on later in the main method because cartstackers only do this.

	public String getTheCartsInOrder() { 
		return ("Move-in!Move-in!");
	}

}

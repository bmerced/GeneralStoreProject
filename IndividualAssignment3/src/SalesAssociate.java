//instance variables are data and methods are things the classes know how to do.
public class SalesAssociate extends FloorAssociate {
	//extends means I produce a super sub <-->  class relationship. I can access all non-private instance variables and methods.
	//these 3 below are also the parameters of the constructor
	public SalesAssociate(String firstName, String lastName, String employeeId) {
		super(firstName, lastName, employeeId);
		//^calls the constructor of the super class. Passing this information up from the super (parent) classes to be used.
	}
//The sales associates answers the same questions at the floor associate but gives a different answer because of Override
	@Override
	public double getSalary() { 
		return super.getSalary()*1.3;
		// 30% more than a floor associate
	}

	@Override
	public int getVacationDays() { 
		return super.getVacationDays() + 1;
	}
//I created this because only the Sales Associate would know how to do this therefore this method is only here.
	//the job of this method is to return a string.
	public String getCashPosition() { 
		//these two instance variables are local because they are declared curly brackets of this specific method.
		String store_loc = super.getStoreLocation();
		String emp_id = super.getEmployeeId();
		int cash_pos = 100;
		//long is a longer integer that holds longer numbers
		long time_st = System.currentTimeMillis();
		//this will return the strings one after the other which is called string concatenation.
		String S;
		S ="Store Location:" + store_loc;
		S = S + "\nEmployee ID:" + emp_id;
		S = S + "\nCash position:$" + cash_pos;
		S = S + "\nTime stamp:" + time_st;
		return S;
	}
}

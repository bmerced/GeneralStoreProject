public class MyStore {
/*running my code in the main method. The printlns are going to print out all the methods I am calling. declaring a variable s1, f1, m1, etc.. because my classes are my blueprints and I am going to
	create these instances like "SalesAssociate s1 = new SalesAssociate" work outside the class that way I can create new instances and names of new Sales Associates if the Store hires them. */
	public static void main(String[] args) {
		
		System.out.println("\n\n ********** SALESASSOCIATE Object *********");
		SalesAssociate s1 = new SalesAssociate("Brandon", "Merced", "12003");
		System.out.println("firstName: " + s1.getFirstName());
		System.out.println("lastName: " + s1.getLastName());
		System.out.println("employeeId: " +  s1.getEmployeeId());
		System.out.println("Salary:" + s1.getSalary());
		System.out.println("Hours:" + s1.getHours());
		System.out.println("Vacation Form:" + s1.getVacationForm());
		System.out.println("Vacation Days:" + s1.getVacationDays());
		System.out.println(s1.getCashPosition());
		
		System.out.println("\n\n ********** FLOOR ASSOCIATE Object *********");
		FloorAssociate f1 = new FloorAssociate("Hulk", "Hogan", "11004");
		System.out.println("firstName: " + f1.getFirstName());
		System.out.println("lastName: " + f1.getLastName());
		System.out.println("employeeId: " +  f1.getEmployeeId());
		System.out.println("Salary:" + f1.getSalary());
		System.out.println("Hours:" + f1.getHours());
		System.out.println("Vacation Form:" + f1.getVacationForm());
		System.out.println("Vacation Days:" + f1.getVacationDays());
		
		System.out.println("\n\n ********** MANAGER Object *********");
		Manager m1 = new Manager("Kevin", "Suen", "17005");
		System.out.println("firstName: " + m1.getFirstName());
		System.out.println("lastName: " + m1.getLastName());
		System.out.println("employeeId: " +  m1.getEmployeeId());
		System.out.println("Salary:" + m1.getSalary());
		System.out.println("Hours:" + m1.getHours());
		System.out.println("Vacation Form:" + m1.getVacationForm());
		System.out.println("Vacation Days:" + m1.getVacationDays());
		m1.monitorEmployees();
		m1.assignWork(f1);
		
		System.out.println("\n\n ********** STOREEMPLOYEE Object *********");
		StoreEmployee e1 = new StoreEmployee("Mary", "Smith", "123348");
		System.out.println("firstName: " + e1.getFirstName());
		System.out.println("lastName: " + e1.getLastName());
		System.out.println("employeeId: " +  e1.getEmployeeId());
		System.out.println("Salary:" + e1.getSalary());
		System.out.println("Hours:" + e1.getHours());
		System.out.println("Vacation Form:" + e1.getVacationForm());
		System.out.println("Vacation Days:" + e1.getVacationDays());
		System.out.println("Store Location:" + e1.getStoreLocation());
		
		System.out.println("\n\n ********** JANITOR Object *********");
		Janitor j1 = new Janitor("Cole", "Miller", "32454");
		System.out.println("firstName: " + j1.getFirstName());
		System.out.println("lastName: " + j1.getLastName());
		System.out.println("employeeId: " +  j1.getEmployeeId());
		System.out.println("Salary:" + j1.getSalary());
		System.out.println("Hours:" + j1.getHours());
		System.out.println("Vacation Days:" + j1.getVacationDays());
		j1.clean();

		System.out.println("\n\n ********** CARTSTACKER Object *********");
		CartStacker c1 = new CartStacker("Ray", "Menedez", "68755");
		System.out.println("firstName: " + c1.getFirstName());
		System.out.println("lastName: " + c1.getLastName());
		System.out.println("employeeId: " +  c1.getEmployeeId());
		System.out.println("Salary:" + c1.getSalary());
		System.out.println("Hours:" + c1.getHours());
		System.out.println("Vacation Days:" + c1.getVacationDays());
		System.out.println("Vacation Form:" + c1.getVacationForm());
		System.out.println(c1.getTheCartsInOrder());

	}

}
public abstract class Person {
//instance var
private String firstName;
private String lastName;

//created constructor. initialized instance var
public Person(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}
//my getters.. to provide access to the instance var
public String getFirstName() {
	return firstName;
}
//my setters.. allow the instance variables to change(mutate)
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}


}
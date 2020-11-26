package classes_basics_athlets;

public class Athlete {
	
	/*
	 * Athlete has fields:
	 * first name, last name, and year of birth-added when athlete is created;they cannot be changed
	 * Athlete has method that writes out FIRSTNAME_LASTNAME: yearOfBirth
	 * Write a main program that will test this.
	 */
	
	//fields
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	
	
	//constructor
	public Athlete (String firstName, String lastName, int yearOfBirth) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.yearOfBirth=yearOfBirth;
	}
	

	//methods
	public String getName() {
	return firstName;	
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	
	//@Override annotation informs
	//the compiler that the element is meant
	//to override an element declared in a superclass.
	//I don't need it here.
	public void showAthleteData () {
		System.out.println(firstName.toUpperCase() + "_" + lastName.toUpperCase() + ": " + yearOfBirth);
	}
	

}

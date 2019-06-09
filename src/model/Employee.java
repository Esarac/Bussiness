package model;

/**
*<b>Description:</b> The class Employee in the package model.<br>
*@author Esteban Ariza Acosta
*/
public class Employee {

	//Attributes
	private String name;
	private String charge;
	private String email;

	//Constructor
	/**
	*<b>Description:</b> The constructor of the class Employee.<br>
	*<b>Post:</b> All The attributes of the class are initialize.<br>
	*@param name The name we want to set.
	*@param charge The charge we want to set.
	*@param email The email we want to set.
	*/
	public Employee(String name, String charge, String email){

		this.name=name;
		this.charge=charge;
		this.email=email;

	}

	//Gets
	/**
	*<b>Description:</b> Return the name of the employee.<br>
	*@return A String that is the name of the employee.
	*/
	public String getName(){

		return name;

	}

	/**
	*<b>Description:</b> Return the charge of the employee.<br>
	*@return A String that is the charge of the employee.
	*/
	public String getCharge(){

		return charge;

	}

	/**
	*<b>Description:</b> Return the email of the employee.<br>
	*@return A String that is the email of the employee.
	*/
	public String getEmail(){

		return email;

	}

}

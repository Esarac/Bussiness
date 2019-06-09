package model;

/**
*<b>Description:</b> The class Cubicle in the package model.<br>
*@author Esteban Ariza Acosta
*/
public class Cubicle{

	//Attributes
	private Employee employee;
	private String extension;

	//Constructor
	/**
	*<b>Description:</b> The constructor of the class Cubicle.<br>
	*<b>Post:</b> Some of the attributes of the class are initialize.<br>
	*@param extension The extension we want to set.
	*/
	public Cubicle(String extension){

		this.extension=extension;

	}

	//Do
	/**
	*<b>Description:</b> Create the employee.<br>
	*<b>Post:</b> The attribute employee was modified.<br>
	*@param name The name for the employee.
	*@param charge The charge for the employee.
	*@param email The email for the employee.
	*@return A String that informs that the employee has been added.
	*/
	public String addEmployee(String name, String charge, String email){

		String message="Se ha aniadido el empleado";

		employee=new Employee(name, charge, email);

		return message;

	}

	/**
	*<b>Description: Return the employee email if the charge of the employee is the same as the charge of the parameter</b>
	*@param charge The charge that we want to confirm if match.
	*@return The email if the charges match. If they do not, return a empty string.
	*/
	public String emailByCharge(String charge){

		String email="";

		if(employee!=null){
			if(charge.equals(employee.getCharge())){

				email="\n-"+employee.getEmail();

			}
		}

		return email;

	}

	//Gets
	/**
	*<b>Description:</b> Return the employee of the cubicle. If the employee does not exist return <code>null</code>.<br>
	*@return A Employee that is the employee of the cubicle.
	*/
	public Employee getEmployee(){

		return employee;

	}

	/**
	*<b>Description:</b> Return the extension of the cubicle.<br>
	*@return A String that is the extension of the cubicle.
	*/
	public String getExtension(){

		return extension;

	}

}

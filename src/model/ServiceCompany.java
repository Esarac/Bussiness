package model;

/**
*<b>Description:</b> The abstract class ServiceCompany in the package model.<br>
*@author Esteban Ariza Acosta
*/
public abstract class ServiceCompany extends SubordinateCompany{

	//Attributes
	private Survey[] surveys;

	//Constructor
	/**
	*<b>Description:</b> The constructor of the class ServiceCompany.<br>
	*<b>Post:</b> All The attributes of the class are initialize.<br>
	*@param name The name we want to set.
	*@param nit The nit we want to set.
	*@param representativeName The representative name we want to set.
	*@param address The address we want to set.
	*@param phone The phone we want to set.
	*@param employeeQuantity The employee quantity we want to set.
	*@param assetsValue The assets value we want to set.
	*@param creationDay The creation day for the creation date we want to set.
	*@param creationMonth The creation month for the creation date we want to set.
	*@param creationYear The creation year for the creation date we want to set.
	*@param floors The floors of the building that we want to set.
	*@param type The type we want to set.
	*/
	public ServiceCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type){

		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type);

		this.surveys=new Survey[50];

	}

	//Do
	/**
	*<b>Description:</b> Shows some data of the object in a String.<br>
	*@return A String that is the data of the object.
	*/
	public String toString(){

		String toString=super.toString();
		toString+="\n	Encuestas: "+calculateSurveyQuantity();
		return toString;

	}

	/**
	*<b>Description:</b> Calculate the quantity of surveys that have been registered on the company.<br>
	*<b>Pre:</b> The attribute surveys must not be null.<br>
	*@return A int that is the quantity of surveys.
	*@throws NullPointerException If the attribute survey of the company is null.
	*/
	public int calculateSurveyQuantity(){

		int quantity=0;
		for(int i=0;i<surveys.length;i++){

			if(surveys[i]!=null){

				quantity++;

			}

		}

		return quantity;

	}

	/**
	*<b>Description:</b> Calculate the average satisfaction of the company with the satisfaction of the surveys. If there are less than <code>10</code> surveys do not calculate the satisfaction.<br>
	*<b>Pre:</b> The attribute surveys must not be null.<br>
	*@return A double that is the company satisfaction average.
	*@throws NullPointerException if the attribute survey of the company is null.
	*/
	public double calculateSatisfaction(){

		double satisfaction=0;
		if(calculateSurveyQuantity()>=10){

			for(int i=0; i<surveys.length; i++){

				if(surveys[i]!=null){

					satisfaction+=surveys[i].calculateSatisfaction();

				}

			}
			satisfaction/=calculateSurveyQuantity();

		}

		return satisfaction;

	}

	//Add
	/**
	*<b>Description:</b> Add a survey in the company surveys. If the surveys are more than 50, do not add the survey.<br>
	*<b>Pre:</b> The attribute surveys must not be null.<br>
	*<b>Post:</b> The survey was added to surveys.<br>
	*@param survey The survey we want to add.
	*@return A String that informs that the survey has been added.
	*@throws NullPointerException If the attribute survey of the company is null.
	*/
	public String addSurvey(Survey survey){

		String message="No se pudo anadir porque ya existen 50 encuestas";

		boolean run=true;
		for(int i=0; (i<surveys.length)&&run; i++){

			if(surveys[i]==null){

				surveys[i]=survey;
				message="Se ha aniadido la encuesta a la empresa";
				run=false;

			}

		}

		return message;

	}

}

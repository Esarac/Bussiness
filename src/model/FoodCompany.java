package model;

/**
*<b>Description:</b> The class FoodCompany in the package model.<br>
*@author Esteban Ariza Acosta
*/
public class FoodCompany extends ProductionCompany{

	//Attributes
	private boolean kosherCertification;
	private boolean goodAgriculturalPractices;
	private String chemicals;


	//Constructor
	/**
	*<b>Description:</b> The constructor of the class [Class]Company.<br>
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
	*@param kosherCertification The existence of the kosher certification we want to set.
	*@param goodAgriculturalPractices The existence of good agricultural practices we want to set.
	*@param chemicals The chemicals for the products creation we want to set.
	*/
	public FoodCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type, boolean kosherCertification, boolean goodAgriculturalPractices, String chemicals){

		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type);

		this.kosherCertification=kosherCertification;
		this.goodAgriculturalPractices=goodAgriculturalPractices;
		this.chemicals=chemicals;

	}

	//Do
	/**
	*<b>Description:</b> Shows some data of the object in a String.<br>
	*@return A String that is the data of the object.
	*/
	public String toString(){

		String toString=super.toString();
		if(kosherCertification){toString+="\n	Certificado Kosher: Si";}
		else{toString+="\n	Certificado Kosher: No";}
		if(goodAgriculturalPractices){toString+="\n	Buena Practicas Agricolas: Si";}
		else{toString+="\n	Buena Practicas Agricolas: Si";}
		toString+="\n	Quimicos: "+chemicals;
		return toString;

	}

}

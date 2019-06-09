package model;

/**
*<b>Description:</b> The abstract class SubordinateCompany in the package model.<br>
*@author Esteban Ariza Acosta
*/
public abstract class SubordinateCompany extends Company{

	//Constants
	public final static String[] COMPANY_TYPES={"AGRICULTURA, CAZA, SILVICULTURA Y PEZCA", "EXPLOTACION DE MINAS Y CANTERAS", "INDUSTRIA MANUFACTURERA", "ELECTRICIDAD, GAS Y VAPOR", "CONSTRUCCION", "COMERCIO AL POR MAYOR Y AL POR MENOR", "TRANSPORTE, ALMACENAMIENTO Y COMUNICACIONES", "ESTATUTOS FINANCIEROS, SEGUROS, BIENES E INMUEBLES, SERVICIOS A COMPANIAS", "COMUNALES, SOCIALES"};

	//Attributes
	private String type;

	//Constructor
	/**
	*<b>Description:</b> The constructor of the class SubordinateCompany.<br>
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
	public SubordinateCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue,  int creationDay, int creationMonth, int creationYear, int floors, String type){

		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors);

		this.type=type;

	}

	//Do
	/**
	*<b>Description:</b> Shows some data of the object in a String.<br>
	*@return A String that is the data of the object.
	*/
	public String toString(){

		String toString=super.toString();
		toString+="\n	Tipo: "+type;
		return toString;

	}

}

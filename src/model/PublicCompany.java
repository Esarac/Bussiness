package model;

/**
*<b>Description:</b> The class PublicCompany in the package model.<br>
*@author Esteban Ariza Acosta
*/
public class PublicCompany extends ServiceCompany implements ProCulturizer{

	//Constants
	public final static String[] SERVICE_TYPES={"ALCANTARILLADO", "ENERGIA", "ACUEDUCTO"};

	//Attributes
	private String service;
	private int subscribersQuantity;
	private int lowStratumSubscribersQuantity;

	//Constructor
	/**
	*<b>Description:</b> The constructor of the class PublicCompany.<br>
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
	*@param service The provided service we want to set.
	*@param subscribersQuantity The subscribers quantity we want to set.
	*@param lowStratumSubscribersQuantity The low stratum subscribers quantity we want to set.
	*/
	public PublicCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type, String service, int subscribersQuantity, int lowStratumSubscribersQuantity){

		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type);

		this.service=service;
		this.subscribersQuantity=subscribersQuantity;
		this.lowStratumSubscribersQuantity=lowStratumSubscribersQuantity;

	}

	//Do
	/**
	*<b>Description:</b> Shows some data of the object in a String.<br>
	*@return A String that is the data of the object.
	*/
	public String toString(){

		String toString=super.toString();
		toString+="\n	Servicio: "+service;
		toString+="\n	Cantidad Suscriptores: "+subscribersQuantity;
		toString+="\n	Cantidad Suscriptores Estrato Bajo: "+lowStratumSubscribersQuantity;
		return toString;

	}

	/**
	*<b>Description:</b> Calculate the proculture tax for the company by the subscribers quantity.<br>
	*<b>Pre:</b> The subscribersQuantity must not be <code>0</code>.
	*@return A double that is the proculture tax.
	*/
	public double calculateTaxProCuluture(){

		double tax=0.4-((double)(subscribersQuantity-lowStratumSubscribersQuantity)/subscribersQuantity);
		if(tax<0){

			tax=0;

		}

		return tax;

	}

}

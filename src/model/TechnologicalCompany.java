package model;

/**
*<b>Description:</b> The class TechnologicalCompany in the package model.<br>
*@author Esteban Ariza Acosta
*/
public class TechnologicalCompany extends ServiceCompany implements TreePlanter{

	//Constants
	public final static String[] SERVICE_TYPES={"CONSULTORIA", "CAPACITACION", "DESARROLLO DE SOFTWARE A LA MEDIDA", "INFRAESTRUCTURA COMO SERVICIO", "SOFTWARE COMO SERVICIO", "PLATAFORMA COMO SERVICIO"};

	//Attributes
	private double energy;
	private boolean[] services;

	//Constructor
	/**
	*<b>Description:</b> The constructor of the class TechnologicalCompany.<br>
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
	*@param energy The energy we want to set.
	*@param services0 The availability of the first service we want to set.
	*@param services1 The availability of the second service we want to set.
	*@param services2 The availability of the third service we want to set.
	*@param services3 The availability of the fourth service we want to set.
	*@param services4 The availability of the fifth service we want to set.
	*@param services5 The availability of the sixth service we want to set.
	*/
	public TechnologicalCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type, double energy, boolean services0, boolean services1, boolean services2, boolean services3, boolean services4, boolean services5){

		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type);

		this.energy=energy;

		this.services=new boolean[6];
		this.services[0]=services0;
		this.services[1]=services1;
		this.services[2]=services2;
		this.services[3]=services3;
		this.services[4]=services4;
		this.services[5]=services5;

	}

	//Do
	/**
	*<b>Description:</b> Shows some data of the object in a String.<br>
	*<b>Pre:</b> The attribute services must not be null.<br>
	*@return A String that is the data of the object.
	*@throws NullPointerException If the attribute services of the company is null.
	*/
	public String toString(){

		String toString=super.toString();
		toString+="\n	Energia Consumida: "+energy;
		toString+="\n	Servicios: ";
		boolean found=false;
		for(int i=0; i<services.length; i++){

			if(services[i]){

				if(found){

					toString+=", "+SERVICE_TYPES[i];

				}
				else{

					toString+=SERVICE_TYPES[i];

				}
				found=true;

			}

		}
		return toString;

	}

	/**
	*<b>Description:</b> Calculate the trees quantity that the company need to plant in a year by the used energy of the company.<br>
	*@return A int that is the trees quantity that is needed to plant in a year.
	*/
	public int calculateYearTreePlanting(){

		int trees=0;
		if((energy>=1)&&(energy<=1000)){

			trees=8;

		}
		else if((energy>1000)&&(energy<=3000)){

			trees=35;

		}
		else if(energy>3000){

			trees=500;

		}

		return trees;

	}

}

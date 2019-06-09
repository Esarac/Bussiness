package model;

/**
*<b>Description:</b> The class PharmaceuticalCompany in the package model.<br>
*@author Esteban Ariza Acosta
*/
public class PharmaceuticalCompany extends ProductionCompany implements TreePlanter{

	//Constants
	public final static String[] MODALITY_TYPES={"FABRICAR Y EXPORTAR", "FABRICAR Y VENDER", "IMPORTAR Y VENDER"};

	//Attributes
	private String sanitaryRecord;
	private boolean status;
	private Date expiration;
	private String modality;

	//Constructor
	/**
	*<b>Description:</b> The constructor of the class PharmaceuticalCompany.<br>
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
	*@param sanitaryRecord The sanitary record we want to set.
	*@param status The status for the sanitary record we want to set.
	*@param expirationMonth The expiration month for the expiration of the sanitary record we want to set.
	*@param expirationYear The expiration year for the expiration of the sanitary record we want to set.
	*@param modality The modality we want to set.
	*/
	public PharmaceuticalCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type, String sanitaryRecord, boolean status, int expirationMonth, int expirationYear, String modality){

		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type);

		this.sanitaryRecord=sanitaryRecord;
		this.status=status;

		Date expiration=new Date(expirationMonth, expirationYear);
		this.expiration=expiration;

		this.modality=modality;

	}

	//Do
	/**
	*<b>Description:</b> Shows some data of the object in a String.<br>
	*<b>Pre:</b> The attribute expiration must not be null.<br>
	*@return A String that is the data of the object.
	*@throws NullPointerException If the attribute expiration of the company is null.
	*/
	public String toString(){

		String toString=super.toString();
		toString+="\n	Registro Sanitario: "+sanitaryRecord;
		if(status){toString+="\n	Estado: Vigente";}
		else{toString+="\n	Estado: No renovado";}
		toString+="\n	Vencimiento: "+expiration.toString();
		toString+="\n	Modalidad: "+modality;
		return toString;

	}

	/**
	*<b>Description:</b> Calculate the trees quantity that the company need to plant in a year by the quantity of water used to create their products.<br>
	*<b>Pre:</b> The attribute products and the elements inside of it must not be null.<br>
	*@return A int that is the trees quantity that is needed to plant in a year.
	*@throws NullPointerException If the attribute products or the elements inside of it of the company are null.
	*/
	public int calculateYearTreePlanting(){

		double water=0;
		for(int i=0; i<getProducts().size(); i++){

			water+=(getProducts().get(i).getRequiredWater())*(getProducts().get(i).getQuantity());

		}

		int trees=0;
		if((water>=1)&&(water<=140)){

			trees=6;

		}
		else if((water>140)&&(water<=800)){

			trees=25;

		}
		else if(water>800){

			trees=200;

		}

		return trees;

	}

}

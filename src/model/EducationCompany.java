package model;

/**
*<b>Description:</b> The class EducationCompany in the package model.<br>
*@author Esteban Ariza Acosta
*/
public class EducationCompany extends ServiceCompany implements ProCulturizer{

	//Constants
	public final static String[] SECTOR_TYPES={"BACHILLERATO", "UNIVERSIDAD"};

	//Attributes
	private String menId;
	private String sector;
	private String principalName;
	private int studentQuantity;
	private int lowStratumStudentQuantity;
	private int ratingSaber;
	private int accreditedYears;

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
	*@param menId The id of the men we want to set.
	*@param sector The sector we want to set.
	*@param principalName The principals name we want to set.
	*@param studentQuantity The student quantity we want to set.
	*@param lowStratumStudentQuantity The low stratum student quantity we want to set.
	*@param ratingSaber The rating on the saber 11/pro we want to set.
	*@param accreditedYears The high quality accredited years we want to set.
	*/
	public EducationCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type, String menId, String sector, String principalName, int studentQuantity, int lowStratumStudentQuantity, int ratingSaber, int accreditedYears){

		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type);

		this.menId=menId;
		this.sector=sector;
		this.principalName=principalName;
		this.studentQuantity=studentQuantity;
		this.lowStratumStudentQuantity=lowStratumStudentQuantity;
		this.ratingSaber=ratingSaber;
		this.accreditedYears=accreditedYears;

	}

	//Do
	/**
	*<b>Description:</b> Shows some data of the object in a String.<br>
	*@return A String that is the data of the object.
	*/
	public String toString(){

		String toString=super.toString();
		toString+="\n	Men Id: "+menId;
		toString+="\n	Sector: "+sector;
		toString+="\n	Director: "+principalName;
		toString+="\n	Cantidad Estudiantes: "+studentQuantity;
		toString+="\n	Cantidad Estudiantes Estrato Bajo: "+lowStratumStudentQuantity;
		toString+="\n	Puesto Saber11/SaberPro: "+ratingSaber;
		toString+="\n	Anios Acreditados: "+accreditedYears;
		return toString;

	}

	/**
	*<b>Description:</b> Calculate the proculture tax for the company by the student quantity.<br>
	*<b>Pre:</b> The studentQuantity must not be <code>0</code>.
	*@return A double that is the proculture tax.
	*/
	public double calculateTaxProCuluture(){

		double tax=0.2-((double)lowStratumStudentQuantity/studentQuantity);
		if(tax<0){

			tax=0;

		}

		return tax;

	}

}

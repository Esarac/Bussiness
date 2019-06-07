package model;

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
	
	public double calculateTaxProCuluture(){
		
		double tax=0.2-((double)lowStratumStudentQuantity/studentQuantity);
		if(tax<0){
			
			tax=0;
			
		}
		
		return tax;
		
	}
	
}
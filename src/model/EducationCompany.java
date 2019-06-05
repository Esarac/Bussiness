package model;

public class EducationCompany extends ServiceCompany{
	
	//Constants
	public final static String[] SECTOR_TYPES={"BACHILLERATO", "UNIVERSIDAD"};
	
	//Attributes
	private String menId;
	private String sector;
	private String principalName;
	private int studentQuantity;
	private int lowStratumStudentQuantity;
	private int ratingSaber11;
	private int ratingSaberPro;
	private int accreditedYears;
	
	//Constructor
	public EducationCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, Date creationDate, int floors, int cubicles, String type, String menId, String sector, String principalName, int studentQuantity, int lowStratumStudentQuantity, int ratingSaber11, int ratingSaberPro, int accreditedYears){
		
		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDate, floors, cubicles, type);
		
		this.menId=menId;
		this.sector=sector;
		this.principalName=principalName;
		this.studentQuantity=studentQuantity;
		this.lowStratumStudentQuantity=lowStratumStudentQuantity;
		this.ratingSaber11=ratingSaber11;
		this.ratingSaberPro=ratingSaberPro;
		this.accreditedYears=accreditedYears;
		
	}
	
	//Do
	public String toString(){
		
		String toString="\n	Nombre: "+getName()+"\n	Nit: "+getNit()+"\n	Representante Legal: "+getRepresentativeName()+"\n	Dirreccion: "+getAddress()+"\n	Telefono: "+getPhone()+"\n	Cantidad Empleados: "+getEmployeeQuantity()+"\n	Valor Activos: "+getAssetsValue()+"\n	Fecha Constitucion: "+getCreationDate().toString(true)+"\n	Tipo: "+getType()+"\n	Men Id: "+menId+"\n	Sector: "+sector+"\n	Director: "+principalName+"\n	Cantidad Estudiantes: "+studentQuantity+"\n	Cantidad Estudiantes Estrato Bajo: "+lowStratumStudentQuantity+"\n	Puesto Saber11: "+ratingSaber11+"\n	Puesto SaberPro: "+ratingSaberPro+"\n	Anios Acreditados: "+accreditedYears;
		return toString;
		
	}
	
}
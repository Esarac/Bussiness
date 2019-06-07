package model;

public abstract class SubordinateCompany extends Company{
	
	//Constants
	public final static String[] COMPANY_TYPES={"AGRICULTURA, CAZA, SILVICULTURA Y PEZCA", "EXPLOTACION DE MINAS Y CANTERAS", "INDUSTRIA MANUFACTURERA", "ELECTRICIDAD, GAS Y VAPOR", "CONSTRUCCION", "COMERCIO AL POR MAYOR Y AL POR MENOR", "TRANSPORTE, ALMACENAMIENTO Y COMUNICACIONES", "ESTATUTOS FINANCIEROS, SEGUROS, BIENES E INMUEBLES, SERVICIOS A COMPANIAS", "COMUNALES, SOCIALES"};
	
	//Attributes
	private String type;
	
	//Constructor
	public SubordinateCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue,  int creationDay, int creationMonth, int creationYear, int floors, String type){
		
		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors);
		
		this.type=type;
		
	}
	
	//Do
	public String toString(){
		
		String toString=super.toString();
		toString+="\n	Tipo: "+type;
		return toString;
		
	}
	
}
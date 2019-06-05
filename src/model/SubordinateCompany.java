package model;

public abstract class SubordinateCompany extends Company{
	
	//Constants
	public final static String[] COMPANY_TYPES={"AGRICULTURA, CAZA, SILVICULTURA Y PEZCA", "EXPLOTACION DE MINAS Y CANTERAS", "INDUSTRIA MANUFACTURERA", "ELECTRICIDAD, GAS Y VAPOR", "CONSTRUCCION", "COMERCIO AL POR MAYOR Y AL POR MENOR", "TRANSPORTE, ALMACENAMIENTO Y COMUNICACIONES", "ESTATUTOS FINANCIEROS, SEGUROS, BIENES E INMUEBLES, SERVICIOS A COMPANIAS", "COMUNALES, SOCIALES"};
	
	//Attributes
	private String type;
	
	//Constructor
	public SubordinateCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, Date creationDate, int floors, int cubicles, String type){
		
		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDate, floors, cubicles);
		
		this.type=type;
		
	}
	
	//Do
	public String toString(){
		
		String toString="\n	Nombre: "+getName()+"\n	Nit: "+getNit()+"\n	Representante Legal: "+getRepresentativeName()+"\n	Dirreccion: "+getAddress()+"\n	Telefono: "+getPhone()+"\n	Cantidad Empleados: "+getEmployeeQuantity()+"\n	Valor Activos: "+getAssetsValue()+"\n	Fecha Constitucion: "+getCreationDate().toString(true)+"\n	Tipo: "+type;
		return toString;
		
	}
	
	//Gets
	public String getType(){
		
		return type;
		
	}
	
}
package model;

public class PublicCompany extends ServiceCompany{
	
	//Constants
	public final static String[] SERVICE_TYPES={"ALCANTARILLADO", "ENERGIA", "ACUEDUCTO"};
	
	//Attributes
	private String service;
	private int subscribersQuantity;
	private int lowStratumSubscribersQuantity;
	
	//Constructor
	public PublicCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, Date creationDate, int floors, int cubicles, String type, String service, int subscribersQuantity, int lowStratumSubscribersQuantity){
		
		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDate, floors, cubicles, type);
		
		this.service=service;
		this.subscribersQuantity=subscribersQuantity;
		this.lowStratumSubscribersQuantity=lowStratumSubscribersQuantity;
		
	}
	
	//Do
	public String toString(){
		
		String toString="\n	Nombre: "+getName()+"\n	Nit: "+getNit()+"\n	Representante Legal: "+getRepresentativeName()+"\n	Dirreccion: "+getAddress()+"\n	Telefono: "+getPhone()+"\n	Cantidad Empleados: "+getEmployeeQuantity()+"\n	Valor Activos: "+getAssetsValue()+"\n	Fecha Constitucion: "+getCreationDate().toString(true)+"\n	Tipo: "+getType()+"\n	Servicio: "+service+"\n	Cantidad Suscriptores: "+subscribersQuantity+"\n	Cantidad Suscriptores Estrato Bajo: "+lowStratumSubscribersQuantity;
		return toString;
		
	}
	
}
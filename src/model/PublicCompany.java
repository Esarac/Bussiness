package model;

public class PublicCompany extends ServiceCompany implements ProCulturizer{
	
	//Constants
	public final static String[] SERVICE_TYPES={"ALCANTARILLADO", "ENERGIA", "ACUEDUCTO"};
	
	//Attributes
	private String service;
	private int subscribersQuantity;
	private int lowStratumSubscribersQuantity;
	
	//Constructor
	public PublicCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type, String service, int subscribersQuantity, int lowStratumSubscribersQuantity){
		
		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type);
		
		this.service=service;
		this.subscribersQuantity=subscribersQuantity;
		this.lowStratumSubscribersQuantity=lowStratumSubscribersQuantity;
		
	}
	
	//Do
	public String toString(){
		
		String toString=super.toString();
		toString+="\n	Servicio: "+service;
		toString+="\n	Cantidad Suscriptores: "+subscribersQuantity;
		toString+="\n	Cantidad Suscriptores Estrato Bajo: "+lowStratumSubscribersQuantity;
		return toString;
		
	}
	
	public double calculateTaxProCuluture(){
		
		double tax=0.4-((double)(subscribersQuantity-lowStratumSubscribersQuantity)/subscribersQuantity);
		if(tax<0){
			
			tax=0;
			
		}
		
		return tax;
		
	}
	
}
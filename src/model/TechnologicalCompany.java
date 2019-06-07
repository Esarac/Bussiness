package model;

public class TechnologicalCompany extends ServiceCompany implements TreePlanter{
	
	//Constants
	public final static String[] SERVICE_TYPES={"CONSULTORIA", "CAPACITACION", "DESARROLLO DE SOFTWARE A LA MEDIDA", "INFRAESTRUCTURA COMO SERVICIO", "SOFTWARE COMO SERVICIO", "PLATAFORMA COMO SERVICIO"};	
	
	//Attributes
	private double energy;
	private boolean[] services;
	
	//Constructor
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
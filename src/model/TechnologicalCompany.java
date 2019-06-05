package model;
import java.util.ArrayList;

public class TechnologicalCompany extends ServiceCompany{
	
	//Constants
	public final static String[] SERVICE_TYPES={"CONSULTORIA", "CAPACITACION", "DESARROLLO DE SOFTWARE A LA MEDIDA", "INFRAESTRUCTURA COMO SERVICIO", "SOFTWARE COMO SERVICIO", "PLATAFORMA COMO SERVICIO"};	
	
	//Attributes
	private boolean[] services;
	
	//Constructor
	public TechnologicalCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, Date creationDate, int floors, int cubicles, String type, boolean services0, boolean services1, boolean services2, boolean services3, boolean services4, boolean services5){
		
		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDate, floors, cubicles, type);
		
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
		
		String toString="\n	Nombre: "+getName()+"\n	Nit: "+getNit()+"\n	Representante Legal: "+getRepresentativeName()+"\n	Dirreccion: "+getAddress()+"\n	Telefono: "+getPhone()+"\n	Cantidad Empleados: "+getEmployeeQuantity()+"\n	Valor Activos: "+getAssetsValue()+"\n	Fecha Constitucion: "+getCreationDate().toString(true)+"\n	Tipo: "+getType()+"\n	Servicios: ";
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
	
}
package model;

public class FoodCompany extends ProductionCompany{
	
	//Attributes
	private boolean kosherCertification;
	private boolean goodAgriculturalPractices;
	private String chemicals;
	
	
	//Constructor
	public FoodCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, Date creationDate, int floors, int cubicles, String type, boolean kosherCertification, boolean goodAgriculturalPractices, String chemicals){
		
		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDate, floors, cubicles, type);
		
		this.kosherCertification=kosherCertification;
		this.goodAgriculturalPractices=goodAgriculturalPractices;
		this.chemicals=chemicals;
		
	}
	
	//Do
	public String toString(){
		
		String toString="\n	Nombre: "+getName()+"\n	Nit: "+getNit()+"\n	Representante Legal: "+getRepresentativeName()+"\n	Dirreccion: "+getAddress()+"\n	Telefono: "+getPhone()+"\n	Cantidad Empleados: "+getEmployeeQuantity()+"\n	Valor Activos: "+getAssetsValue()+"\n	Fecha Constitucion: "+getCreationDate().toString(true)+"\n	Tipo: "+getType()+"\n	Certificado Kosher: "+kosherCertification+"\n	Buena Practicas Agricolas: "+goodAgriculturalPractices+"\n	Quimicos: "+chemicals;
		for(int i=0; i<getProducts().size(); i++){
			
			toString+="\n	~Producto "+(i+1)+":"+getProducts().get(i).toString();
			
		}
		return toString;
		
	}
	
}
package model;

public class FoodCompany extends ProductionCompany{
	
	//Attributes
	private boolean kosherCertification;
	private boolean goodAgriculturalPractices;
	private String chemicals;
	
	
	//Constructor
	public FoodCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type, boolean kosherCertification, boolean goodAgriculturalPractices, String chemicals){
		
		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type);
		
		this.kosherCertification=kosherCertification;
		this.goodAgriculturalPractices=goodAgriculturalPractices;
		this.chemicals=chemicals;
		
	}
	
	//Do
	public String toString(){
		
		String toString=super.toString();
		if(kosherCertification){toString+="\n	Certificado Kosher: Si";}
		else{toString+="\n	Certificado Kosher: No";}
		if(goodAgriculturalPractices){toString+="\n	Buena Practicas Agricolas: Si";}
		else{toString+="\n	Buena Practicas Agricolas: Si";}
		toString+="\n	Quimicos: "+chemicals;
		return toString;
		
	}
	
}
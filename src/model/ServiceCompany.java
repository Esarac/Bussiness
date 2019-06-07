package model;

public class ServiceCompany extends SubordinateCompany{
	
	//Attributes
	private Survey[] surveys;
	
	//Constructor
	public ServiceCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type){
		
		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type);
		
		this.surveys=new Survey[50];
		
	}
	
	//Do
	public String toString(){
		
		String toString=super.toString();
		toString+="\n	Encuestas: "+calculateSurveyQuantity();
		return toString;
		
	}
	
	public int calculateSurveyQuantity(){
		
		int quantity=0;
		for(int i=0;i<surveys.length;i++){
			
			if(surveys[i]!=null){
				
				quantity++;
				
			}
			
		}
		
		return quantity;
		
	}
	
	public double calculateSatisfaction(){
		
		double satisfaction=0;
		if(calculateSurveyQuantity()>=10){
			
			for(int i=0; i<surveys.length; i++){
				
				if(surveys[i]!=null){
					
					satisfaction+=surveys[i].calculateSatisfaction();
					
				}
				
			}
			satisfaction/=calculateSurveyQuantity();
			
		}
		
		return satisfaction;
		
	}
	
	//Add
	public String addSurvey(Survey survey){
		
		String message="No se pudo anadir porque ya existen 50 encuestas";
		
		boolean run=true;
		for(int i=0; (i<surveys.length)&&run; i++){
			
			if(surveys[i]==null){
				
				surveys[i]=survey;
				message="Se ha aniadido la encuesta a la empresa";
				run=false;
				
			}
			
		}
		
		return message;
		
	}
	
}
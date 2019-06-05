package model;
import java.util.ArrayList;

public class ServiceCompany extends SubordinateCompany{
	
	//Attributes
	private ArrayList<Survey> surveys;
	
	//Constructor
	public ServiceCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, Date creationDate, int floors, int cubicles, String type){
		
		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDate, floors, cubicles, type);
		
		this.surveys=new ArrayList<Survey>();
		
	}
	
	//Do
	public double calculateSatisfaction(){
		
		double satisfaction=0;
		if((surveys.size()>=10)&&(surveys.size()<=50)){
			
			for(int i=0; i<surveys.size(); i++){
				
				satisfaction+=surveys.get(i).calculateSatisfaction();
				
			}
			satisfaction/=surveys.size();
			
		}
		
		return satisfaction;
		
	}
	
	//Add
	public String addSurvey(Survey survey){
		
		String message="Se ha aniadido la encuesta a la empresa";
		
		surveys.add(survey);
		
		return message;
		
	}
	
}
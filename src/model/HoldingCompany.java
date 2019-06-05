package model;
import java.util.ArrayList;

public class HoldingCompany extends Company{
	
	//Attributes
	private ArrayList<Company> companies;
	
	//Constructor
	public HoldingCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, Date creationDate, int floors, int cubicles){
		
		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDate, floors, cubicles);
		
		this.companies=new ArrayList<Company>();
		
	}
	
	//Do
	public String toString(){
		
		String toString="\nNombre: "+getName()+"\nNit: "+getNit()+"\nRepresentante Legal: "+getRepresentativeName()+"\nDirreccion: "+getAddress()+"\nTelefono: "+getPhone()+"\nCantidad Empleados: "+getEmployeeQuantity()+"\nValor Activos: "+getAssetsValue()+"\nFecha Constitucion: "+getCreationDate().toString(true);
		for(int i=0; i<companies.size(); i++){
			
			if(companies.get(i) instanceof TechnologicalCompany){
				
				TechnologicalCompany technologicalCompany=(TechnologicalCompany)companies.get(i);
				toString+="\n~Empresa "+(i+1)+" (Tecnologica):"+technologicalCompany.toString();
				
			}
			else if(companies.get(i) instanceof EducationCompany){
				
				EducationCompany educationCompany=(EducationCompany)companies.get(i);
				toString+="\n~Empresa "+(i+1)+" (Educacion):"+educationCompany.toString();
				
			}
			else if(companies.get(i) instanceof PublicCompany){
				
				PublicCompany publicCompany=(PublicCompany)companies.get(i);
				toString+="\n~Empresa "+(i+1)+" (Servicios Publicos):"+publicCompany.toString();
				
			}
			else if(companies.get(i) instanceof PharmaceuticalCompany){
				
				PharmaceuticalCompany pharmaceuticalCompany=(PharmaceuticalCompany)companies.get(i);
				toString+="\n~Empresa "+(i+1)+" (Medicamentos):"+pharmaceuticalCompany.toString();
				
			}
			
			else if(companies.get(i) instanceof FoodCompany){
				
				FoodCompany foodCompany=(FoodCompany)companies.get(i);
				toString+="\n~Empresa "+(i+1)+" (Alimentos):"+foodCompany.toString();
				
			}
			else if(companies.get(i) instanceof ProductionCompany){
				
				ProductionCompany productionCompany=(ProductionCompany)companies.get(i);
				toString+="\n~Empresa "+(i+1)+" (Fabricacion):"+productionCompany.toString();
				
			}
			else{
				
				toString+="\n~Empresa "+(i+1)+":"+companies.get(i).toString();
				
			}
			
		}
		return toString;
		
	}
	
	public String showSatisfaction(String companyNit){
		
		String message="No se encontro la empresa con el nit digitado o la empresa no es una emnpresa de fabricacion";
		
		for(int i=0;i < companies.size();i++){
			
			if(companies.get(i)!=null){
				
				if((companyNit.equals(companies.get(i).getNit())) && (companies.get(i) instanceof ServiceCompany)){
					
					ServiceCompany company=(ServiceCompany)companies.get(i);
					if(company.calculateSatisfaction()!=0){
						
						message="Satisfaccion: "+company.calculateSatisfaction();
						
					}
					else{
						
						message="No tiene el numero de encuestas esperado";
						
					}
					
				}
				
			}
			
		}
		
		return message;
		
	}
	
	//Add
	public String addTechnologicalCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, Date creationDate, int floors, int cubicles, String type, boolean services0, boolean services1, boolean services2, boolean services3, boolean services4, boolean services5){//Son iguales ! lol
		
		String message="Se ha aniadido una empresa tecnologica";
		
		Company technologicalCompany=new TechnologicalCompany(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDate, floors, cubicles, type, services0, services1, services2, services3, services4, services5);
		companies.add(technologicalCompany);
		
		return message;
		
	}
	
	public String addEducationCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, Date creationDate, int floors, int cubicles, String type, String menId, String sector, String principalName, int studentQuantity, int lowStratumStudentQuantity, int ratingSaber11, int ratingSaberPro, int highQualityCuAccreditedYears){
		
		String message="Se ha aniadido una empresa de educacion";
		
		Company educationCompany=new EducationCompany(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDate, floors, cubicles, type, menId, sector, principalName, studentQuantity, lowStratumStudentQuantity, ratingSaber11, ratingSaberPro, highQualityCuAccreditedYears);
		companies.add(educationCompany);
		
		return message;
		
	}
	
	public String addPublicCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, Date creationDate, int floors, int cubicles, String type, String service, int subscribersQuantity, int lowStratumSubscribersQuantity){
		
		String message="Se ha aniadido una empresa de servicios publicos";
		
		Company publicCompany=new PublicCompany(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDate, floors, cubicles, type, service, subscribersQuantity, lowStratumSubscribersQuantity);
		companies.add(publicCompany);
		
		return message;
		
	}
	
	public String addProductionCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, Date creationDate, int floors, int cubicles, String type){//Son iguales ! lol
		
		String message="Se ha aniadido una empresa de fabricacion";
		
		Company productionCompany=new ProductionCompany(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDate, floors, cubicles, type);
		companies.add(productionCompany);
		
		return message;
		
	}
	
	public String addPharmaceuticalCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, Date creationDate, int floors, int cubicles, String type, String sanitaryRecord, boolean status, Date expiration, String modality){
		
		String message="Se ha aniadido una empresa de medicamentos";
		
		Company pharmaceuticalCompany=new PharmaceuticalCompany(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDate, floors, cubicles, type, sanitaryRecord, status, expiration, modality);
		companies.add(pharmaceuticalCompany);
		
		return message;
		
	}
	
	public String addFoodCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, Date creationDate, int floors, int cubicles, String type, boolean kosherCertification, boolean goodAgriculturalPractices, String chemicals){
		
		String message="Se ha aniadido una empresa de alimentos";
		
		Company foodCompany=new FoodCompany(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDate, floors, cubicles, type, kosherCertification, goodAgriculturalPractices, chemicals);
		companies.add(foodCompany);
		
		return message;
		
	}
	
	public String addProduct(String name, String id, double requiredWater, int quantity, String companyNit){
		
		String message="No se encontro la empresa con el nit digitado o la empresa no es una empresa de fabricacion";
		
		for(int i=0;i < companies.size();i++){
			
			if(companies.get(i)!=null){
				
				if((companyNit.equals(companies.get(i).getNit())) && (companies.get(i) instanceof ProductionCompany)){
					
					ProductionCompany company=(ProductionCompany)companies.get(i);
					Product product=new Product(name, id, requiredWater, quantity);
					message=company.addProduct(product);
					
				}
				
			}
			
		}
		
		return message;
		
	}
	
	public String addEmployee(String employeeName, String employeeCharge, String employeeEmail, String companyNit){
		
		String message="No se encontro la empresa con el nit digitado";
		
		for(int i=0;i < companies.size();i++){
			
			if(companies.get(i)!=null){
				
				if(companyNit.equals(companies.get(i).getNit())){
					
					message=companies.get(i).addEmployee(employeeName, employeeCharge, employeeEmail);
					
				}
				
			}
			
		}
		
		return message;
		
	}
	
	public String addSurvey(int answer0, int answer1, int answer2, String companyNit){
		
		String message="No se encontro la empresa con el nit digitado o la empresa no es una empresa de servicios";
		
		for(int i=0;i < companies.size();i++){
			
			if(companies.get(i)!=null){
				
				if((companyNit.equals(companies.get(i).getNit())) && (companies.get(i) instanceof ServiceCompany)){
					
					ServiceCompany company=(ServiceCompany)companies.get(i);
					Survey survey=new Survey(answer0, answer1, answer2);
					message=company.addSurvey(survey);
					
				}
				
			}
			
		}
		
		return message;
		
	}
	
}
package model;
import java.util.ArrayList;

public class HoldingCompany extends Company{
	
	//Attributes
	private ArrayList<Company> companies;
	
	//Constructor
	public HoldingCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors){
		
		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors);
		
		this.companies=new ArrayList<Company>();
		
	}
	
	//Show
	public String showMenu(){
		
		String menu="___________________________________________________________________________________________________________";
		menu+="\nBienvenido al menu de la empresa de holding "+getName();
		menu+="\n___________________________________________________________________________________________________________";
		menu+="\n1.Mostrar datos de la empresa de holding";
		menu+="\n2.Crear una empresa";
		menu+="\n3.Registrar empleado";
		menu+="\n4.Mostrar la extencion del cubiculo del edificio por el nombre del empleado";
		menu+="\n5.Mostrar los correos de los empleados en un cargo especifico";
		menu+="\n6.Crear un producto [Empresa de fabricacion]";
		menu+="\n7.Registrar una encuesta [Empresa de servicios]";
		menu+="\n8.Mostrar Satisfaccion empresa de servicio [Empresa de servicios]";
		menu+="\n9.Mostrar impuesto procultura [Empresa de educacion/Empresa de servicios publicos]";
		menu+="\n10.Mostrar cantidad de arboles que debe plantar en un anio [Empresa de tecnologia/Empresa de medicamentos]";
		menu+="\n11.Salir";
		menu+="\n___________________________________________________________________________________________________________";
		menu+="\n~";
		return menu;
		
	}
	
	public String toString(){
	
		String toString="___________________________________________________________________________________________________________";
		toString+="\nNombre: "+getName();
		toString+="\nNit: "+getNit();
		toString+="\nRepresentante Legal: "+getRepresentativeName();
		toString+="\nDirreccion: "+getAddress();
		toString+="\nTelefono: "+getPhone();
		toString+="\nCantidad Empleados: "+getEmployeeQuantity();
		toString+="\nValor Activos: "+getAssetsValue();
		toString+="\nFecha Constitucion: "+getCreationDate().toString();
		toString+="\nPisos Edificio: "+getBuilding().length;
		for(int i=0; i<companies.size(); i++){
			
			if(companies.get(i) instanceof TechnologicalCompany){
				
				toString+="\n~Empresa "+(i+1)+" (Tecnologica):"+companies.get(i).toString();
				
			}
			else if(companies.get(i) instanceof EducationCompany){
				
				toString+="\n~Empresa "+(i+1)+" (Educacion):"+companies.get(i).toString();
				
			}
			else if(companies.get(i) instanceof PublicCompany){
				
				toString+="\n~Empresa "+(i+1)+" (Servicios Publicos):"+companies.get(i).toString();
				
			}
			else if(companies.get(i) instanceof PharmaceuticalCompany){
				
				toString+="\n~Empresa "+(i+1)+" (Medicamentos):"+companies.get(i).toString();
				
			}
			
			else if(companies.get(i) instanceof FoodCompany){
				
				toString+="\n~Empresa "+(i+1)+" (Alimentos):"+companies.get(i).toString();
				
			}
			else if(companies.get(i) instanceof ProductionCompany){
				
				toString+="\n~Empresa "+(i+1)+" (Fabricacion):"+companies.get(i).toString();
				
			}
			else{
				
				toString+="\n~Empresa "+(i+1)+":"+companies.get(i).toString();
				
			}
			
		}
		return toString;
		
	}
	
	public String showSatisfaction(String companyNit){
		
		String message="No se encontro la empresa con el nit digitado o la empresa no es una empresa de servicios";
		
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
	
	public String showTaxProCulture(String companyNit){
		
		String message="No se encontro la empresa con el nit digitado o la empresa no es una empresa de educacion o servicios publicos";
		
		for(int i=0;i < companies.size();i++){
			
			if(companies.get(i)!=null){
				
				if((companyNit.equals(companies.get(i).getNit())) && (companies.get(i) instanceof ProCulturizer)){
					
					ProCulturizer company=(ProCulturizer)companies.get(i);
					message="Impuesto Procultura: "+(company.calculateTaxProCuluture()*100)+"%";
					
				}
				
			}
			
		}
		
		return message;
		
	}
	
	public String showYearTreePlanting(String companyNit){
		
		String message="No se encontro la empresa con el nit digitado o la empresa no es una empresa tecnologica o de medicamentos";
		
		for(int i=0;i < companies.size();i++){
			
			if(companies.get(i)!=null){
				
				if((companyNit.equals(companies.get(i).getNit())) && (companies.get(i) instanceof TreePlanter)){
					
					TreePlanter company=(TreePlanter)companies.get(i);
					message="Arboles a Plantar por Anio: "+(company.calculateYearTreePlanting());
					
				}
				
			}
			
		}
		
		return message;
		
	}
	
	public String showExtension(String name, String type, String companyNit){
		
		String message="No se encontro la empresa con el nit digitado";
		
		if(companyNit.equals(getNit())){
			
			message=showExtension(name, type);
			
		}
		else{
			
			for(int i=0;i < companies.size();i++){
				
				if(companies.get(i)!=null){
					if((companyNit.equals(companies.get(i).getNit()))){
						
						message=companies.get(i).showExtension(name, type);
						
					}
				}
				
			}
			
		}
		
		return message;
		
	}
	
	public String showEmails(String charge, String companyNit){
		
		String message="No se encontro la empresa con el nit digitado";
		
		if(companyNit.equals(getNit())){
			
			message=showEmails(charge);
			
		}
		else{
			
			for(int i=0;i < companies.size();i++){
				
				if(companies.get(i)!=null){
					if((companyNit.equals(companies.get(i).getNit()))){
						
						message=companies.get(i).showEmails(charge);
						
					}
				}
				
			}
			
		}
		
		return message;
		
	}
	
	//Add
	public String addTechnologicalCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type, double energy, boolean services0, boolean services1, boolean services2, boolean services3, boolean services4, boolean services5){//Son iguales ! lol
		
		String message="Se ha aniadido una empresa tecnologica";
		
		Company technologicalCompany=new TechnologicalCompany(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type, energy, services0, services1, services2, services3, services4, services5);
		companies.add(technologicalCompany);
		
		return message;
		
	}
	
	public String addEducationCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type, String menId, String sector, String principalName, int studentQuantity, int lowStratumStudentQuantity, int ratingSaber, int accreditedYears){
		
		String message="Se ha aniadido una empresa de educacion";
		
		Company educationCompany=new EducationCompany(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type, menId, sector, principalName, studentQuantity, lowStratumStudentQuantity, ratingSaber, accreditedYears);
		companies.add(educationCompany);
		
		return message;
		
	}
	
	public String addPublicCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type, String service, int subscribersQuantity, int lowStratumSubscribersQuantity){
		
		String message="Se ha aniadido una empresa de servicios publicos";
		
		Company publicCompany=new PublicCompany(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type, service, subscribersQuantity, lowStratumSubscribersQuantity);
		companies.add(publicCompany);
		
		return message;
		
	}
	
	public String addProductionCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type){//Son iguales ! lol
		
		String message="Se ha aniadido una empresa de fabricacion";
		
		Company productionCompany=new ProductionCompany(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type);
		companies.add(productionCompany);
		
		return message;
		
	}
	
	public String addPharmaceuticalCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type, String sanitaryRecord, boolean status, int expirationMonth, int expirationYear, String modality){
		
		String message="Se ha aniadido una empresa de medicamentos";
		
		Company pharmaceuticalCompany=new PharmaceuticalCompany(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type, sanitaryRecord, status, expirationMonth, expirationYear, modality);
		companies.add(pharmaceuticalCompany);
		
		return message;
		
	}
	
	public String addFoodCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type, boolean kosherCertification, boolean goodAgriculturalPractices, String chemicals){
		
		String message="Se ha aniadido una empresa de alimentos";
		
		Company foodCompany=new FoodCompany(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type, kosherCertification, goodAgriculturalPractices, chemicals);
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
	
	public String addEmployee(String name, String charge, String email, String companyNit){
		
		String message="No se encontro la empresa con el nit digitado";
		
		if(companyNit.equals(getNit())){
			
			message=addEmployee(name, charge, email);
			
		}
		else{
			
			for(int i=0;i < companies.size();i++){
				
				if(companies.get(i)!=null){
					
					if(companyNit.equals(companies.get(i).getNit())){
						
						message=companies.get(i).addEmployee(name, charge, email);
						
					}
					
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
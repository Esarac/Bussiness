package ui;
import model.*;
import java.util.Scanner;

public class Main{
	
	//Attributes
	private HoldingCompany holding;
	private Scanner scanner;
	
	//Starter
	public static void main(String[]args){
		
		Main m=new Main();
		m.menu();
		
	}
	
	//Constructor
	public Main(){
		
		init();
		
	}
	
	//Initializer
	public void init(){
		
		//Scanner
		scanner=new Scanner(System.in);
		
		//HoldingCompany
		holding=new HoldingCompany("Johanios & Johanios", "1007678665", "Mateo Valdes", "Calle 15 #121-25", "5553333", 30000, 100000000, 9, 9, 2000, 7);
		
		//SubordinateCompany
		holding.addTechnologicalCompany("A", "1", "Esteban", "Calle 1", "1", 1, 1, 1, 1, 2000, 1, "1", 1, true, false, true, false, true, false);
		holding.addEducationCompany("B", "2", "Esteban", "Calle 2", "2", 2, 2, 2, 2, 2000, 2, "2", "2", "2", "2", 1, 1, 2, 2);
		holding.addPublicCompany("C", "3", "Esteban", "Calle 3", "3", 3, 3, 3, 3, 2000, 3, "3", "3", 3, 3);
		holding.addProductionCompany("D", "4", "Esteban", "Calle 4", "4", 4, 4, 4, 4, 2000, 4, "4");
		holding.addPharmaceuticalCompany("E", "5", "Esteban", "Calle 5", "5", 5, 5, 5, 5, 2000, 5, "5", "5", true, 5, 2019, "5");
		holding.addFoodCompany("F", "6", "Esteban", "Calle 6", "6", 6, 6, 6, 6, 2000, 6, "6", false, true, "6");
		
		//Employee
		for(int x=0; x<holding.getBuilding().length; x++){
			for(int y=0; y<holding.getBuilding()[0].length; y++){
				
				int valor=((x+1)*100)+(y+1);
				holding.addEmployee(valor+"", "a", valor+"");
				
			}
		}
		
	}
	
	//Menu
	public void menu(){
		
		boolean run=true;
		
		while(run){
			
			System.out.print(holding.showMenu());
			
			int option=scanner.nextInt();
			scanner.nextLine();
			
			switch(option){
				
				case 1:
					
					//ShowData
					System.out.println(holding.toString());
					
				break;
				
				case 2:
					
					//CompanyName
					System.out.print("Nombre de la empresa\n~");
					String companyName=scanner.nextLine();
					
					//CompanyNit
					System.out.print("Nit de la empresa\n~");
					String companyNit=scanner.next();
					scanner.nextLine();
					
					//CompanyRepresentativeName
					System.out.print("Nombre del representante legal de la empresa\n~");
					String companyRepresentativeName=scanner.nextLine();
					
					//CompanyAddress
					System.out.print("Direccion de la empresa\n~");
					String companyAddress=scanner.nextLine();
					
					//CompanyPhone
					System.out.print("Telefono de la empresa\n~");
					String companyPhone=scanner.next();
					scanner.nextLine();
					
					//CompanyEmployeeQuantity
					System.out.print("Cantidad de empleados de la empresa\n~");
					int companyEmployeeQuantity=askInt(0);
					
					//CompanyAssetsValue
					System.out.print("Valor en pesos de los activos de la empresa\n~");
					double companyAssetsValue=askDouble();
					
					//CompanyCreationDate
					System.out.print("Dia de constitucion de la empresa\n~");
					int companyCreationDay=askInt(1,31);
					System.out.print("Mes de constitucion de la empresa\n~");
					int companyCreationMonth=askInt(1,12);
					System.out.print("Anio de constitucion de la empres\n~");
					int companyCreationYear=scanner.nextInt();
					scanner.nextLine();
					
					//CompanyBuildingFloors
					System.out.print("Pisos del edificio de la empresa\n~");
					int companyFloors=askInt(3,7);
					
					//CompanyType
					System.out.print("Tipo de empresa\n 1."+SubordinateCompany.COMPANY_TYPES[0]+"\n 2."+SubordinateCompany.COMPANY_TYPES[1]+"\n 3."+SubordinateCompany.COMPANY_TYPES[2]+"\n 4."+SubordinateCompany.COMPANY_TYPES[3]+"\n 5."+SubordinateCompany.COMPANY_TYPES[4]+"\n 6."+SubordinateCompany.COMPANY_TYPES[5]+"\n 7."+SubordinateCompany.COMPANY_TYPES[6]+"\n 8."+SubordinateCompany.COMPANY_TYPES[7]+"\n 9."+SubordinateCompany.COMPANY_TYPES[8]+"\n~");
					String companyType=askConstant("SubordinateCompany");
					
					//CompanyKind
					System.out.print("Clase de empresa que deseas crear\n 1.Empresa tecnologica\n 2.Empresa de educacion\n 3.Empresa de servicios publicos\n 4.Empresa de fabricacion\n 5.Empresa de medicamentos\n 6.Empresa de alimentos\n~");
					int companyKind=askInt(1, 6);
					
					switch(companyKind){//###Hasta aqui he corregido!!!
						
						case 1:
							
							//CompanyEnergy
							System.out.println("Energia gastada de la empresa");
							double companyEnergy=askDouble();
							
							//CompanyService0
							System.out.println("Presta el servicio "+TechnologicalCompany.SERVICE_TYPES[0]+" la empresa tecnologica? 1.Si 2.No");
							boolean companyService0=askBoolean();
							
							//CompanyService1
							System.out.println("Presta el servicio "+TechnologicalCompany.SERVICE_TYPES[1]+" la empresa tecnologica? 1.Si 2.No");
							boolean companyService1=askBoolean();
							
							//CompanyService2
							System.out.println("Presta el servicio "+TechnologicalCompany.SERVICE_TYPES[2]+" la empresa tecnologica? 1.Si 2.No");
							boolean companyService2=askBoolean();
							
							//CompanyService3
							System.out.println("Presta el servicio "+TechnologicalCompany.SERVICE_TYPES[3]+" la empresa tecnologica? 1.Si 2.No");
							boolean companyService3=askBoolean();
							
							//CompanyService4
							System.out.println("Presta el servicio "+TechnologicalCompany.SERVICE_TYPES[4]+" la empresa tecnologica? 1.Si 2.No");
							boolean companyService4=askBoolean();
							
							//CompanyService5
							System.out.println("Presta el servicio "+TechnologicalCompany.SERVICE_TYPES[5]+" la empresa tecnologica? 1.Si 2.No");
							boolean companyService5=askBoolean();
							
							//CreateTechnologicalCompany
							System.out.println(holding.addTechnologicalCompany(companyName, companyNit, companyRepresentativeName, companyAddress, companyPhone, companyEmployeeQuantity, companyAssetsValue, companyCreationDay, companyCreationMonth, companyCreationYear, companyFloors, companyType, companyEnergy, companyService0, companyService1, companyService2, companyService3, companyService4, companyService5));
							
						break;
						
						case 2:
							
							//CompanyMenId
							System.out.println("Id del men de la empresa de educacion");
							String companyMenId=scanner.next();
							scanner.nextLine();
							
							//CompanySector
							System.out.println("Sector de la empresa de educacion 1.Bachillerato 2.Universidad");
							String companySector=askConstant("EducationCompany");
							
							//CompanyPrincipalName
							System.out.println("Director de la empresa de educacion");
							String companyPrincipalName=scanner.nextLine();
							
							//CompanyStudentQuantity
							System.out.println("Cantidad de estudiantes de la empresa de educacion");
							int companyStudentQuantity=askInt(0);
							
							//CompanyLowStratumStudentQuantity
							System.out.println("Cantidad de estudiantes de estrato 1 y 2 de la empresa de educacion");
							int companyLowStratumStudentQuantity=askInt(0, companyStudentQuantity);
							
							//CompanyRatingSaber
							System.out.println("Puesto en la prueba saber 11/Pro de la empresa de educacion");
							int companyRatingSaber=askInt(1);
							
							//CompanyHighQualityCuAccreditedYears
							System.out.println("Anios de acreditacion en alta calidad de la empresa de educacion");
							int companyHighQualityCuAccreditedYears=askInt(0);
							
							//CreateEducationCompany
							System.out.println(holding.addEducationCompany(companyName, companyNit, companyRepresentativeName, companyAddress, companyPhone, companyEmployeeQuantity, companyAssetsValue, companyCreationDay, companyCreationMonth, companyCreationYear, companyFloors, companyType, companyMenId, companySector, companyPrincipalName, companyStudentQuantity, companyLowStratumStudentQuantity, companyRatingSaber, companyHighQualityCuAccreditedYears));
							
						break;
						
						case 3:
							
							//CompanyService
							System.out.println("Servicio de la empresa de servicios publicos 1.Alcantarillado 2.Energia 3.Acueducto");
							String companyService=askConstant("PublicCompany");
							
							//CompanySubscribersQuantity
							System.out.println("Cantidad de suscriptores de la empresa");
							int companySubscribersQuantity=askInt(0);
							
							//CompanyLowStratumSubscribersQuantity
							System.out.println("Cantidad de suscriptores de estrato 1 y 2 de la empresa");
							int companyLowStratumSubscribersQuantity=askInt(0, companySubscribersQuantity);
							
							//CreatePublicCompany
							System.out.println(holding.addPublicCompany(companyName, companyNit, companyRepresentativeName, companyAddress, companyPhone, companyEmployeeQuantity, companyAssetsValue, companyCreationDay, companyCreationMonth, companyCreationYear, companyFloors, companyType, companyService, companySubscribersQuantity, companyLowStratumSubscribersQuantity));
							
						break;
						
						case 4:
							
							//CreateProductionCompany
							System.out.println(holding.addProductionCompany(companyName, companyNit, companyRepresentativeName, companyAddress, companyPhone, companyEmployeeQuantity, companyAssetsValue, companyCreationDay, companyCreationMonth, companyCreationYear, companyFloors, companyType));
							
						break;
						
						case 5:
							
							//CompanySanitaryRecord
							System.out.println("Registro sanitario del invima de la empresa");
							String companySanitaryRecord=scanner.nextLine();
							
							//CompanyStatus
							System.out.println("Estado del registro sanitario de la empresa 1.Activo 2.No renovado");
							boolean companyStatus=askBoolean();
							
							//CompanyExpiration
							System.out.println("Mes de vencimiento del invima de la empresa");
							int companyExpirationMonth=askInt(0, 12);
							scanner.nextLine();
							System.out.println("Anio de vencimiento del invima de la empresa");
							int companyExpirationYear=scanner.nextInt();
							scanner.nextLine();
							
							//CompanyModality
							System.out.println("Modalidad del invima de la empresa 1.Fab y Expo 2.Fab y Vend 3.Impo y Vend");
							String companyModality=askConstant("PharmaceuticalCompany");
							
							//CreatePharmaceuticalCompany
							System.out.println(holding.addPharmaceuticalCompany(companyName, companyNit, companyRepresentativeName, companyAddress, companyPhone, companyEmployeeQuantity, companyAssetsValue, companyCreationDay, companyCreationMonth, companyCreationYear, companyFloors, companyType, companySanitaryRecord, companyStatus, companyExpirationMonth, companyExpirationYear, companyModality));
							
						break;
						
						case 6:
							
							//CompanyKosherCertification
							System.out.println("Posee certificado Kosher la empresa? 1.Si 2.No");
							boolean companyKosherCertification=askBoolean();
							
							//CompanyGoodAgriculturalPractices
							System.out.println("Tiene buenas practicas agricolas la empresa? 1.Si 2.No");
							boolean companyGoodAgriculturalPractices=askBoolean();
							
							//CompanyChemicals
							System.out.println("Quimicos de la empresa");
							String companyChemicals=scanner.nextLine();
							
							//CreateFoodCompany
							System.out.println(holding.addFoodCompany(companyName, companyNit, companyRepresentativeName, companyAddress, companyPhone, companyEmployeeQuantity, companyAssetsValue, companyCreationDay, companyCreationMonth, companyCreationYear, companyFloors, companyType, companyKosherCertification, companyGoodAgriculturalPractices, companyChemicals));
							
						break;
						
					}
					
					
				break;
				
				case 3:
					
					//EmployeeName
					System.out.println("Nombre del empleado");
					String employeeName=scanner.nextLine();
					
					//EmployeeCharge
					System.out.println("Cargo del empleado");
					String employeeCharge=scanner.nextLine();
					
					//EmployeeEmail
					System.out.println("Email del empleado");
					String employeeEmail=scanner.next();
					scanner.nextLine();
					
					//EmployeeCompanyNit
					System.out.println("Nit de la Empresa donde deseo agregar el empleado");
					String employeeCompanyNit=scanner.next();
					scanner.nextLine();
					
					//CreateEmployee
					System.out.println(holding.addEmployee(employeeName, employeeCharge, employeeEmail, employeeCompanyNit));
					
				break;
				
				case 4:
					
					//ExtensionEmployeeName
					System.out.println("Nombre del empleado que deseamos buscar");
					String extensionEmployeeName=scanner.nextLine();
					
					//ExtensionSearch
					System.out.println("Forma en la que deseamos buscar");
					String extensionSearch=scanner.next();
					scanner.nextLine();
					
					//ExtensionCompanyNit
					System.out.println("Nit de la Empresa en la que deseamos buscar");
					String extensionCompanyNit=scanner.next();
					scanner.nextLine();
					
					//ShowExtension
					System.out.println(holding.showExtension(extensionEmployeeName, extensionSearch, extensionCompanyNit));
					//Test
					for(int x=0; x<holding.getBuilding().length; x++){
						for(int y=0; y<holding.getBuilding()[0].length; y++){
							System.out.print(holding.getBuilding()[x][y].getExtension()+":");
							if(holding.getBuilding()[x][y].getEmployee()!=null){
								System.out.print(holding.getBuilding()[x][y].getEmployee().getName()+"   ");
							}
							else{
								System.out.print("N/A   ");
							}
						}
						System.out.print("\n");
					}
					//...
					
				break;
				
				case 5:
					
					//EmailEmployeeCharge
					System.out.println("Cargo de los empleado que deseamos buscar");
					String emailEmployeeCharge=scanner.nextLine();
					
					//EmailCompanyNit
					System.out.println("Nit de la Empresa en la que deseamos buscar");
					String emailCompanyNit=scanner.next();
					scanner.nextLine();
					
					//ShowEmails
					System.out.println(holding.showEmails(emailEmployeeCharge, emailCompanyNit));
					//Test
					for(int x=0; x<holding.getBuilding().length; x++){
						for(int y=0; y<holding.getBuilding()[0].length; y++){
							System.out.print(holding.getBuilding()[x][y].getExtension()+":");
							if(holding.getBuilding()[x][y].getEmployee()!=null){
								System.out.print(holding.getBuilding()[x][y].getEmployee().getName()+"   ");
							}
							else{
								System.out.print("N/A   ");
							}
						}
						System.out.print("\n");
					}
					//...
					
				break;
				
				case 6:
					
					//ProductName
					System.out.println("Nombre del producto");
					String productName=scanner.nextLine();
					
					//ProductId
					System.out.println("Id del producto");
					String productId=scanner.next();
					scanner.nextLine();
					
					//ProductRequiredWater
					System.out.println("Agua requerida del producto");
					double productRequiredWater=askDouble();
					
					//ProductQuantity
					System.out.println("Cantidad del producto");
					int productQuantity=askInt(0);
					
					//ProductCompanyNit
					System.out.println("Nit de la Empresa donde deseo agregar el producto");
					String productCompanyNit=scanner.next();
					scanner.nextLine();
					
					//CreateProduct
					System.out.println(holding.addProduct(productName, productId, productRequiredWater, productQuantity, productCompanyNit));
					
				break;
				
				case 7:
					
					System.out.println("Como te parecio del 1 al 5:");
					
					//SurveyAnswer0
					System.out.println(Survey.QUESTIONS[0]);
					int surveyAnswer0=askInt(1,5);
					
					//SurveyAnswer1
					System.out.println(Survey.QUESTIONS[1]);
					int surveyAnswer1=askInt(1,5);
					
					//SurveyAnswer2
					System.out.println(Survey.QUESTIONS[2]);
					int surveyAnswer2=askInt(1,5);
					
					//SurveyCompanyNit
					System.out.println("Nit de la Empresa donde deseo agregar la encuesta");
					String surveyCompanyNit=scanner.next();
					scanner.nextLine();
					
					//ShowSatisfaction
					System.out.println(holding.addSurvey(surveyAnswer0, surveyAnswer1, surveyAnswer2, surveyCompanyNit));
					
				break;
				
				case 8:
					
					//SatisfactionCompanyNit
					System.out.println("Nit de la Empresa que deseo saber el nivel de satisfaccion");
					String satisfactionCompanyNit=scanner.next();
					scanner.nextLine();
					
					//ShowSatisfaction
					System.out.println(holding.showSatisfaction(satisfactionCompanyNit));
					
				break;
				
				case 9:
					
					//ProCultureCompanyNit
					System.out.println("Nit de la Empresa que quiero saber su impuesto procultura");
					String proCultureCompanyNit=scanner.next();
					scanner.nextLine();
					
					//ShowTax
					System.out.println(holding.showTaxProCulture(proCultureCompanyNit));
					
				break;
				
				case 10:
					
					//TreeCompanyNit
					System.out.println("Nit de la Empresa que quiero saber la cantidad de arboles que debe plantar");
					String TreeCompanyNit=scanner.next();
					scanner.nextLine();
					
					//ShowTree
					System.out.println(holding.showYearTreePlanting(TreeCompanyNit));
					
				break;
				
				case 11:
					
					//End
					System.out.println("Muchisimas gracias por utilizar el programa. Nos vemos en otra ocacion. Hasta luego!");
					run=false;
					
				break;
				
				default:
					
					System.out.println("Opcion Invalida!");
					
				break;
				
			}
			
		}
		
	}
	
	public String askConstant(String constantClass){
		
		boolean run=true;
		String ask="";
		
		while(run){
			
			int option=scanner.nextInt();
			scanner.nextLine();
			
			if(constantClass.equals("Company")){//SERCHERS
				if((option>=1)&&(option<=5)){
					
					ask=Company.SERCHERS[option-1];
					run=false;
					
				}
				else{
					
					System.out.print("Digito invalido. Vuelva a intentarlo\n~");
					
				}
			}
			else if(constantClass.equals("SubordinateCompany")){//COMPANY_TYPES
				if((option>=1)&&(option<=9)){
					
					ask=SubordinateCompany.COMPANY_TYPES[option-1];
					run=false;
					
				}
				else{
					
					System.out.print("Digito invalido. Vuelva a intentarlo\n~");
					
				}
			}
			else if(constantClass.equals("EducationCompany")){//SECTOR_TYPES
				if((option>=1)&&(option<=2)){
					
					ask=EducationCompany.SECTOR_TYPES[option-1];
					run=false;
					
				}
				else{
					
					System.out.print("Digito invalido. Vuelva a intentarlo\n~");
					
				}
			}
			else if(constantClass.equals("PublicCompany")){//SERVICE_TYPES
				if((option>=1)&&(option<=3)){
					
					ask=PublicCompany.SERVICE_TYPES[option-1];
					run=false;
					
				}
				else{
					
					System.out.print("Digito invalido. Vuelva a intentarlo\n~");
					
				}
			}
			else if(constantClass.equals("PharmaceuticalCompany")){
				if((option>=1)&&(option<=3)){
					
					ask=PharmaceuticalCompany.MODALITY_TYPES[option-1];
					run=false;
					
				}
				else{
					
					System.out.print("Digito invalido. Vuelva a intentarlo\n~");
					
				}
			}
			else{
				
				System.out.print("No existe tal clase");
				run=false;
				
			}
			
			
		}
		
		return ask;
		
	}
	
	public int askInt(int start, int end){
		
		boolean run=true;
		int ask=0;
		
		while(run){
			
			ask=scanner.nextInt();
			scanner.nextLine();
			
			if((ask>=start)&&(ask<=end)){
				
				run=false;
				
			}
			else{
				
				System.out.print("Digito invalido. Vuelva a intentarlo\n~");
				
			}
			
		}
		
		return ask;
		
	}
	
	public int askInt(int start){
		
		boolean run=true;
		int ask=0;
		
		while(run){
			
			ask=scanner.nextInt();
			scanner.nextLine();
			
			if(ask>=start){
				
				run=false;
				
			}
			else{
				
				System.out.print("Digito invalido. Vuelva a intentarlo\n~");
				
			}
			
		}
		
		return ask;
		
	}
	
	public double askDouble(){
		
		boolean run=true;
		double ask=0;
		
		while(run){
			
			ask=scanner.nextDouble();
			scanner.nextLine();
			
			if(ask>=0){
				
				run=false;
				
			}
			else{
				
				System.out.print("Digito invalido. Vuelva a intentarlo\n~");
				
			}
			
		}
		
		return ask;
		
	}
	
	public boolean askBoolean(){
		
		boolean run=true;
		boolean ask=true;
		
		while(run){
			
			int option=scanner.nextInt();
			scanner.nextLine();
			
			switch(option){
				
				case 1:
					
					ask=true;
					run=false;
					
				break;
				
				case 2:
					
					ask=false;
					run=false;
					
				break;
				
				default:
					
					System.out.print("Digito invalido. Vuelva a intentarlo\n~");
					
				break;
				
			}
			
		}
		
		return ask;
		
	}
	
}
package ui;
import model.Company;
import model.HoldingCompany;
import model.SubordinateCompany;
import model.TechnologicalCompany;
import model.EducationCompany;
import model.PublicCompany;
import model.PharmaceuticalCompany;
import model.Survey;
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
		holding=new HoldingCompany("Johanios & Johanios", "1007678665", "Mateo Valdes", "Calle 15 #121-25", "5553333", 4000, 100000000, 9, 9, 2000, 7);
		
		//SubordinateCompanys
		holding.addPharmaceuticalCompany("PMG", "2015357330", "Samuel Ariza", "Calle 13", "4847803", 300, 2000000, 10, 3, 2015, 4, SubordinateCompany.COMPANY_TYPES[2], "INVIMA 2017M-007695-R3", true, 3, 2020, "FABRICAR Y EXPORTAR");
		holding.addPublicCompany("Neybla", "1193545173", "Esteban", "Carrera 83 #26-26", "3338031", 400, 4000000, 20, 7, 2010, 3, SubordinateCompany.COMPANY_TYPES[3], PublicCompany.SERVICE_TYPES[1], 1000, 400);
		
		//Employees
		holding.addEmployee("Daniel Guerra", "Asistente", "danielguerra1927@hotmail.com", "1007678665");
		holding.addEmployee("Johan Sebastian Giraldo", "CEO", "j.sebasgr036@gmail.com", "1007678665");
		holding.addEmployee("Isabella Villamil", "Asistente", "isabellavillamilcardenas@gmai.com", "1007678665");
		
		//Product
		holding.addProduct("Juandafem", "A001", 2, 30, "2015357330");
		
		//Survey
		holding.addSurvey(4, 5, 3, "1193545173");
		
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
					System.out.print("Pisos del edificio de la empresa [3-7]\n~");
					int companyFloors=askInt(3,7);
					
					//CompanyType
					System.out.print("Tipo de empresa\n 1."+SubordinateCompany.COMPANY_TYPES[0]+"\n 2."+SubordinateCompany.COMPANY_TYPES[1]+"\n 3."+SubordinateCompany.COMPANY_TYPES[2]+"\n 4."+SubordinateCompany.COMPANY_TYPES[3]+"\n 5."+SubordinateCompany.COMPANY_TYPES[4]+"\n 6."+SubordinateCompany.COMPANY_TYPES[5]+"\n 7."+SubordinateCompany.COMPANY_TYPES[6]+"\n 8."+SubordinateCompany.COMPANY_TYPES[7]+"\n 9."+SubordinateCompany.COMPANY_TYPES[8]+"\n~");
					String companyType=askConstant("SubordinateCompany");
					
					//CompanyKind
					System.out.print("Clase de empresa que deseas crear\n 1.Empresa tecnologica\n 2.Empresa de educacion\n 3.Empresa de servicios publicos\n 4.Empresa de fabricacion\n 5.Empresa de medicamentos\n 6.Empresa de alimentos\n~");
					int companyKind=askInt(1, 6);
					
					switch(companyKind){
						
						case 1:
							
							//CompanyEnergy
							System.out.print("Energia consumida por la empresa en kilowatts\n~");
							double companyEnergy=askDouble();
							
							//CompanyServices
							System.out.println("La empresa presta el servicio:");
							System.out.print(TechnologicalCompany.SERVICE_TYPES[0]+"\n 1.Si\n 2.No\n~");
							boolean companyService0=askBoolean();
							System.out.print(TechnologicalCompany.SERVICE_TYPES[1]+"\n 1.Si\n 2.No\n~");
							boolean companyService1=askBoolean();
							System.out.print(TechnologicalCompany.SERVICE_TYPES[2]+"\n 1.Si\n 2.No\n~");
							boolean companyService2=askBoolean();
							System.out.print(TechnologicalCompany.SERVICE_TYPES[3]+"\n 1.Si\n 2.No\n~");
							boolean companyService3=askBoolean();
							System.out.print(TechnologicalCompany.SERVICE_TYPES[4]+"\n 1.Si\n 2.No\n~");
							boolean companyService4=askBoolean();
							System.out.print(TechnologicalCompany.SERVICE_TYPES[5]+"\n 1.Si\n 2.No\n~");
							boolean companyService5=askBoolean();
							
							//CreateTechnologicalCompany
							System.out.println(holding.addTechnologicalCompany(companyName, companyNit, companyRepresentativeName, companyAddress, companyPhone, companyEmployeeQuantity, companyAssetsValue, companyCreationDay, companyCreationMonth, companyCreationYear, companyFloors, companyType, companyEnergy, companyService0, companyService1, companyService2, companyService3, companyService4, companyService5));
							
						break;
						
						case 2:
							
							//CompanyMenId
							System.out.print("Numero de registro del men de la empresa de educacion\n~");
							String companyMenId=scanner.next();
							scanner.nextLine();
							
							//CompanySector
							System.out.print("Sector al que pertenece la empresa de educacion\n 1."+EducationCompany.SECTOR_TYPES[0]+"\n 2."+EducationCompany.SECTOR_TYPES[1]+"\n~");
							String companySector=askConstant("EducationCompany");
							
							//CompanyPrincipalName
							System.out.print("Nombre del rector de la empresa de educacion\n~");
							String companyPrincipalName=scanner.nextLine();
							
							//CompanyStudentQuantity
							System.out.print("Cantidad de estudiantes en la empresa de educacion\n~");
							int companyStudentQuantity=askInt(0);
							
							//CompanyLowStratumStudentQuantity
							System.out.print("Cantidad de estudiantes estrato 1 y 2 en la empresa de educacion\n~");
							int companyLowStratumStudentQuantity=askInt(0, companyStudentQuantity);
							
							//CompanyRatingSaber
							System.out.print("Puesto nacional en la prueba saber 11/Pro de la empresa de educacion\n~");
							int companyRatingSaber=askInt(1);
							
							//CompanyHighQualityCuAccreditedYears
							System.out.print("Numero de anios que la empresa de educacion lleva acreditada como entidad de alta calidad\n~");
							int companyHighQualityCuAccreditedYears=askInt(0);
							
							//CreateEducationCompany
							System.out.println(holding.addEducationCompany(companyName, companyNit, companyRepresentativeName, companyAddress, companyPhone, companyEmployeeQuantity, companyAssetsValue, companyCreationDay, companyCreationMonth, companyCreationYear, companyFloors, companyType, companyMenId, companySector, companyPrincipalName, companyStudentQuantity, companyLowStratumStudentQuantity, companyRatingSaber, companyHighQualityCuAccreditedYears));
							
						break;
						
						case 3:
							
							//CompanyService
							System.out.print("Servicio que la empresa de servicios publicos provee\n 1."+PublicCompany.SERVICE_TYPES[0]+"\n 2."+PublicCompany.SERVICE_TYPES[1]+"\n 3."+PublicCompany.SERVICE_TYPES[2]+"\n~");
							String companyService=askConstant("PublicCompany");
							
							//CompanySubscribersQuantity
							System.out.print("Cantidad de suscriptores en la empresa de servicios publicos\n~");
							int companySubscribersQuantity=askInt(0);
							
							//CompanyLowStratumSubscribersQuantity
							System.out.print("Cantidad de suscriptores estrato 1 y 2 en la empresa de servicios publicos\n~");
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
							System.out.print("Registro sanitario de la empresa de medicamentos\n~");
							String companySanitaryRecord=scanner.nextLine();
							
							//CompanyStatus
							System.out.print("Estado del registro sanitario de la empresa de medicamentos\n 1.Activo\n 2.No renovado\n~");
							boolean companyStatus=askBoolean();
							
							//CompanyExpiration
							System.out.print("Mes de vencimiento del registro sanitario de la empresa de medicamentos\n~");
							int companyExpirationMonth=askInt(1, 12);
							System.out.print("Anio de vencimiento del registro sanitario de la empresa de medicamentos\n~");
							int companyExpirationYear=scanner.nextInt();
							scanner.nextLine();
							
							//CompanyModality
							System.out.print("Modalidad de la empresa\n 1."+PharmaceuticalCompany.MODALITY_TYPES[0]+"\n 2."+PharmaceuticalCompany.MODALITY_TYPES[1]+"\n 3."+PharmaceuticalCompany.MODALITY_TYPES[0]+"\n~");
							String companyModality=askConstant("PharmaceuticalCompany");
							
							//CreatePharmaceuticalCompany
							System.out.println(holding.addPharmaceuticalCompany(companyName, companyNit, companyRepresentativeName, companyAddress, companyPhone, companyEmployeeQuantity, companyAssetsValue, companyCreationDay, companyCreationMonth, companyCreationYear, companyFloors, companyType, companySanitaryRecord, companyStatus, companyExpirationMonth, companyExpirationYear, companyModality));
							
						break;
						
						case 6:
							
							//CompanyKosherCertification
							System.out.print("Posee el certificado kosher la empresa de alimentos\n 1.Si\n 2.No\n~");
							boolean companyKosherCertification=askBoolean();
							
							//CompanyGoodAgriculturalPractices
							System.out.print("Estan avalada las practicas agricolas de la empresa empresa de alimentos\n 1.Si\n 2.No\n~");
							boolean companyGoodAgriculturalPractices=askBoolean();
							
							//CompanyChemicals
							System.out.print("Los quimicos que utiliza la empresa de alimentos en sus productos\n~");
							String companyChemicals=scanner.nextLine();
							
							//CreateFoodCompany
							System.out.println(holding.addFoodCompany(companyName, companyNit, companyRepresentativeName, companyAddress, companyPhone, companyEmployeeQuantity, companyAssetsValue, companyCreationDay, companyCreationMonth, companyCreationYear, companyFloors, companyType, companyKosherCertification, companyGoodAgriculturalPractices, companyChemicals));
							
						break;
						
					}
					
					
				break;
				
				case 3:
					
					//EmployeeName
					System.out.print("Nombre del empleado\n~");
					String employeeName=scanner.nextLine();
					
					//EmployeeCharge
					System.out.print("Cargo del empleado en la empresa\n~");
					String employeeCharge=scanner.nextLine();
					
					//EmployeeEmail
					System.out.print("Email del empleado\n~");
					String employeeEmail=scanner.next();
					scanner.nextLine();
					
					//EmployeeCompanyNit
					System.out.print("Nit de la Empresa donde se va a agregar el empleado\n~");
					String employeeCompanyNit=scanner.next();
					scanner.nextLine();
					
					//CreateEmployee
					System.out.println(holding.addEmployee(employeeName, employeeCharge, employeeEmail, employeeCompanyNit));
					
				break;
				
				case 4:
					
					//ExtensionEmployeeName
					System.out.print("Nombre del empleado que deseamos buscar\n~");
					String extensionEmployeeName=scanner.nextLine();
					
					//ExtensionSearch
					System.out.print("Forma en la que deseamos buscar la extension del empleado\n 1."+Company.SERCHERS[0]+"\n 2."+Company.SERCHERS[1]+"\n 3."+Company.SERCHERS[2]+"\n 4."+Company.SERCHERS[3]+"\n 5."+Company.SERCHERS[4]+"\n~");
					String extensionSearch=askConstant("Company");
					
					//ExtensionCompanyNit
					System.out.print("Nit de la Empresa en la que deseamos buscar la extension del empleado\n~");
					String extensionCompanyNit=scanner.next();
					scanner.nextLine();
					
					//ShowExtension
					System.out.println(holding.showExtension(extensionEmployeeName, extensionSearch, extensionCompanyNit));
					
				break;
				
				case 5:
					
					//EmailEmployeeCharge
					System.out.print("Cargo de los empleado que deseamos buscar\n~");
					String emailEmployeeCharge=scanner.nextLine();
					
					//EmailCompanyNit
					System.out.print("Nit de la Empresa en la que deseamos buscar el correo de los empleados\n~");
					String emailCompanyNit=scanner.next();
					scanner.nextLine();
					
					//ShowEmails
					System.out.println(holding.showEmails(emailEmployeeCharge, emailCompanyNit));
					
				break;
				
				case 6:
					
					//ProductName
					System.out.print("Nombre del producto\n~");
					String productName=scanner.nextLine();
					
					//ProductId
					System.out.print("Id del producto\n~");
					String productId=scanner.next();
					scanner.nextLine();
					
					//ProductRequiredWater
					System.out.print("Agua en litros requerida para la fabricacion del producto\n~");
					double productRequiredWater=askDouble();
					
					//ProductQuantity
					System.out.print("Cantidad de producto en el inventario\n~");
					int productQuantity=askInt(0);
					
					//ProductCompanyNit
					System.out.print("Nit de la Empresa donde deseo agregar el producto\n~");
					String productCompanyNit=scanner.next();
					scanner.nextLine();
					
					//CreateProduct
					System.out.println(holding.addProduct(productName, productId, productRequiredWater, productQuantity, productCompanyNit));
					
				break;
				
				case 7:
					
					System.out.print("ENCUESTA: Como te parecio del 1 al 5\n");
					
					//SurveyAnswer0
					System.out.print(Survey.QUESTIONS[0]+"\n~");
					int surveyAnswer0=askInt(1,5);
					
					//SurveyAnswer1
					System.out.print(Survey.QUESTIONS[1]+"\n~");
					int surveyAnswer1=askInt(1,5);
					
					//SurveyAnswer2
					System.out.print(Survey.QUESTIONS[2]+"\n~");
					int surveyAnswer2=askInt(1,5);
					
					//SurveyCompanyNit
					System.out.print("Nit de la Empresa donde se desea agregar la encuesta\n~");
					String surveyCompanyNit=scanner.next();
					scanner.nextLine();
					
					//ShowSatisfaction
					System.out.println(holding.addSurvey(surveyAnswer0, surveyAnswer1, surveyAnswer2, surveyCompanyNit));
					
				break;
				
				case 8:
					
					//SatisfactionCompanyNit
					System.out.print("Nit de la Empresa que deseo saber su nivel de satisfaccion\n~");
					String satisfactionCompanyNit=scanner.next();
					scanner.nextLine();
					
					//ShowSatisfaction
					System.out.println(holding.showSatisfaction(satisfactionCompanyNit));
					
				break;
				
				case 9:
					
					//ProCultureCompanyNit
					System.out.print("Nit de la Empresa que deseo saber su impuesto procultura\n~");
					String proCultureCompanyNit=scanner.next();
					scanner.nextLine();
					
					//ShowTax
					System.out.println(holding.showTaxProCulture(proCultureCompanyNit));
					
				break;
				
				case 10:
					
					//TreeCompanyNit
					System.out.print("Nit de la Empresa que deseo saber la cantidad de arboles que debe plantar en un anio\n~");
					String TreeCompanyNit=scanner.next();
					scanner.nextLine();
					
					//ShowTree
					System.out.println(holding.showYearTreePlanting(TreeCompanyNit));
					
				break;
				
				case 11:
					
					//End
					System.out.print("Muchisimas gracias por utilizar el programa.\nNos vemos en otra ocacion.\nHasta luego!");
					run=false;
					
				break;
				
				default:
					
					System.out.println("Opcion Invalida!");
					
				break;
				
			}
			
		}
		
	}
	
	//Askers
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
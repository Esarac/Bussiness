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
		Date creationDate=new Date(9,9,2000);
		holding=new HoldingCompany("Johanios & Johanios", "1007678665", "Mateo Valdes", "Calle 15 #121-25", "5553333", 30000, 100000000, creationDate, 7, 20);
		
	}
	
	//Menu
	public void menu(){
		
		boolean run=true;
		
		while(run){
			
			System.out.println("1.Crear empresa 2.Crear producto 3.Mostrar informacion 4.Registrar Encuesta 5.Mostrar Satisfaccion empresa de servicio 6.Registrar empleado 7.Salir");
			
			int option=scanner.nextInt();
			scanner.nextLine();
			
			switch(option){
				
				case 1:
					
					//CompanyName
					System.out.println("Nombre de la empresa");
					String companyName=scanner.nextLine();
					
					//CompanyNit
					System.out.println("Nit de la empresa");
					String companyNit=scanner.next();
					scanner.nextLine();
					
					//CompanyRepresentativeName
					System.out.println("Nombre del representante legal de la empresa");
					String companyRepresentativeName=scanner.nextLine();
					
					//CompanyAddress
					System.out.println("Direccion de la empresa");
					String companyAddress=scanner.nextLine();
					
					//CompanyPhone
					System.out.println("Telefono de la empresa");
					String companyPhone=scanner.next();
					scanner.nextLine();
					
					//CompanyEmployeeQuantity
					System.out.println("Cantidad de empleados de la empresa");
					int companyEmployeeQuantity=scanner.nextInt();
					scanner.nextLine();
					
					//CompanyAssetsValue
					System.out.println("Valor en activos de la empresa");
					double companyAssetsValue=scanner.nextDouble();
					scanner.nextLine();
					
					//CompanyCreationDate
					System.out.println("Dia de creacion de la empresa");
					int companCreationDay=scanner.nextInt();
					scanner.nextLine();
					System.out.println("Mes de creacion de la empresa");
					int companCreationMonth=scanner.nextInt();
					scanner.nextLine();
					System.out.println("Anio de creacion de la empresa");
					int companCreationYear=scanner.nextInt();
					scanner.nextLine();
					Date companyCreationDate=new Date(companCreationDay, companCreationMonth, companCreationYear);//???
					
					//CompanyBuilding
					System.out.println("Pisos de la empresa");
					int companyFloors=scanner.nextInt();
					scanner.nextLine();
					System.out.println("Cubiculos por piso de la empresa");
					int companyCubicles=scanner.nextInt();
					scanner.nextLine();
					
					//CompanyType
					System.out.println("Tipo de la empresa");
					String companyType=scanner.nextLine();
					
					//CompanyKind
					System.out.println("Clase de empresa: 1.Empresa Tecnologica 2.Empresa Educativa 3.Empresa de Servicios Publicos 4.Empresa Productiva 5.Empresa Farmaceutica 6.Empresa Alimenticia");
					int companyKind=scanner.nextInt();
					scanner.nextLine();
					
					switch(companyKind){
						
						case 1:
							
							//CompanyService0
							System.out.println("Presta el servicio "+TechnologicalCompany.SERVICE_TYPES[0]+" la empresa tecnologica?");
							boolean companyService0=scanner.nextBoolean();
							scanner.nextLine();
							
							//CompanyService1
							System.out.println("Presta el servicio "+TechnologicalCompany.SERVICE_TYPES[1]+" la empresa tecnologica?");
							boolean companyService1=scanner.nextBoolean();
							scanner.nextLine();
							
							//CompanyService2
							System.out.println("Presta el servicio "+TechnologicalCompany.SERVICE_TYPES[2]+" la empresa tecnologica?");
							boolean companyService2=scanner.nextBoolean();
							scanner.nextLine();
							
							//CompanyService3
							System.out.println("Presta el servicio "+TechnologicalCompany.SERVICE_TYPES[3]+" la empresa tecnologica?");
							boolean companyService3=scanner.nextBoolean();
							scanner.nextLine();
							
							//CompanyService4
							System.out.println("Presta el servicio "+TechnologicalCompany.SERVICE_TYPES[4]+" la empresa tecnologica?");
							boolean companyService4=scanner.nextBoolean();
							scanner.nextLine();
							
							//CompanyService5
							System.out.println("Presta el servicio "+TechnologicalCompany.SERVICE_TYPES[5]+" la empresa tecnologica?");
							boolean companyService5=scanner.nextBoolean();
							scanner.nextLine();
							
							//CreateTechnologicalCompany
							System.out.println(holding.addTechnologicalCompany(companyName, companyNit, companyRepresentativeName, companyAddress, companyPhone, companyEmployeeQuantity, companyAssetsValue, companyCreationDate, companyFloors, companyCubicles, companyType, companyService0, companyService1, companyService2, companyService3, companyService4, companyService5));
							
						break;
						
						case 2:
							
							//CompanyMenId
							System.out.println("Id del men de la empresa de educacion");
							String companyMenId=scanner.next();
							scanner.nextLine();
							
							//CompanySector
							System.out.println("Sector de la empresa de educacion");
							String companySector=scanner.next();
							scanner.nextLine();
							
							//CompanyPrincipalName
							System.out.println("Director de la empresa de educacion");
							String companyPrincipalName=scanner.nextLine();
							
							//CompanyStudentQuantity
							System.out.println("Cantidad de estudiantes de la empresa de educacion");
							int companyStudentQuantity=scanner.nextInt();
							scanner.nextLine();
							
							//CompanyLowStratumStudentQuantity
							System.out.println("Cantidad de estudiantes de estrato 1 y 2 de la empresa de educacion");
							int companyLowStratumStudentQuantity=scanner.nextInt();
							scanner.nextLine();
							
							//CompanyRatingSaber11
							System.out.println("Puesto en la prueba saber 11 de la empresa de educacion");
							int companyRatingSaber11=scanner.nextInt();
							scanner.nextLine();
							
							//CompanyRatingSaberPro
							System.out.println("Puesto en la prueba saber pro de la empresa de educacion");
							int companyRatingSaberPro=scanner.nextInt();
							scanner.nextLine();
							
							//CompanyHighQualityCuAccreditedYears
							System.out.println("Anios de acreditacion en alta calidad de la empresa de educacion");
							int companyHighQualityCuAccreditedYears=scanner.nextInt();
							scanner.nextLine();
							
							//CreateEducationCompany
							System.out.println(holding.addEducationCompany(companyName, companyNit, companyRepresentativeName, companyAddress, companyPhone, companyEmployeeQuantity, companyAssetsValue, companyCreationDate, companyFloors, companyCubicles, companyType, companyMenId, companySector, companyPrincipalName, companyStudentQuantity, companyLowStratumStudentQuantity, companyRatingSaber11, companyRatingSaberPro, companyHighQualityCuAccreditedYears));
							
						break;
						
						case 3:
							
							//CompanyService
							System.out.println("Servicio de la empresa de servicios publicos");
							String companyService=scanner.next();
							scanner.nextLine();
							
							//CompanySubscribersQuantity
							System.out.println("Cantidad de suscriptores de la empresa");
							int companySubscribersQuantity=scanner.nextInt();
							scanner.nextLine();
							
							//CompanyLowStratumSubscribersQuantity
							System.out.println("Cantidad de suscriptores de estrato 1 y 2 de la empresa");
							int companyLowStratumSubscribersQuantity=scanner.nextInt();
							scanner.nextLine();
							
							//CreatePublicCompany
							System.out.println(holding.addPublicCompany(companyName, companyNit, companyRepresentativeName, companyAddress, companyPhone, companyEmployeeQuantity, companyAssetsValue, companyCreationDate, companyFloors, companyCubicles, companyType, companyService, companySubscribersQuantity, companyLowStratumSubscribersQuantity));
							
						break;
						
						case 4:
							
							//CreateProductionCompany
							System.out.println(holding.addProductionCompany(companyName, companyNit, companyRepresentativeName, companyAddress, companyPhone, companyEmployeeQuantity, companyAssetsValue, companyCreationDate, companyFloors, companyCubicles, companyType));
							
						break;
						
						case 5:
							
							//CompanySanitaryRecord
							System.out.println("Registro sanitario del invima de la empresa");
							String companySanitaryRecord=scanner.nextLine();
							
							//CompanyStatus
							System.out.println("Estado del invima de la empresa");
							boolean companyStatus=scanner.nextBoolean();
							scanner.nextLine();
							
							//CompanyExpiration
							System.out.println("Mes de vencimiento del invima de la empresa");
							int companyExpirationMonth=scanner.nextInt();
							scanner.nextLine();
							System.out.println("Anio de vencimiento del invima de la empresa");
							int companyExpirationYear=scanner.nextInt();
							scanner.nextLine();
							Date companyExpiration=new Date(0, companyExpirationMonth, companyExpirationYear);//???
							
							//CompanyModality
							System.out.println("Modalidad del invima de la empresa");
							String companyModality=scanner.nextLine();
							
							//CreatePharmaceuticalCompany
							System.out.println(holding.addPharmaceuticalCompany(companyName, companyNit, companyRepresentativeName, companyAddress, companyPhone, companyEmployeeQuantity, companyAssetsValue, companyCreationDate, companyFloors, companyCubicles, companyType, companySanitaryRecord, companyStatus, companyExpiration, companyModality));
							
						break;
						
						case 6:
							
							//CompanyKosherCertification
							System.out.println("Certificado Kosher de la empresa");
							boolean companyKosherCertification=scanner.nextBoolean();
							scanner.nextLine();
							
							//CompanyGoodAgriculturalPractices
							System.out.println("Buenas practicas agricolas de la empresa");
							boolean companyGoodAgriculturalPractices=scanner.nextBoolean();
							scanner.nextLine();
							
							//CompanyChemicals
							System.out.println("Quimicos de la empresa");
							String companyChemicals=scanner.nextLine();
							
							//CreateFoodCompany
							System.out.println(holding.addFoodCompany(companyName, companyNit, companyRepresentativeName, companyAddress, companyPhone, companyEmployeeQuantity, companyAssetsValue, companyCreationDate, companyFloors, companyCubicles, companyType, companyKosherCertification, companyGoodAgriculturalPractices, companyChemicals));
							
						break;
						
					}
					
					
				break;
				
				case 2:
					
					//ProductName
					System.out.println("Nombre del producto");
					String productName=scanner.nextLine();
					
					//ProductId
					System.out.println("Id del producto");
					String productId=scanner.next();
					scanner.nextLine();
					
					//ProductRequiredWater
					System.out.println("Agua requerida del producto");
					double productRequiredWater=scanner.nextDouble();
					scanner.nextLine();
					
					//ProductQuantity
					System.out.println("Cantidad del producto");
					int productQuantity=scanner.nextInt();
					scanner.nextLine();
					
					//ProductCompanyNit
					System.out.println("Nit de la Empresa donde deseo agregar el producto");
					String productCompanyNit=scanner.next();
					scanner.nextLine();
					
					//CreateProduct
					System.out.println(holding.addProduct(productName, productId, productRequiredWater, productQuantity, productCompanyNit));
					
				break;
				
				case 3:
					
					//ShowData
					System.out.println(holding.toString());
					
				break;
				
				case 4:
					
					System.out.println("Como te parecio del 1 al 5:");
					
					//SurveyAnswer0
					System.out.println(Survey.QUESTIONS[0]);
					int surveyAnswer0=scanner.nextInt();
					scanner.nextLine();
					
					//SurveyAnswer1
					System.out.println(Survey.QUESTIONS[1]);
					int surveyAnswer1=scanner.nextInt();
					scanner.nextLine();
					
					//SurveyAnswer2
					System.out.println(Survey.QUESTIONS[2]);
					int surveyAnswer2=scanner.nextInt();
					scanner.nextLine();
					
					//SurveyCompanyNit
					System.out.println("Nit de la Empresa donde deseo agregar la encuesta");
					String surveyCompanyNit=scanner.next();
					scanner.nextLine();
					
					//ShowSatisfaction
					System.out.println(holding.addSurvey(surveyAnswer0, surveyAnswer1, surveyAnswer2, surveyCompanyNit));
					
				break;
				
				case 5:
					
					//SatisfactionCompanyNit
					System.out.println("Nit de la Empresa que deseo saber el nivel de satisfaccion");
					String satisfactionCompanyNit=scanner.next();
					scanner.nextLine();
					
					//ShowSatisfaction
					System.out.println(holding.showSatisfaction(satisfactionCompanyNit));
					
				break;
				
				case 6:
					
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
					
					//EmployeeCompanyKind
					System.out.println("A que tipo de empresa deseas agregarlo: 1.Subordinada 2.Holding");
					int employeeCompanyKind=scanner.nextInt();
					scanner.nextLine();
					
					switch(employeeCompanyKind){
						
						case 1:
							
							//EmployeeCompanyNit
							System.out.println("Nit de la Empresa donde deseo agregar el empleado");
							String employeeCompanyNit=scanner.next();
							scanner.nextLine();
							
							//CreateEmployee
							System.out.println(holding.addEmployee(employeeName, employeeCharge, employeeEmail, employeeCompanyNit));
							
						break;
						
						case 2:
							
							//CreateEmployee
							System.out.println(holding.addEmployee(employeeName, employeeCharge, employeeEmail));
							
						break;
						
					}
					
				break;
				
				case 7:
					
					//End
					System.out.println("Hasta luego!");
					run=false;
					
				break;
				
				default:
					
					System.out.println("Opcion Invalida!");
					
				break;
				
			}
			
		}
		
	}
	
}
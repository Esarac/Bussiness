package model;
import java.util.ArrayList;

/**
*<b>Description:</b> The class HoldingCompany in the package model.<br>
*@author Esteban Ariza Acosta
*/
public class HoldingCompany extends Company{

	//Attributes
	private ArrayList<Company> companies;

	//Constructor
	/**
	*<b>Description:</b> The constructor of the class HoldingCompany.<br>
	*<b>Post:</b> All The attributes of the class are initialize.<br>
	*@param name The name we want to set.
	*@param nit The nit we want to set.
	*@param representativeName The representative name we want to set.
	*@param address The address we want to set.
	*@param phone The phone we want to set.
	*@param employeeQuantity The employee quantity we want to set.
	*@param assetsValue The assets value we want to set.
	*@param creationDay The creation day for the creation date we want to set.
	*@param creationMonth The creation month for the creation date we want to set.
	*@param creationYear The creation year for the creation date we want to set.
	*@param floors The floors of the building that we want to set.
	*/
	public HoldingCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors){

		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors);

		this.companies=new ArrayList<Company>();

	}

	//Show
	/**
	*<b>Description:</b> Show the main menu of the user interface.<br>
	*@return A String that is the main menu of the user interface.
	*/
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

	/**
	*<b>Description:</b> Shows some data of the object in a String.<br>
	*<b>Pre:</b> The attribute creationDate, building, companies, the elements of building,the elements inside the elements of building and the elements of companies must not be null.<br>
	*@return A String that is the data of the object.
	*@throws NullPointerException If the attribute creationDate, building, companies, the elements of building,the elements inside the elements of building or the elements of companies of the company are null.
	*/
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
		int buildingEmployeeQuantity=0;
		for(int x=0; x<getBuilding().length; x++){
			for(int y=0; y<getBuilding()[0].length; y++){
				if(getBuilding()[x][y].getEmployee()!=null){buildingEmployeeQuantity++;}
			}
		}
		toString+="\nCantidad Empleados Edificio: "+buildingEmployeeQuantity;
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

	/**
	*<b>Description:</b> Show the satisfaction of a service company by the nit.<br>
	*<b>Pre:</b> The attribute companies and the elements must not be null.<br>
	*@param companyNit The nit of the company we want see the satisfaction.
	*@return A String that is the satisfaction of the company.
	*@throws NullPointerException If the attribute companies or its elements are null.
	*/
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

	/**
	*<b>Description:</b> Show the proculture tax of a companies by the nit. It only applies for the companies that implements the ProCulturizer interface.<br>
	*<b>Pre:</b> The attribute companies and the elements must not be null.<br>
	*@param companyNit The nit of the company we want see the proculture tax.
	*@return A String that is the proculture tax of the company.
	*@throws NullPointerException If the attribute companies or its elements are null.
	*/
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

	/**
	*<b>Description:</b> Show the quantity of trees that companies need to plant by the nit. It only applies for the companies that implements the TreePlanter interface.<br>
	*<b>Pre:</b> The attribute companies and the elements must not be null.<br>
	*@param companyNit The nit of the company we want see the quantity of trees it needs to plant.
	*@return A String that is the quantity of trees that the company need to plant.
	*@throws NullPointerException If the attribute companies or its elements are null.
	*/
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

	/**
	*<b>Description:</b> Shows the extension of the employee cubicle by the employees name. Also it search the employee on a specified searching type. The company from which the research is going to be made its specified by the nit.<br>
	*<b>Pre:</b> The attribute companies and the elements must not be null.<br>
	*@param name The employees name.
	*@param type The searching type.
	*@param companyNit The nit of the company we want search.
	*@return A String that is the extension of the employee cubicle.
	*@throws NullPointerException If the attribute companies or its elements are null.
	*/
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

	/**
	*<b>Description:</b> Shows the emails of the employees that have an specific charge. It search the employee on spiral. The company from which the research is going to be made its specified by the nit.<br>
	*<b>Pre:</b> The attribute companies and the elements must not be null.<br>
	*@param charge The employees charge.
	*@param companyNit The nit of the company we want search.
	*@return A String that is the emails of the employees.
	*@throws NullPointerException If the attribute companies or its elements are null.
	*/
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
	/**
	*<b>Description:</b> Add a technological company in the holding company.<br>
	*<b>Pre:</b> The attribute companies must not be null.<br>
	*<b>Post:</b> The technological company was added to companies.<br>
	*@param name The name we want to set.
	*@param nit The nit we want to set.
	*@param representativeName The representative name we want to set.
	*@param address The address we want to set.
	*@param phone The phone we want to set.
	*@param employeeQuantity The employee quantity we want to set.
	*@param assetsValue The assets value we want to set.
	*@param creationDay The creation day for the creation date we want to set.
	*@param creationMonth The creation month for the creation date we want to set.
	*@param creationYear The creation year for the creation date we want to set.
	*@param floors The floors of the building that we want to set.
	*@param type The type we want to set.
	*@param energy The energy we want to set.
	*@param services0 The availability of the first service we want to set.
	*@param services1 The availability of the second service we want to set.
	*@param services2 The availability of the third service we want to set.
	*@param services3 The availability of the fourth service we want to set.
	*@param services4 The availability of the fifth service we want to set.
	*@param services5 The availability of the sixth service we want to set.
	*@return A String that informs that the technological company has been added.
	*@throws NullPointerException If the attribute companies of the company is null.
	*/
	public String addTechnologicalCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type, double energy, boolean services0, boolean services1, boolean services2, boolean services3, boolean services4, boolean services5){//Son iguales ! lol

		String message="Se ha aniadido una empresa tecnologica";

		Company technologicalCompany=new TechnologicalCompany(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type, energy, services0, services1, services2, services3, services4, services5);
		companies.add(technologicalCompany);

		return message;

	}

	/**
	*<b>Description:</b> Add a education company in the holding company.<br>
	*<b>Pre:</b> The attribute companies must not be null.<br>
	*<b>Post:</b> The education company was added to companies.<br>
	*@param name The name we want to set.
	*@param nit The nit we want to set.
	*@param representativeName The representative name we want to set.
	*@param address The address we want to set.
	*@param phone The phone we want to set.
	*@param employeeQuantity The employee quantity we want to set.
	*@param assetsValue The assets value we want to set.
	*@param creationDay The creation day for the creation date we want to set.
	*@param creationMonth The creation month for the creation date we want to set.
	*@param creationYear The creation year for the creation date we want to set.
	*@param floors The floors of the building that we want to set.
	*@param type The type we want to set.
	*@param menId The id of the men we want to set.
	*@param sector The sector we want to set.
	*@param principalName The principals name we want to set.
	*@param studentQuantity The student quantity we want to set.
	*@param lowStratumStudentQuantity The low stratum student quantity we want to set.
	*@param ratingSaber The rating on the saber 11/pro we want to set.
	*@param accreditedYears The high quality accredited years we want to set.
	*@return A String that informs that the education company has been added.
	*@throws NullPointerException If the attribute companies of the company is null.
	*/
	public String addEducationCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type, String menId, String sector, String principalName, int studentQuantity, int lowStratumStudentQuantity, int ratingSaber, int accreditedYears){

		String message="Se ha aniadido una empresa de educacion";

		Company educationCompany=new EducationCompany(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type, menId, sector, principalName, studentQuantity, lowStratumStudentQuantity, ratingSaber, accreditedYears);
		companies.add(educationCompany);

		return message;

	}

	/**
	*<b>Description:</b> Add a public service company in the holding company.<br>
	*<b>Pre:</b> The attribute companies must not be null.<br>
	*<b>Post:</b> The public service company was added to companies.<br>
	*@param name The name we want to set.
	*@param nit The nit we want to set.
	*@param representativeName The representative name we want to set.
	*@param address The address we want to set.
	*@param phone The phone we want to set.
	*@param employeeQuantity The employee quantity we want to set.
	*@param assetsValue The assets value we want to set.
	*@param creationDay The creation day for the creation date we want to set.
	*@param creationMonth The creation month for the creation date we want to set.
	*@param creationYear The creation year for the creation date we want to set.
	*@param floors The floors of the building that we want to set.
	*@param type The type we want to set.
	*@param service The provided service we want to set.
	*@param subscribersQuantity The subscribers quantity we want to set.
	*@param lowStratumSubscribersQuantity The low stratum subscribers quantity we want to set.
	*@return A String that informs that the public service company has been added.
	*@throws NullPointerException If the attribute companies of the company is null.
	*/
	public String addPublicCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type, String service, int subscribersQuantity, int lowStratumSubscribersQuantity){

		String message="Se ha aniadido una empresa de servicios publicos";

		Company publicCompany=new PublicCompany(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type, service, subscribersQuantity, lowStratumSubscribersQuantity);
		companies.add(publicCompany);

		return message;

	}

	/**
	*<b>Description:</b> Add a production company in the holding company.<br>
	*<b>Pre:</b> The attribute companies must not be null.<br>
	*<b>Post:</b> The production company was added to companies.<br>
	*@param name The name we want to set.
	*@param nit The nit we want to set.
	*@param representativeName The representative name we want to set.
	*@param address The address we want to set.
	*@param phone The phone we want to set.
	*@param employeeQuantity The employee quantity we want to set.
	*@param assetsValue The assets value we want to set.
	*@param creationDay The creation day for the creation date we want to set.
	*@param creationMonth The creation month for the creation date we want to set.
	*@param creationYear The creation year for the creation date we want to set.
	*@param floors The floors of the building that we want to set.
	*@param type The type we want to set.
	*@return A String that informs that the production company has been added.
	*@throws NullPointerException If the attribute companies of the company is null.
	*/
	public String addProductionCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type){//Son iguales ! lol

		String message="Se ha aniadido una empresa de fabricacion";

		Company productionCompany=new ProductionCompany(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type);
		companies.add(productionCompany);

		return message;

	}

	/**
	*<b>Description:</b> Add a pharmaceutical company in the holding company.<br>
	*<b>Pre:</b> The attribute companies must not be null.<br>
	*<b>Post:</b> The pharmaceutical company was added to companies.<br>
	*@param name The name we want to set.
	*@param nit The nit we want to set.
	*@param representativeName The representative name we want to set.
	*@param address The address we want to set.
	*@param phone The phone we want to set.
	*@param employeeQuantity The employee quantity we want to set.
	*@param assetsValue The assets value we want to set.
	*@param creationDay The creation day for the creation date we want to set.
	*@param creationMonth The creation month for the creation date we want to set.
	*@param creationYear The creation year for the creation date we want to set.
	*@param floors The floors of the building that we want to set.
	*@param type The type we want to set.
	*@param sanitaryRecord The sanitary record we want to set.
	*@param status The status for the sanitary record we want to set.
	*@param expirationMonth The expiration month for the expiration of the sanitary record we want to set.
	*@param expirationYear The expiration year for the expiration of the sanitary record we want to set.
	*@param modality The modality we want to set.
	*@return A String that informs that the pharmaceutical company has been added.
	*@throws NullPointerException If the attribute companies of the company is null.
	*/
	public String addPharmaceuticalCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type, String sanitaryRecord, boolean status, int expirationMonth, int expirationYear, String modality){

		String message="Se ha aniadido una empresa de medicamentos";

		Company pharmaceuticalCompany=new PharmaceuticalCompany(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type, sanitaryRecord, status, expirationMonth, expirationYear, modality);
		companies.add(pharmaceuticalCompany);

		return message;

	}

	/**
	*<b>Description:</b> Add a food company in the holding company.<br>
	*<b>Pre:</b> The attribute companies must not be null.<br>
	*<b>Post:</b> The food company was added to companies.<br>
	*@param name The name we want to set.
	*@param nit The nit we want to set.
	*@param representativeName The representative name we want to set.
	*@param address The address we want to set.
	*@param phone The phone we want to set.
	*@param employeeQuantity The employee quantity we want to set.
	*@param assetsValue The assets value we want to set.
	*@param creationDay The creation day for the creation date we want to set.
	*@param creationMonth The creation month for the creation date we want to set.
	*@param creationYear The creation year for the creation date we want to set.
	*@param floors The floors of the building that we want to set.
	*@param type The type we want to set.
	*@param kosherCertification The existence of the kosher certification we want to set.
	*@param goodAgriculturalPractices The existence of good agricultural practices we want to set.
	*@param chemicals The chemicals for the products creation we want to set.
	*@return A String that informs that the food company has been added.
	*@throws NullPointerException If the attribute companies of the company is null.
	*/
	public String addFoodCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type, boolean kosherCertification, boolean goodAgriculturalPractices, String chemicals){

		String message="Se ha aniadido una empresa de alimentos";

		Company foodCompany=new FoodCompany(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type, kosherCertification, goodAgriculturalPractices, chemicals);
		companies.add(foodCompany);

		return message;

	}

	/**
	*<b>Description:</b> Add a product into a specified by the nit production company.<br>
	*<b>Pre:</b> The attribute companies and the elements must not be null.<br>
	*@param name The name we want to set.
	*@param id The id we want to set.
	*@param requiredWater The required water we want to set.
	*@param quantity The quantity we want to set.
	*@param companyNit the nit of the company we want to add the object.
	*@return A String that informs if the product has been added to the company.
	*@throws NullPointerException If the attribute companies or elements of the company are null.
	*/
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

	/**
	*<b>Description:</b> Add a employee into the building of a company specified by the nit.<br>
	*<b>Pre:</b> The attribute companies and the elements must not be null.<br>
	*@param name The name we want to set.
	*@param charge The charge we want to set.
	*@param email The email we want to set.
	*@param companyNit the nit of the company we want to add the object.
	*@return A String that informs if the employee has been added to the company.
	*@throws NullPointerException If the attribute companies or the elements of the company are null.
	*/
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

	/**
	*<b>Description:</b> Add a survey into a specified by the nit service company.<br>
	*<b>Pre:</b> The attribute companies and the elements must not be null.<br>
	*@param answer0 The first answer we want to set.
	*@param answer1 The second answer we want to set.
	*@param answer2 The third answer we want to set.
	*@param companyNit the nit of the company we want to add the object.
	*@return A String that informs if the survey has been added to the company.
	*@throws NullPointerException If the attribute companies or elements of the company are null.
	*/
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

package model;

/**
*<b>Description:</b> The abstract class Company in the package model.<br>
*@author Esteban Ariza Acosta
*/
public abstract class Company{

	//Constants
	public final static String[] SERCHERS= {"L","Z","X","O","E"};

	//Attributes
	private String name;
	private String nit;
	private String representativeName;
	private String address;
	private String phone;
	private int employeeQuantity;
	private double assetsValue;
	private Date creationDate;
	private Cubicle[][] building;

	//Constructor
	/**
	*<b>Description:</b> The constructor of the class Company.<br>
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
	public Company(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors){

		this.name=name;
		this.nit=nit;
		this.representativeName=representativeName;
		this.address=address;
		this.phone=phone;
		this.employeeQuantity=employeeQuantity;
		this.assetsValue=assetsValue;

		Date creationDate=new Date(creationDay, creationMonth, creationYear);
		this.creationDate=creationDate;

		this.building=new Cubicle[floors][20];

		for(int x=0;x<building.length; x++){
			for(int y=0;y<building[0].length; y++){

				if((y+1)<10){

					building[x][y]=new Cubicle((x+1)+"0"+(y+1));

				}
				else{

					building[x][y]=new Cubicle((x+1)+""+(y+1));

				}

			}
		}

	}

	//Do
	/**
	*<b>Description:</b> Shows the extension of the employee cubicle by the employees name. Also it search the employee on a specified searching type.<br>
	*<b>Pre:</b> The attribute building, the elements of building and the elements inside the elements of building must not be null.<br>
	*@param name The employees name.
	*@param type The searching type.
	*@return The extension of the employee cubicle.
	*@throws NullPointerException If the attribute creationDate, building, the elements of building or the elements inside the elements of building of the company are null.
	*/
	public String showExtension(String name, String type){

		String extension="No se encontro al empleado";

		boolean run=true;
		if(type.equals(SERCHERS[0])){

			//L
			for(int x=0; (x<building.length) && run; x++){

				if(building[x][0].getEmployee()!=null){
					if(name.equals(building[x][0].getEmployee().getName())){

						extension=building[x][0].getExtension();
						run=false;

					}
				}

			}
			for(int y=0; (y<building[0].length) && run; y++){

				if(building[0][y].getEmployee()!=null){
					if(name.equals(building[0][y].getEmployee().getName())){

						extension=building[0][y].getExtension();
						run=false;

					}
				}

			}
			//...

		}
		else if(type.equals(SERCHERS[1])){

			//Z
			for(int y=0; (y<building[0].length) && run; y++){

				if(building[0][y].getEmployee()!=null){
					if(name.equals(building[0][y].getEmployee().getName())){

						extension=building[0][y].getExtension();
						run=false;

					}
				}
				if(building[building.length-1][y].getEmployee()!=null){
					if(name.equals(building[building.length-1][y].getEmployee().getName())){

						extension=building[building.length-1][y].getExtension();
						run=false;

					}
				}

			}
			for(int x=0; (x<building.length) && run; x++){

				if(building[x][x].getEmployee()!=null){
					if(name.equals(building[x][x].getEmployee().getName())){

						extension=building[x][x].getExtension();
						run=false;

					}
				}

			}
			//...

		}
		else if(type.equals(SERCHERS[2])){

			//X
			for(int x=0; (x<building.length) && run; x++){

				if(building[x][x].getEmployee()!=null){
					if(name.equals(building[x][x].getEmployee().getName())){

						extension=building[x][x].getExtension();
						run=false;

					}
				}
				if(building[building.length-(x+1)][x].getEmployee()!=null){
					if(name.equals(building[building.length-(x+1)][x].getEmployee().getName())){

						extension=building[building.length-(x+1)][x].getExtension();
						run=false;

					}
				}

			}
			//...

		}
		else if(type.equals(SERCHERS[3])){

			//O
			for(int x=0; (x<building.length) && run; x++){

				if(building[x][0].getEmployee()!=null){
					if(name.equals(building[x][0].getEmployee().getName())){

						extension=building[x][0].getExtension();
						run=false;

					}
				}
				if(building[x][building[0].length-1].getEmployee()!=null){
					if(name.equals(building[x][building[0].length-1].getEmployee().getName())){

						extension=building[x][building[0].length-1].getExtension();
						run=false;

					}
				}

			}
			for(int y=0; (y<building[0].length) && run; y++){

				if(building[0][y].getEmployee()!=null){
					if(name.equals(building[0][y].getEmployee().getName())){

						extension=building[0][y].getExtension();
						run=false;

					}
				}
				if(building[building.length-1][y].getEmployee()!=null){
					if(name.equals(building[building.length-1][y].getEmployee().getName())){

						extension=building[building.length-1][y].getExtension();
						run=false;

					}
				}

			}
			//...

		}
		else if((type.equals(SERCHERS[4])) && ((building.length%2)!=0)){

			//E
			for(int x=0; (x<building.length) && run; x++){

				if( (x==0) || (x==(building.length-1)) || (x==((building.length-1)/2)) ){

					for(int y=0; (y<building[0].length) && run; y++){

						if(building[x][y].getEmployee()!=null){
							if(name.equals(building[x][y].getEmployee().getName())){

								extension=building[x][y].getExtension();
								run=false;

							}
						}

					}

				}
				else{

					if(building[x][0].getEmployee()!=null){
						if(name.equals(building[x][0].getEmployee().getName())){

							extension=building[x][0].getExtension();
							run=false;

						}
					}

				}

			}
			//...

		}

		return extension;

	}

	/**
	*<b>Description:</b> Shows the emails of the employees that have an specific charge. It search the employee on spiral.<br>
	*<b>Pre:</b> The attribute building, the elements of building and the elements inside the elements of building must not be null.<br>
	*@param charge The employees charge.
	*@return The emails of the employee.
	*@throws NullPointerException If the attribute creationDate, building, the elements of building or the elements inside the elements of building of the company are null.
	*/
	public String showEmails(String charge){

		String emails="";

		int path=0;
		if((building.length%2)==0){//Par

			path=(building.length/2);

		}
		else{

			path=((building.length-1)/2);

		}

		Cubicle actualCubicle;
		for(int i=0; i<path; i++){

			for(int x=i; x<(building.length-i); x++){

				actualCubicle=building[x][i];
				emails+=actualCubicle.emailByCharge(charge);

			}
			for(int y=(1+i); y<(building[0].length-i); y++){

				actualCubicle=building[building.length-(1+i)][y];
				emails+=actualCubicle.emailByCharge(charge);

			}
			for(int x=(building.length-(2+i)); x>=i; x--){

				actualCubicle=building[x][building[0].length-(1+i)];
				emails+=actualCubicle.emailByCharge(charge);

			}
			for(int y=(building[0].length-(2+i)); y>=(1+i); y--){

				actualCubicle=building[i][y];
				emails+=actualCubicle.emailByCharge(charge);

			}

		}
		if((building.length%2)!=0){

			for(int y=path; y<(building[0].length-path); y++){

				actualCubicle=building[path][y];
				emails+=actualCubicle.emailByCharge(charge);

			}

		}

		if(emails.equals("")){

			emails="No se encontro ningun empleado con ese cargo";

		}

		return emails;

	}

	/**
	*<b>Description:</b> Shows some data of the object in a String.<br>
	*<b>Pre:</b> The attribute creationDate, building, the elements of building and the elements inside the elements of building must not be null.<br>
	*@return A String that is the data of the object.
	*@throws NullPointerException If the attribute creationDate, building, the elements of building or the elements inside the elements of building of the company are null.
	*/
	public String toString(){

		String toString="\n	Nombre: "+getName();
		toString+="\n	Nit: "+nit;
		toString+="\n	Representante Legal: "+representativeName;
		toString+="\n	Dirreccion: "+address;
		toString+="\n	Telefono: "+phone;
		toString+="\n	Cantidad Empleados: "+employeeQuantity;
		toString+="\n	Valor Activos: "+assetsValue;
		toString+="\n	Fecha Constitucion: "+creationDate.toString();
		toString+="\n	Pisos Edificio: "+building.length;
		int buildingEmployeeQuantity=0;
		for(int x=0; x<building.length; x++){
			for(int y=0; y<building[0].length; y++){
				if(building[x][y].getEmployee()!=null){buildingEmployeeQuantity++;}
			}
		}
		toString+="\n	Cantidad Empleados Edificio: "+buildingEmployeeQuantity;
		
		return toString;

	}

	//Add
	/**
	*<b>Description:</b> Create a employee on the first available cubicle of the building from the first floor to the last floor. If all the cubicles are full do not add the employee to the building.<br>
	*<b>Pre:</b> The attribute building, the elements of building and the elements inside the elements of building must not be null.<br>
	*@param name The name for the employee.
	*@param charge The charge for the employee.
	*@param email The email for the employee.
	*@return A String that informs that the employee has been added.
	*@throws NullPointerException If the attribute building, the elements of building or the elements inside the elements of building of the company are null.
	*/
	public String addEmployee(String name, String charge, String email){

		String message="No se pudo agregar al empleado porque todos los cubiculos estan llenos";

		boolean run=true;
		for(int x=0;(x<building.length) && run; x++){
			for(int y=0;(y<building[0].length) && run; y++){

				if(building[x][y].getEmployee()==null){

					message=building[x][y].addEmployee(name, charge, email);
					run=false;

				}

			}
		}

		return message;

	}

	//Gets
	/**
	*<b>Description:</b> Return the name of the company.<br>
	*@return A String that is the name of the company.
	*/
	public String getName(){

		return name;

	}

	/**
	*<b>Description:</b> Return the nit of the company.<br>
	*@return A String that is the nit of the company.
	*/
	public String getNit(){

		return nit;

	}

	/**
	*<b>Description:</b> Return the legal representative name of the company.<br>
	*@return A String that is the legal representative name of the company.
	*/
	public String getRepresentativeName(){

		return representativeName;

	}

	/**
	*<b>Description:</b> Return the address of the company.<br>
	*@return A String that is the address of the company.
	*/
	public String getAddress(){

		return address;

	}

	/**
	*<b>Description:</b> Return the phone of the company.<br>
	*@return A String that is the phone of the company.
	*/
	public String getPhone(){

		return phone;

	}

	/**
	*<b>Description:</b> Return the employee quantity of the company.<br>
	*@return A int that is the employee quantity of the company.
	*/
	public int getEmployeeQuantity(){

		return employeeQuantity;

	}

	/**
	*<b>Description:</b> Return the assets value of the company.<br>
	*@return A double that is the assets value of the company.
	*/
	public double getAssetsValue(){

		return assetsValue;

	}

	/**
	*<b>Description:</b> Return the creation date of the company. If the date does not exist return <code>null</code>.<br>
	*@return A Date that is the creation date of the company.
	*/
	public Date getCreationDate(){

		return creationDate;

	}

	/**
	*<b>Description:</b> Return the building (All the cubicles) of the company. If the building does not exist return <code>null</code>.<br>
	*@return A Cubicle[][] that is the building of the company.
	*/
	public Cubicle[][] getBuilding(){

		return building;

	}

}

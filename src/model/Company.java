package model;

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
				
				if((x%2)==0){
					
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
					
					for(int y=(building[0].length-1); (y>=0) & run; y--){
						
						if(building[x][y].getEmployee()!=null){
							if(name.equals(building[x][y].getEmployee().getName())){
								
								extension=building[x][y].getExtension();
								run=false;
								
							}
						}
						
					}
					
				}
				
			}
			//...
			
		}
		
		return extension;
		
	}
	
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
		
		return toString;
		
	}
	
	//Add
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
	public String getName(){
		
		return name;
		
	}
	
	public String getNit(){
		
		return nit;
		
	}
	
	public String getRepresentativeName(){
		
		return representativeName;
		
	}
	
	public String getAddress(){
		
		return address;
		
	}
	
	public String getPhone(){
		
		return phone;
		
	}
	
	public int getEmployeeQuantity(){
		
		return employeeQuantity;
		
	}
	
	public double getAssetsValue(){
		
		return assetsValue;
		
	}
	
	public Date getCreationDate(){
		
		return creationDate;
		
	}
	
	public Cubicle[][] getBuilding(){
		
		return building;
		
	}
	
}
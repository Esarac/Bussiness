package model;

public abstract class Company{
	
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
	public Company(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, Date creationDate, int floors, int cubicles){
		
		this.name=name;
		this.nit=nit;
		this.representativeName=representativeName;
		this.address=address;
		this.phone=phone;
		this.employeeQuantity=employeeQuantity;
		this.assetsValue=assetsValue;
		this.creationDate=creationDate;
		
		this.building=new Cubicle[floors][cubicles];
		
		for(int x=0;x<building.length; x++){
			for(int y=0;y<building[0].length; y++){
				
				if(y<10){
					
					building[x][y]=new Cubicle(x+"0"+y);
					
				}
				else{
					
					building[x][y]=new Cubicle(x+y+"");
					
				}
				
			}
		}
		
	}
	
	//Do
	public String toString(){//Empleados tambien???
		
		String toString="\nNombre: "+name+"\nNit: "+nit+"\nRepresentante Legal: "+representativeName+"\nDirreccion: "+address+"\nTelefono: "+phone+"\nCantidad Empleados: "+employeeQuantity+"\nValor Activos: "+assetsValue+"\nFecha Constitucion: "+creationDate.toString();
		return toString;
		
	}
	
	//Add
	public String addEmployee(String employeeName, String employeeCharge, String employeeEmail){
		
		String message="No se pudo agregar al empleado porque todos los cubiculos estan llenos";
		
		boolean run=true;
		
		for(int x=0;(x<building.length) && run; x++){
			for(int y=0;y<building[0].length; y++){
				
				if(building[x][y].getEmployeeName()==null){
					
					message=building[x][y].addEmployee(employeeName, employeeCharge, employeeEmail);
					
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
	
}
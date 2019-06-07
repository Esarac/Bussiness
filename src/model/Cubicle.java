package model;

public class Cubicle{
	
	//Attributes
	private Employee employee;
	private String extension;
	
	//Constructor
	public Cubicle(String extension){
		
		this.extension=extension;
		
	}
	
	//Do
	public String addEmployee(String name, String charge, String email){
		
		String message="Se ha aniadido el empleado";
		
		employee=new Employee(name, charge, email);
		
		return message;
		
	}
	
	public String emailByCharge(String charge){
		
		String email="";
		
		if(employee!=null){
			if(charge.equals(employee.getCharge())){
				
				email="\n-"+employee.getEmail();
				
			}
		}
		
		return email;
		
	}
	
	//Gets
	public Employee getEmployee(){
		
		return employee;
		
	}
	
	public String getExtension(){
		
		return extension;
		
	}
	
}
package model;

public class Cubicle{
	
	//Attributes
	private String employeeName;
	private String employeeCharge;
	private String employeeEmail;
	private String extension;
	
	//Constructor
	public Cubicle(String extension){
		
		this.extension=extension;
		
	}
	
	//Do
	public String addEmployee(String employeeName, String employeeCharge, String employeeEmail){
		
		String message="Se ha aniadido el empleado";
		
		this.employeeName=employeeName;
		this.employeeCharge=employeeCharge;
		this.employeeEmail=employeeEmail;
		
		return message;
		
	}
	
	//Gets
	public String getEmployeeName(){
		
		return employeeName;
		
	}
	
}
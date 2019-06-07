package model;

public class Employee {
	
	//Attributes
	private String name;
	private String charge;
	private String email;
	
	//Constructor
	public Employee(String name, String charge, String email){
		
		this.name=name;
		this.charge=charge;
		this.email=email;
		
	}
	
	//Gets
	public String getName(){
		
		return name;
		
	}
	
	public String getCharge(){
		
		return charge;
		
	}
	
	public String getEmail(){
		
		return email;
		
	}
	
}

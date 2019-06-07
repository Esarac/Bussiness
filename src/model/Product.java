package model;

public class Product{
	
	//Attributes
	private String name;
	private String id;
	private double requiredWater;
	private int quantity;
	
	//Constructor
	public Product(String name, String id, double requiredWater, int quantity){
		
		this.name=name;
		this.id=id;
		this.requiredWater=requiredWater;
		this.quantity=quantity;
		
	}
	
	//Do
	public String toString(){
		
		return "\n		Nombre: "+name+"\n		Id: "+id+"\n		Agua Requerida: "+requiredWater+"\n		Cantidad: "+quantity;
		
	}
	
	//Gets
	public double getRequiredWater(){
		
		return requiredWater;
		
	}
	
	public int getQuantity(){
		
		return quantity;
		
	}
	
}
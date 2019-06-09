package model;

/**
*<b>Description:</b> The class Product in the package model.<br>
*@author Esteban Ariza Acosta
*/
public class Product{

	//Attributes
	private String name;
	private String id;
	private double requiredWater;
	private int quantity;

	//Constructor
	/**
	*<b>Description:</b> The constructor of the class Product.<br>
	*<b>Post:</b> All The attributes of the class are initialize.<br>
	*@param name The name we want to set.
	*@param id The id we want to set.
	*@param requiredWater The required water we want to set.
	*@param quantity The quantity we want to set.
	*/
	public Product(String name, String id, double requiredWater, int quantity){

		this.name=name;
		this.id=id;
		this.requiredWater=requiredWater;
		this.quantity=quantity;

	}

	//Do
	/**
	*<b>Description:</b> Shows all the data of the object in a String.<br>
	*@return A String the data of the object.
	*/
	public String toString(){

		return "\n		Nombre: "+name+"\n		Id: "+id+"\n		Agua Requerida: "+requiredWater+"\n		Cantidad: "+quantity;

	}

	//Gets
	/**
	*<b>Description:</b> Return the required water for the product creation.<br>
	*@return A double that is the required water for the product creation.
	*/
	public double getRequiredWater(){

		return requiredWater;

	}

	/**
	*<b>Description:</b> Return the inventory quantity of the product.<br>
	*@return A int that is the inventory quantity of the product.
	*/
	public int getQuantity(){

		return quantity;

	}

}

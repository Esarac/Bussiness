package model;
import java.util.ArrayList;

/**
*<b>Description:</b> The class ProductionCompany in the package model.<br>
*@author Esteban Ariza Acosta
*/
public class ProductionCompany extends SubordinateCompany{

	//Attributes
	private ArrayList<Product> products;

	//Constructor
	/**
	*<b>Description:</b> The constructor of the class ProductionCompany.<br>
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
	*@param type The type we want to set.
	*/
	public ProductionCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type){

		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type);

		this.products=new ArrayList<Product>();

	}

	//Do
	/**
	*<b>Description:</b> Shows some data of the object in a String.<br>
	*<b>Pre:</b> The attribute products and the elements inside of it must not be null.<br>
	*@return A String that is the data of the object.
	*@throws NullPointerException If the attribute products or the elements inside of it of the company are null.
	*/
	public String toString(){

		String toString=super.toString();
		for(int i=0; i<products.size(); i++){

			toString+="\n	~Producto "+(i+1)+":"+products.get(i).toString();

		}
		return toString;

	}

	//Add
	/**
	*<b>Description:</b> Add a product in the company products.<br>
	*<b>Pre:</b> The attribute products must not be null.<br>
	*<b>Post:</b> The product was added to surveys.<br>
	*@param product The product we want to add.
	*@return A String that informs that the product has been added.
	*@throws NullPointerException If the attribute products of the company is null.
	*/
	public String addProduct(Product product){

		String message="Se ha aniadido el producto a la empresa";

		products.add(product);

		return message;

	}

	//Gets
	/**
	*<b>Description:</b> Return all the products of the company.<br>
	*@return A ArrayList that is the products of the company.
	*/
	public ArrayList<Product> getProducts(){

		return products;

	}

}

package model;
import java.util.ArrayList;

public class ProductionCompany extends SubordinateCompany{
	
	//Attributes
	private ArrayList<Product> products;
	
	//Constructor
	public ProductionCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type){
		
		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type);
		
		this.products=new ArrayList<Product>();
		
	}
	
	//Do
	public String toString(){
		
		String toString=super.toString();
		for(int i=0; i<products.size(); i++){
			
			toString+="\n	~Producto "+(i+1)+":"+products.get(i).toString();
			
		}
		return toString;
		
	}
	
	//Add
	public String addProduct(Product product){
		
		String message="Se ha aniadido el producto a la empresa";
		
		products.add(product);
		
		return message;
		
	}
	
	//Gets
	public ArrayList<Product> getProducts(){
		
		return products;
		
	}
	
}
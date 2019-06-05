package model;
import java.util.ArrayList;

public class ProductionCompany extends SubordinateCompany{
	
	//Attributes
	private ArrayList<Product> products;
	
	//Constructor
	public ProductionCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, Date creationDate, int floors, int cubicles, String type){
		
		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDate, floors, cubicles, type);
		
		this.products=new ArrayList<Product>();
		
	}
	
	//Do
	public String toString(){
		
		String toString="\n	Nombre: "+getName()+"\n	Nit: "+getNit()+"\n	Representante Legal: "+getRepresentativeName()+"\n	Dirreccion: "+getAddress()+"\n	Telefono: "+getPhone()+"\n	Cantidad Empleados: "+getEmployeeQuantity()+"\n	Valor Activos: "+getAssetsValue()+"\n	Fecha Constitucion: "+getCreationDate().toString(true)+"\n	Tipo: "+getType();
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
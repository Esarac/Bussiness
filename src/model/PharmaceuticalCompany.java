package model;

public class PharmaceuticalCompany extends ProductionCompany{
	
	//Constants
	public final static String[] MODALITY_TYPES={"FABRICAR Y EXPORTAR", "FABRICAR Y VENDER", "IMPORTAR Y VENDER"};
	
	//Attributes
	private String sanitaryRecord;
	private boolean status;
	private Date expiration;
	private String modality;
	
	//Constructor
	public PharmaceuticalCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, Date creationDate, int floors, int cubicles, String type, String sanitaryRecord, boolean status, Date expiration, String modality){
		
		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDate, floors, cubicles, type);
		
		this.sanitaryRecord=sanitaryRecord;
		this.status=status;
		this.expiration=expiration;
		this.modality=modality;
		
	}
	
	//Do
	public String toString(){
		
		String toString="\n	Nombre: "+getName()+"\n	Nit: "+getNit()+"\n	Representante Legal: "+getRepresentativeName()+"\n	Dirreccion: "+getAddress()+"\n	Telefono: "+getPhone()+"\n	Cantidad Empleados: "+getEmployeeQuantity()+"\n	Valor Activos: "+getAssetsValue()+"\n	Fecha Constitucion: "+getCreationDate().toString(true)+"\n	Tipo: "+getType()+"\n	Registro Sanitario: "+sanitaryRecord+"\n	Estado: "+status+"\n	Vencimiento: "+expiration.toString(false)+"\n	Modalidad: "+modality;
		for(int i=0; i<getProducts().size(); i++){
			
			toString+="\n	~Producto "+(i+1)+":"+getProducts().get(i).toString();
			
		}
		return toString;
		
	}
	
}
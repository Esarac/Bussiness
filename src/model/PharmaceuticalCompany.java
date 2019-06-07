package model;

public class PharmaceuticalCompany extends ProductionCompany implements TreePlanter{
	
	//Constants
	public final static String[] MODALITY_TYPES={"FABRICAR Y EXPORTAR", "FABRICAR Y VENDER", "IMPORTAR Y VENDER"};
	
	//Attributes
	private String sanitaryRecord;
	private boolean status;
	private Date expiration;
	private String modality;
	
	//Constructor
	public PharmaceuticalCompany(String name, String nit, String representativeName, String address, String phone, int employeeQuantity, double assetsValue, int creationDay, int creationMonth, int creationYear, int floors, String type, String sanitaryRecord, boolean status, int expirationMonth, int expirationYear, String modality){
		
		super(name, nit, representativeName, address, phone, employeeQuantity, assetsValue, creationDay, creationMonth, creationYear, floors, type);
		
		this.sanitaryRecord=sanitaryRecord;
		this.status=status;
		
		Date expiration=new Date(expirationMonth, expirationYear);
		this.expiration=expiration;
		
		this.modality=modality;
		
	}
	
	//Do
	public String toString(){
		
		String toString=super.toString();
		toString+="\n	Registro Sanitario: "+sanitaryRecord;
		toString+="\n	Estado: "+status;
		toString+="\n	Vencimiento: "+expiration.toString();
		toString+="\n	Modalidad: "+modality;
		return toString;
		
	}
	
	public int calculateYearTreePlanting(){
		
		double water=0;
		for(int i=0; i<getProducts().size(); i++){
			
			water+=(getProducts().get(i).getRequiredWater())*(getProducts().get(i).getQuantity());
			
		}
		
		int trees=0;
		if((water>=1)&&(water<=140)){
			
			trees=6;
			
		}
		else if((water>140)&&(water<=800)){
			
			trees=25;
			
		}
		else if(water>800){
			
			trees=200;
			
		}
		
		return trees;
		
	}
	
}
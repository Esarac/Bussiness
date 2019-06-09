package model;

/**
*Description: The class Date in the package model.<br>
*@author Esteban Ariza
*/
public class Date{

	//Attributes
	private int day;
	private int month;
	private int year;

	//Constructor
	/**
	*Description: the constructor of the class Date.<br>
	*Post: All The attributes of the clase are initialize.<br>
	*@param day The day we want to set.
	*@param month The month we want to set.
	*@param year The year we want to set.
	*/
	public Date(int day, int month, int year){

		this.day=day;
		this.month=month;
		this.year=year;

	}
	
	public Date(int month, int year){

		this.day=0;
		this.month=month;
		this.year=year;

	}
	
	//Do
	public String toString(){
		
		if(day!=0){
			
			return this.day+"/"+month+"/"+year;
			
		}
		else{
			
			return month+"/"+year;
			
		}
		
	}
	
}

package model;

/**
*<b>Description:</b> The class Date in the package model.<br>
*@author Esteban Ariza Acosta
*/
public class Date{

	//Attributes
	private int day;
	private int month;
	private int year;

	//Constructor
	/**
	*<b>Description:</b> The constructor of the class Date. It is for the creation of the common dates.<br>
	*<b>Post:</b> All The attributes of the class are initialize.<br>
	*@param day The day we want to set.
	*@param month The month we want to set.
	*@param year The year we want to set.
	*/
	public Date(int day, int month, int year){

		this.day=day;
		this.month=month;
		this.year=year;

	}

	/**
	*<b>Description:</b> The constructor of the class Date. It is for the expiration dates.<br>
	*<b>Post:</b> All The attributes of the class are initialize.<br>
	*@param month The month we want to set.
	*@param year The year we want to set.
	*/
	public Date(int month, int year){

		this.day=0;
		this.month=month;
		this.year=year;

	}

	//Do
	/**
	*<b>Description:</b> Shows all the data of the object in a String. If the day its equal to <code>0</code>, only shows the month and the year.<br>
	*@return A String that is the data of the object.
	*/
	public String toString(){

		if(day!=0){

			return this.day+"/"+month+"/"+year;

		}
		else{

			return month+"/"+year;

		}

	}

}

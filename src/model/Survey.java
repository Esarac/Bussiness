package model;

/**
*<b>Description:</b> The class Survey in the package model.<br>
*@author Esteban Ariza Acosta
*/
public class Survey{

	//Constants
	public final static String[] QUESTIONS={"El servicio prestado", "El tiempo de respuesta dado", "La relacion costo/ beneficio del servicio adquirido"};

	//Attributes
	private int[] answers;

	//Constructor
	/**
	*<b>Description:</b> The constructor of the class Survey.<br>
	*<b>Post:</b> All The attributes of the class are initialize.<br>
	*@param answer0 The first answer we want to set.
	*@param answer1 The second answer we want to set.
	*@param answer2 The third answer we want to set.
	*/
	public Survey(int answer0, int answer1, int answer2){

		this.answers=new int[3];

		this.answers[0]=answer0;
		this.answers[1]=answer1;
		this.answers[2]=answer2;

	}

	//Do
	/**
	*<b>Description:</b> Calculate the average satisfaction of the survey with the current answers.<br>
	*<b>Pre:</b> The attribute answer must not be null.<br>
	*@return A double that is the survey satisfaction average.
	*@throws NullPointerException if the attribute answers of the company is null.
	*/
	public double calculateSatisfaction(){

		double satisfaction=0;
		for(int i=0; i<answers.length; i++){

			satisfaction+=answers[i];

		}
		satisfaction/=answers.length;

		return satisfaction;

	}

}

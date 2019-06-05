package model;

public class Survey{
	
	//Constants
	public final static String[] QUESTIONS={"El servicio prestado", "El tiempo de respuesta dado", "La relacion costo/ beneficio del servicio adquirido"};	
	
	//Attributes
	private int[] answers;
	
	//Constructor
	public Survey(int answer0, int answer1, int answer2){
		
		this.answers=new int[3];
		
		this.answers[0]=answer0;
		this.answers[1]=answer1;
		this.answers[2]=answer2;
		
	}
	
	//Do
	public double calculateSatisfaction(){
		
		double satisfaction=0;
		for(int i=0; i<answers.length; i++){
			
			satisfaction+=answers[i];
			
		}
		satisfaction/=answers.length;
		
		return satisfaction;
		
	}
	
}
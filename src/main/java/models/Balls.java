package models;

	/**
	 * @author 		Pol & Angel
	 * @name 		Balls.java
	 * @origin		Play.java 
	 * @description	Model: objecte que permet guardar el numero de boles blanques i negres a un intent
	 * @test		BallsTest.java
	 */
public class Balls {
	private int blackBalls;
	private int whiteBalls;
	boolean checkIt;
	private String stringArray[];
	
	/**
	 * @constructor Creació del objecte Balls amb els seus atributs
	 * @blackBalls	Integer: quantitat de boles negres al intent
	 * @whiteBalls	Integer: quantitat de boles blanques al intent
	 * @checkIt		Boolean: veure si ha trobat les boles correctament
	 */
	public Balls() {
		this.blackBalls = 0;  
		this.whiteBalls = 0;
		this.checkIt = false; 
	}
	
	/**
	 * @checkWhiteBalls		Metode que comprova si hi ha boles blanques a arraySolution[] i en aquest cas les guarda a whiteBalls
	 * @param arrayAttempts	Array: guarda tots els intents que fa l'usuari (1234-4536-2934-etc.)
	 * @param arraySolution	Array: solucio final per guanyar el joc (9-7-2-3)
	 * @param attempt		Integer: intent actual per jugar
	 * @return 				checkIt: retorna si ha trobat boles blanques o no
	 */
	public boolean checkWhiteBalls(String arrayAttempts[][], int arraySolution[], int attempt) {
		whiteBalls=0;
		checkIt = false;
		stringArray = new String[arraySolution.length];
		
		for (int index = 0; index < arraySolution.length; index++) {
			stringArray[index] = String.valueOf(arraySolution[index]);
			if(arrayAttempts[attempt][index].equals(stringArray[index])) { 
				this.whiteBalls++;
				checkIt = true;  
			}
		}
		
		return checkIt;
	}
	
	/** 
	 * @checkBlackBalls		Metode que comprova si hi ha boles negres a arraySolution[] i en aquest cas les guarda a blackBalls
	 * @param arrayAttempts	Array: guarda tots els intents que fa l'usuari (1234-4536-2934-etc.)
	 * @param arraySolution	Array: solucio final per guanyar el joc (9-7-2-3)
	 * @param attempt		Integer: intent actual per jugar
	 * @return 				checkIt: retorna si ha trobat boles negres o no
	 */
	public boolean checkBlackBalls(String arrayAttempts[][], int arraySolution[], int attempt) {
		blackBalls=0;
		checkIt = false;
		stringArray = new String[arraySolution.length];
		
		for (int index = 0; index < arraySolution.length; index++) {
			for (int index1 = 1; index1 < arraySolution.length; index1++) {
				stringArray[index] = String.valueOf(arraySolution[(index+index1)%4]);
				if(arrayAttempts[attempt][index].equals(stringArray[index])) {
					this.blackBalls++; 
					checkIt = true;   
				}
			}
		}
		 
		return checkIt;
	}
	
	
	/**
	 * @getters Gets de l'objecte Balls 
	 */
	public int getBlackBalls() {
		return blackBalls;
	}

	public int getWhiteBalls() {
		return whiteBalls;
	}

}

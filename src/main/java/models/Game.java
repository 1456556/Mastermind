package models;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author 		Pol & Angel
 * @name 		Game.java
 * @origin		Play.java 
 * @description	Model: motor del programa, conte tots els metodes pel funcionament del joc
 * @test		GameTest.java
 */
public class Game { 
	private int arraySolution[];
	private String arrayAttempts[][]; 
	private int attempt;
	private Random randomCreator = new Random();
	
	/**
	 * @constructor 		Creació del objecte Game amb els seus atributs, es pasa per parametre maxAttempt
	 * @param maxAttempt	Integer: quanitat maxima d'intents, esta creat per futures implementacions ja que podrem canviar si es vol amb 10 o 5 intents per mes dificultat a l'hora de jugar
	 * @arrayAttempts		Array: strings que conten els resultats que va introduint l'usuari 
	 * @attempt				Integer: numero d'intent actual
	 * @arraySolution		Array: solucio final per acabar el joc
	 */
	public Game(int maxAttempt) { 
		this.arrayAttempts = new String[maxAttempt][6];   
		this.attempt = 0;
		this.arraySolution = new int[4];
	}
	
	/**
	 * @solution	Metode que crea una soucio valida pel joc, comprova que cap numero es igual a l'anterior
	 * @return		arraySolution: conte la solucio final per acabar el joc (9-2-3-1, per exemple)
	 */
	public int[] solution() {
		Set<Integer> alreadyUsedNumbers = new HashSet<>();
		int total = 0;
		
		while (alreadyUsedNumbers.size() < 4) {
			 int randomNumber = randomCreator.nextInt(10);
			 if (!alreadyUsedNumbers.contains(randomNumber)){
				 arraySolution[total] = randomNumber;
				 alreadyUsedNumbers.add(randomNumber);

				 total++;
			 }
		}
		

		return arraySolution; 
	}
		
	
	/**
	 * @checkNumber	Metode que comprova si el numero introduit es de 4 digits, en cas de ser-ho intenta convertir-lo a Integer
	 * @param value String: opcio que ha introduit l'usuari per teclat
	 * @return		Boolean: en cas de se un numero diferent de 4 digits retorna un false, si es de 4 digits pero no son numeros tambe. Unic cas que retorna true es que siguin 4 numeros
	 */
	public boolean checkNumber(String value) {
        if(value.length() != 4) {
            return false; 
        }else {
            try {
                Integer.parseInt(value);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }
	
	/**
	 * @introduceArrayAttempts	Metode que introdueix la opcio de l'usuari a l'array d'intents arrayAttempts
	 * @param value				String: opcio que ha introduit l'usuari per teclat
	 * @return					Array: retorna tota l'array d'intents ja que d'aquesta forma el test tindra mes qualitat
	 */
	public String[][] introduceArrayAttempts(String value) {
		char[] valueSeparate = value.toCharArray();

        for(int index = 0; index < 4; index++) {
            arrayAttempts[attempt][index] = Character.toString(valueSeparate[index]);
        }  
        return arrayAttempts;
	}
	
	/**
	 * @introduceBalls		Metode que introdueix les boles blanques i les boles negres al seu intent corresponent a l'array arrayAttempts
	 * @param whiteBalls	Integer: quanitat de boles blanques que s'introduiran 
	 * @param blackBalls	Integer: quanitat de boles negres que s'introduiran 
	 * @return				Array: retorna tota l'array d'intents ja que d'aquesta forma el test tindra mes qualitat
	 */
	public String[][] introduceBalls(int whiteBalls, int blackBalls) {
		String white = String.valueOf(whiteBalls);
		String black = String.valueOf(blackBalls);
		
		this.arrayAttempts[attempt][4] = white;
		this.arrayAttempts[attempt][5] = black;  
		
		return arrayAttempts;
	}
	

	/**
	 * @getters Gets de l'objecte Balls
	 */
	public int[] getArraySolution() {
		return arraySolution;
	}

	public String[][] getArrayAttempts() {
		return arrayAttempts;
	}
	
	public int getAttempt() {
		return attempt;
	}
	
	/**
	 * @setter Set de l'objecte Balls
	 */
	public void setAttempt(int attempt) {
		this.attempt = attempt;
	}

}

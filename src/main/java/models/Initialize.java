package models;

import java.util.Random;

public class Initialize {
	private int arraySolution[];
	private String arrayAttempts[][];
	private int attempt;
	private Random randomCreator = new Random();
	
	public Initialize(int maxAttempt) {
		this.arrayAttempts = new String[maxAttempt][6]; 
		this.attempt = 1;
		this.arraySolution = new int[4];
	}
	
	public int[] solution() {
		for(int index = 0; index < 4; index++) {
			arraySolution[index] = Math.abs(randomCreator.nextInt()) % 10;
			random();
			System.out.println(arraySolution[index]); //borrar
		}
		
		return arraySolution;
	}
	
	public void random() {
		while (arraySolution[1] == arraySolution[0])
			arraySolution[1] = Math.abs(randomCreator.nextInt()) % 10;
		
		while (arraySolution[2] == arraySolution[1] || arraySolution[2] == arraySolution[0])
			arraySolution[2] = Math.abs(randomCreator.nextInt()) % 10;
		
		while (arraySolution[3] == arraySolution[2] || arraySolution[3] == arraySolution[1] || arraySolution[3] == arraySolution[0])
			arraySolution[3] = Math.abs(randomCreator.nextInt()) % 10;
	}
	
	
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
	
	public String[][] introduceArrayAttempts(String value) {
		char[] valueSeparate = value.toCharArray();

        for(int index = 0; index < 4; index++) {
            arrayAttempts[attempt][index] = Character.toString(valueSeparate[index]);
        }  
        return arrayAttempts;
	}
	
	

	public int[] getArraySolution() {
		return arraySolution;
	}

	public void setArraySolution(int[] arraySolution) {
		this.arraySolution = arraySolution;
	}

	public String[][] getArrayAttempts() {
		return arrayAttempts;
	}

	public void setArrayAttempts(String[][] arrayAttempts) {
		this.arrayAttempts = arrayAttempts;
	}

	public int getAttempt() {
		return attempt;
	}

	public void setAttempt(int attempt) {
		this.attempt = attempt;
	}

	public Random getRandomCreator() {
		return randomCreator;
	}

	public void setRandomCreator(Random randomCreator) {
		this.randomCreator = randomCreator;
	}


}

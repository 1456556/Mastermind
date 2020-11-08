package models;

import java.util.Random;

public class Initialize {
	private int arraySolution[];
	private String arrayAttempts[][];
	private int attempt;
	private Random randomCreator = new Random();
	
	public Initialize(int attempt) {
		this.arrayAttempts = new String[attempt][6];
		this.attempt = attempt;
		this.arraySolution = new int[4];
	}
	
	public int[] solution() {
		
		arraySolution[0] = Math.abs(randomCreator.nextInt()) % 10;
		arraySolution[1] = Math.abs(randomCreator.nextInt()) % 10;
		arraySolution[1] = random1();
		arraySolution[2] = Math.abs(randomCreator.nextInt()) % 10;
		arraySolution[2] = random2();
		arraySolution[3] = Math.abs(randomCreator.nextInt()) % 10;
		arraySolution[3] = random3();
		return arraySolution;
	}
	
	public int random1() {
		while (arraySolution[1] == arraySolution[0])
			arraySolution[1] = Math.abs(randomCreator.nextInt()) % 10;
		return arraySolution[1];
	}
	
	public int random2() {
		while (arraySolution[2] == arraySolution[1] || arraySolution[2] == arraySolution[0])
			arraySolution[2] = Math.abs(randomCreator.nextInt()) % 10;
		return arraySolution[2];
	}
	
	public int random3() {
		while (arraySolution[3] == arraySolution[2] || arraySolution[3] == arraySolution[1] || arraySolution[3] == arraySolution[0])
			arraySolution[3] = Math.abs(randomCreator.nextInt()) % 10;
		return arraySolution[3];
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
	
	
	//Aqui haurem de separar el string i posar els valors al arrayAttempts
	//Hauriem de introduir per parametre tambe el arrayAttempts??
	public boolean introduceArrayAttempts(String value) {
		char[] valueSeparate = value.toCharArray();
		arrayAttempts[attempt][0] = 
		return true;
	}


	public int[] getArraySolution() {
		return arraySolution;
	}

	public void setArraySolution(int[] arraySolution) {
		this.arraySolution = arraySolution;
	}

	public Random getRandomCreator() {
		return randomCreator;
	}

	public void setRandomCreator(Random randomCreator) {
		this.randomCreator = randomCreator;
	}

}

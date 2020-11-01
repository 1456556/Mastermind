package models;

import java.util.Random;

public class Initialize {
	private int tempNumRandom0, tempNumRandom1, tempNumRandom2;
	static int arraySolution[];
	private int arrayAttempts[][];
	private int attempt;
	private Random randomCreator = new Random();
	
	public Initialize(int attempt) {
		this.tempNumRandom0 = 0;
		this.tempNumRandom1 = 0;
		this.tempNumRandom2 = 0;
		this.arrayAttempts = new int[attempt][6];
		this.attempt = attempt;
		Initialize.arraySolution = null;
	}
	
	public int[] solution(int arraySolution[]) {
		
		arraySolution[0] = Math.abs(randomCreator.nextInt()) % 10;
		arraySolution[1] = random1(tempNumRandom0);
		arraySolution[2] = random2(tempNumRandom0, tempNumRandom1);
		arraySolution[3] = random3(tempNumRandom0, tempNumRandom1, tempNumRandom2);
		
		return arraySolution;
	}
	
	public int random1(int numRandom0) {
		int numRandomAux1;
		numRandomAux1 = Math.abs(randomCreator.nextInt()) % 10;
		while (numRandomAux1 == numRandom0)
			numRandomAux1 = Math.abs(randomCreator.nextInt()) % 10;
		return numRandomAux1;
	}
	
	public int random2(int numRandom0, int numRandom1) {
		int numRandomAux2;
		numRandomAux2 = Math.abs(randomCreator.nextInt()) % 10;
		while (numRandomAux2 == numRandom0 || numRandomAux2 == numRandom1)
			numRandomAux2 = Math.abs(randomCreator.nextInt()) % 10;
		return numRandomAux2;
	}
	
	public int random3(int numRandom0, int numRandom1, int numRandom2) {
		int numRandomAux3;
		numRandomAux3 = Math.abs(randomCreator.nextInt()) % 10;
		while (numRandomAux3 == numRandom0 || numRandomAux3 == numRandom1 || numRandomAux3 == numRandom2)
			numRandomAux3 = Math.abs(randomCreator.nextInt()) % 10;
		return numRandomAux3;
	}
	
	

	public int getTempNumRandom0() {
		return tempNumRandom0;
	}

	public void setTempNumRandom0(int tempNumRandom0) {
		this.tempNumRandom0 = tempNumRandom0;
	}

	public int getTempNumRandom1() {
		return tempNumRandom1;
	}

	public void setTempNumRandom1(int tempNumRandom1) {
		this.tempNumRandom1 = tempNumRandom1;
	}

	public int getTempNumRandom2() {
		return tempNumRandom2;
	}

	public void setTempNumRandom2(int tempNumRandom2) {
		this.tempNumRandom2 = tempNumRandom2;
	}

	public static int[] getArraySolution() {
		return arraySolution;
	}

	public static void setArraySolution(int[] arraySolution) {
		Initialize.arraySolution = arraySolution;
	}

	public Random getRandomCreator() {
		return randomCreator;
	}

	public void setRandomCreator(Random randomCreator) {
		this.randomCreator = randomCreator;
	}
	
	
	
}

package models;

import java.util.Random;

public class SolutionNumbers {
	private int tempNumRandom0, tempNumRandom1, tempNumRandom2, tempNumRandom3;
	static int [] arraySolution;
	
	public SolutionNumbers() {
		this.tempNumRandom0 = 0;
		this.tempNumRandom1 = 0;
		this.tempNumRandom2 = 0;
		this.tempNumRandom3 = 0;
		SolutionNumbers.arraySolution = null;
	}
	
	public int[] solution(int [] arraySolution) {
		Random randomCreator = new Random();
		
		arraySolution[0] = Math.abs(randomCreator.nextInt()) % 10;
		arraySolution[1] = random1(tempNumRandom0);
		arraySolution[2] = random2(tempNumRandom0, tempNumRandom1);
		arraySolution[3] = random3(tempNumRandom0, tempNumRandom1, tempNumRandom2);
		
		return arraySolution;
	}
	
	public int random1(int numRandom0) {
		int numRandomAux1;
		Random randomCreator = new Random();
		numRandomAux1 = Math.abs(randomCreator.nextInt()) % 10;
		while (numRandomAux1 == numRandom0)
			numRandomAux1 = Math.abs(randomCreator.nextInt()) % 10;
		return numRandomAux1;
	}
	
	public int random2(int numRandom0, int numRandom1) {
		int numRandomAux2;
		Random randomCreator = new Random();
		numRandomAux2 = Math.abs(randomCreator.nextInt()) % 10;
		while (numRandomAux2 == numRandom0 || numRandomAux2 == numRandom1)
			numRandomAux2 = Math.abs(randomCreator.nextInt()) % 10;
		return numRandomAux2;
	}
	
	public int random3(int numRandom0, int numRandom1, int numRandom2) {
		int numRandomAux3;
		Random randomCreator = new Random();
		numRandomAux3 = Math.abs(randomCreator.nextInt()) % 10;
		while (numRandomAux3 == numRandom0 || numRandomAux3 == numRandom1 || numRandomAux3 == numRandom2)
			numRandomAux3 = Math.abs(randomCreator.nextInt()) % 10;
		return numRandomAux3;
	}
	
}

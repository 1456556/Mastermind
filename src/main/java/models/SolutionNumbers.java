package models;

import java.util.Random;

public class SolutionNumbers {
	//private static Random randomCreator;
	private static int numRandom0, numRandom1, numRandom2, numRandom3;
	static int [] arraySolution;
	
	public int[] solution(int [] arraySolution) {
		Random randomCreator = new Random();
		numRandom0 = Math.abs(randomCreator.nextInt()) % 10;
		numRandom1 = Math.abs(randomCreator.nextInt()) % 10;
		while (numRandom1 == numRandom0) // ensures that all numbers are different from each other
			numRandom1 = Math.abs(randomCreator.nextInt()) % 10;
		numRandom2 = Math.abs(randomCreator.nextInt()) % 10;
		while (numRandom2 == numRandom1 || numRandom2 == numRandom0)
			numRandom2 = Math.abs(randomCreator.nextInt()) % 10;
		numRandom3 = Math.abs(randomCreator.nextInt()) % 10;
		while (numRandom3 == numRandom2 || numRandom3 == numRandom1 || numRandom3 == numRandom0)
			numRandom3 = Math.abs(randomCreator.nextInt()) % 10;

		arraySolution[0] = numRandom0;
		arraySolution[1] = numRandom1;
		arraySolution[2] = numRandom2;
		arraySolution[3] = numRandom3;
		return arraySolution;
	}
}

package Mastermind;

import static org.junit.Assert.assertNotEquals;

import java.util.Random;

import org.junit.Test;

public class testModelRandomNumbers {
	
	@Test
	public static void testNextNumber() {
		int numRandom0, numRandom1, numRandom2, numRandom3;
		ModelRandomNumbers mrn = new ModelRandomNumbers();
		Random rc = mrn.randomCreator;
		int[] arraySolution = new int[4];
		mrn.nextNumber(rc, arraySolution);
		numRandom0 = arraySolution[0];
		numRandom1 = arraySolution[1];
		numRandom2 = arraySolution[2];
		numRandom3 = arraySolution[3];
		//Tots els 4 números han de ser diferents entre ells
		assertNotEquals(numRandom0, numRandom1);
		assertNotEquals(numRandom0, numRandom2);
		assertNotEquals(numRandom0, numRandom3);
		assertNotEquals(numRandom1, numRandom2);
		assertNotEquals(numRandom1, numRandom3);
		assertNotEquals(numRandom2, numRandom3);
	}
}

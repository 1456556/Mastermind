package Mastermind;

import org.junit.Test;
import static org.junit.Assert.*;

public class testModelSolutionNumbers {
	
	@Test public void testSolution() {
		ModelSolutionNumbers mrn = new ModelSolutionNumbers();
		int[] arraySolution = new int[4];
		arraySolution = mrn.solution(arraySolution);
		
		//Tots els 4 números han de ser diferents entre ells
		assertNotEquals(arraySolution[0], arraySolution[1]);
		assertNotEquals(arraySolution[0], arraySolution[2]);
		assertNotEquals(arraySolution[0], arraySolution[3]);
		assertNotEquals(arraySolution[1], arraySolution[2]);
		assertNotEquals(arraySolution[1], arraySolution[3]);
		assertNotEquals(arraySolution[2], arraySolution[3]);
	}
}

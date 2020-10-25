package Mastermind;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestModelSolutionNumbers {
	
	@Test public void testSolution() {
		ModelSolutionNumbers mrn = new ModelSolutionNumbers();
		int[] arraySolution = new int[4];
		arraySolution = mrn.solution(arraySolution);
		
		//Tots els 4 n�meros han de ser diferents entre ells
		assertNotEquals(arraySolution[0], arraySolution[1]);
		assertNotEquals(arraySolution[0], arraySolution[2]);
		assertNotEquals(arraySolution[0], arraySolution[3]);
		assertNotEquals(arraySolution[1], arraySolution[2]);
		assertNotEquals(arraySolution[1], arraySolution[3]);
		assertNotEquals(arraySolution[2], arraySolution[3]);
		
		//Tots els 4 n�meros generats han de ser m�s petits que 10
		//i han de ser positius (m�s grans que 0)
		boolean range0 = false;
		boolean range1 = false;
		boolean range2 = false;
		boolean range3 = false;
		if(arraySolution[0] < 10 && arraySolution[0] >= 0)
			range0 = true;
		if(arraySolution[1] < 10 && arraySolution[1] >= 0)
			range1 = true;
		if(arraySolution[2] < 10 && arraySolution[2] >= 0)
			range2 = true;
		if(arraySolution[3] < 10 && arraySolution[3] >= 0)
			range3 = true;
		
		assertTrue(range0);
		assertTrue(range1);
		assertTrue(range2);
		assertTrue(range3);
	}
}

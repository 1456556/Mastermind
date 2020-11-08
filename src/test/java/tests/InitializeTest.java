package tests;

import org.junit.Test;

import models.Initialize;

import static org.junit.Assert.*;

public class InitializeTest {
	
	@Test public void testSolution() {
		Initialize mrn = new Initialize(10);
		int[] arraySolution = new int[4];
		mrn.solution();
		arraySolution = mrn.getArraySolution();
		
		assertNotEquals(arraySolution[0], arraySolution[1]);
		assertNotEquals(arraySolution[0], arraySolution[2]);
		assertNotEquals(arraySolution[0], arraySolution[3]);
		assertNotEquals(arraySolution[1], arraySolution[2]);
		assertNotEquals(arraySolution[1], arraySolution[3]);
		assertNotEquals(arraySolution[2], arraySolution[3]);
		
		boolean range = false;
		for(int index = 0; index < 4; index++) {
			if(arraySolution[index] < 10 && arraySolution[index] >= 0)
				range = true; 
			assertTrue(range);
		}
	}
	
	
	
	@Test public void testCheckNumber() {
		Initialize mrn = new Initialize(10);
		boolean checkNum = mrn.checkNumber("1234");
		assertTrue(checkNum);
	}
	

	@Test public void testIntroduceArrayAttempts() {
		// HACER TEST introduceArrayAttempts() -> Preguntar profe
	}
	
}

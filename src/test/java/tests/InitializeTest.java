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
		
		for(int firstNumber = 0; firstNumber < 4; firstNumber++) {
			for(int secondNumber = 0; secondNumber < 4; secondNumber++) {
				if(arraySolution[firstNumber] != arraySolution[secondNumber]){
					assertNotEquals(arraySolution[firstNumber], arraySolution[secondNumber]);  
				}
			}
		}
		
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

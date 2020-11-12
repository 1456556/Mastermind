package tests;

import org.junit.Test;

import models.Initialize;

import static org.junit.Assert.*;

public class InitializeTest {
	
	@Test public void testSolution() {
		Initialize mrn = new Initialize(10);
		int[] arraySolution = new int[4]; 
		arraySolution = mrn.solution();
		
		for(int firstNumber = 0; firstNumber < 4; firstNumber++) {
			for(int secondNumber = 0; secondNumber < 4; secondNumber++) { 
				if(firstNumber != secondNumber){
					assertNotEquals(arraySolution[firstNumber], arraySolution[secondNumber]);  
				}
			}
		}
		
		boolean range = false;
		for(int index = 0; index < 4; index++) {
			if(arraySolution[index] < 10 && arraySolution[index] >= 0) {
				range = true; 
			}
			assertTrue(range);
		}
	}
	
	
	
	@Test public void testCheckNumber() {
		Initialize mrn = new Initialize(10);
		MockCheckNumber mck = new MockCheckNumber();
		
		mck.introduceArrayCorrectNumbers();
		mck.introduceArrayFailNumbers();
		
		for (int index = 0; index < mck.getArrayCorrectNumbers().length; index++) {
			boolean checkCorrectNumbers = mrn.checkNumber(mck.getArrayCorrectNumbers()[index]);
			assertTrue(checkCorrectNumbers);
		}
		
		
		for (int index = 0; index < mck.getArrayFailNumbers().length; index++) {
			boolean checkFailNumbers = mrn.checkNumber(mck.getArrayFailNumbers()[index]);
			assertFalse(checkFailNumbers);
		}
	}
	

	@Test public void testIntroduceArrayAttempts() {
		Initialize mrn = new Initialize(10);
		String arrayAttempts[][] = mrn.introduceArrayAttempts("2893");
		
		assertEquals(arrayAttempts[0][0], "2");
		assertEquals(arrayAttempts[0][1], "8");
		assertEquals(arrayAttempts[0][2], "9");
		assertEquals(arrayAttempts[0][3], "3");

	}
	
}

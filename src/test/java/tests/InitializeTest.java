package tests;

import org.junit.Test;

import models.Initialize;

import static org.junit.Assert.*;

public class InitializeTest {
	
	@Test public void testSolution() {
		Initialize mrn = new Initialize(10);
		int[] arraySolution = new int[4];
		arraySolution = mrn.solution(arraySolution);
		
		//Tots els 4 números han de ser diferents entre ells
		assertNotEquals(arraySolution[0], arraySolution[1]);
		assertNotEquals(arraySolution[0], arraySolution[2]);
		assertNotEquals(arraySolution[0], arraySolution[3]);
		assertNotEquals(arraySolution[1], arraySolution[2]);
		assertNotEquals(arraySolution[1], arraySolution[3]);
		assertNotEquals(arraySolution[2], arraySolution[3]);
		
		//Tots els 4 números generats han de ser més petits que 10
		//i han de ser positius (més grans que 0)
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
	
	
	
	// Comprobar que els valors introduits son numeros entre 0 y 9, y tambe diferents entre ells
	@Test public void testCheckNumber() {
        //Cridem al metode MockTeclat() per tal de que introdueixi un valor (value)
		//A continuacio fem el test
		
		MockTeclat mt = new MockTeclat("1", "1234");
		String value = mt.getSelection();
		boolean checkNum = true;
		if(value.length() != 4) {
			checkNum = false;
        }else {
            try {
                Integer.parseInt(value);
                checkNum = true;
            } catch (NumberFormatException e) {
            	checkNum = false;
            }
        }
		assertTrue(checkNum);
	}
	
	// Comprobar que s'introdueixen els valors correctament a l'array
	@Test public void testIntroduceArrayAttempts() {
		
	}
	
}

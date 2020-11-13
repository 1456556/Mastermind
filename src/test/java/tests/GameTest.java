package tests;

import org.junit.Test;

import models.Game;

import static org.junit.Assert.*;

public class GameTest {
	
	@Test public void testSolution() {
		Game game = new Game(10);
		int[] arraySolution = new int[4]; 
		arraySolution = game.solution();
		
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
		Game game = new Game(10);
		MockCheckNumber mock = new MockCheckNumber();
		
		mock.introduceArrayCorrectNumbers();
		mock.introduceArrayFailNumbers();
		
		for (int index = 0; index < mock.getArrayCorrectNumbers().length; index++) {
			boolean checkCorrectNumbers = game.checkNumber(mock.getArrayCorrectNumbers()[index]);
			assertTrue(checkCorrectNumbers);
		}
		
		
		for (int index = 0; index < mock.getArrayFailNumbers().length; index++) {
			boolean checkFailNumbers = game.checkNumber(mock.getArrayFailNumbers()[index]);
			assertFalse(checkFailNumbers);
		}
	}
	
	@Test public void testIntroduceArrayAttempts() {
		Game game = new Game(10);
		String arrayAttempts[][] = game.introduceArrayAttempts("2893");
		
		assertEquals(arrayAttempts[0][0], "2");
		assertEquals(arrayAttempts[0][1], "8");
		assertEquals(arrayAttempts[0][2], "9");
		assertEquals(arrayAttempts[0][3], "3"); 
		
		assertNotEquals(arrayAttempts[0][0], "1");
		assertNotEquals(arrayAttempts[0][1], "6");
		assertNotEquals(arrayAttempts[0][2], "7");
		assertNotEquals(arrayAttempts[0][3], "2");

	}
	
	@Test public void testIntroduceBalls() {
		Game game = new Game(10);
		String arrayAttempts[][] = game.introduceBalls(1,2);
		
		assertEquals(arrayAttempts[0][4], "1");
		assertEquals(arrayAttempts[0][5], "2");
		
		assertNotEquals(arrayAttempts[0][4], "3"); 
		assertNotEquals(arrayAttempts[0][5], "0");

	}
	
	
	
	@Test public void testGetArraySolution() {
		Game game = new Game(10);
		int arraySolutionTrue[] = new int[4];
		
		assertArrayEquals(arraySolutionTrue, game.getArraySolution());

	}
	
	@Test public void testGetArrayAttempts() {
		Game game = new Game(10);
		String arrayAttemptsTrue[][] = new String[10][6]; 
		
		assertArrayEquals(arrayAttemptsTrue, game.getArrayAttempts());
	}
	
	@Test public void testGetAttempt() {
		Game game = new Game(10);
		int attempt = 0;
		
		assertEquals(attempt, game.getAttempt());
		
		attempt = 9;
		assertNotEquals(attempt, game.getAttempt());
	}
	
	@Test public void testSetAttempt() {
		Game game = new Game(10);		
		game.setAttempt(5);
		
		assertEquals(game.getAttempt(), 5);
		
		game.setAttempt(9);
		assertNotEquals(game.getAttempt(), 5);
	}
	
}

package tests;

import org.junit.Test;
import models.Game;
import static org.junit.Assert.*;

/**
 * @author 		Pol & Angel
 * @name 		GameTest.java
 * @origin		Test.java 
 * @description	Test: fa test de totes les funcions i l'objecte Game
 * @test		testSolution(), testCheckNumber(), testIntroduceArrayAttempts(), testIntroduceBalls(), testGetArraySolution(), testGetArrayAttempts(), testGetAttempt(), testSetAttempt()  
 */
public class GameTest {
	
	/**
	 * @testSolution 
	 * Crea un objecte de tipos Game i guarda l'array de arraySolution. Fa una crida a la funcio ame.solution()
	 * Un cop hi ha l'array guardada s'ha de comprovar que els numeros son diferents entre si, en cas de ser diferents retorna true al assertNotEquals
	 * Tambe comprova despres que els numeros estiguin entre els rangs 0 i 9, es a dir mes gran o igual que 0 i mes petit que 10, en cas de ser correcte retorna true
	 */
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
	
	/**
	 * @testCheckNumber 
	 * Aquest test es fa amb un mockObject que te guardats un array correcte (arrayCorrectNumbers) i un array incorrecte (arrayFailNumbers)
	 * En un primer intent es comprova que el mock introdueix valors valids com per exemple 1234-2345-8923-etc. En cas de ser valors correctes retorna true
	 * En un segon intent es comprova que el mock introdeix valors invalids com per exemple 12345-123a-a1234-etc. En cas de ser valors incorrectes retorna false
	 */
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
	
	/**
	 * @testIntroduceArrayAttempts
	 * Es crea un array d'intents per defecte anomenat arrayAttempts amb "2893" i comproven que els resultats son correctes
	 * En un primer intent comprova que les posicions tenen els numeros correctes i retorna true
	 * En un segon intent es comprova amb uns altres numeros "1672" que no son correctes i retorna false
	 */
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
	
	/**
	 * @testIntroduceBalls
	 * Es crea un array de arrayAttempts per a introduir dues boles, 1 bola blanca i 2 boles negres
	 * En un primer intent es comprova que hi ha 1 bola blanca i 2 boles negres, en cas afirmatiu es retorna true
	 * En un segon intent es comprova que hi ha 3 boles blanques i 0 boels negres, i com no es veritat retorna false
	 */
	@Test public void testIntroduceBalls() {
		Game game = new Game(10);
		String arrayAttempts[][] = game.introduceBalls(1,2);
		
		assertEquals(arrayAttempts[0][4], "1");
		assertEquals(arrayAttempts[0][5], "2");
		
		assertNotEquals(arrayAttempts[0][4], "3"); 
		assertNotEquals(arrayAttempts[0][5], "0");

	}	
	
	/**
	 * @testGetArraySolution
	 * Comprovacio del getArraySolution() per a veure que retorna correctament un array amb les mateixes solucions i retorna true
	 */
	@Test public void testGetArraySolution() {
		Game game = new Game(10);
		int arraySolutionTrue[] = new int[4];
		
		assertArrayEquals(arraySolutionTrue, game.getArraySolution());

	}
	
	/**
	 * @testGetArrayAttempts
	 * Comprovacio del getArrayAttempts() per a veure que retorna correctament un array amb els mateixos intents i retorna true
	 */
	@Test public void testGetArrayAttempts() {
		Game game = new Game(10);
		String arrayAttemptsTrue[][] = new String[10][6]; 
		
		assertArrayEquals(arrayAttemptsTrue, game.getArrayAttempts());
	}
	
	/**
	 * @testGetAttempt
	 * Comprovacio del getAttempt() per a veure que retorna correctament l'intent actual
	 * En un primer cas es comprova amb l'intent 0 per defecte i com no s'ha canviat retorna true
	 * En un segon cas es canvia l'intent a 9 per a veure que no es igual, com no es igual es retorna un false, es a dir assertNotEquals correctament
	 */
	@Test public void testGetAttempt() {
		Game game = new Game(10);
		int attempt = 0;
		
		assertEquals(attempt, game.getAttempt());
		
		attempt = 9;
		assertNotEquals(attempt, game.getAttempt());
	}
	
	/**
	 * @testSetAttempt
	 * Comprovacio del testSetAttempt() per veure si assigna correctament el valor indicat
	 * En un primer cas es fa un set de 5 i despres amb un gest es comprova si es igual a 5. En cas afirmatiu retorna un true
	 * En un segon cas es fa un set de 9 i es torna a comprovar si es igual a 5. Com que el set s'ha fet correctament retornara un false, es a dir el assertnotEquals correctament
	 * 
	 */
	@Test public void testSetAttempt() {
		Game game = new Game(10);		
		game.setAttempt(5);
		
		assertEquals(game.getAttempt(), 5);
		
		game.setAttempt(9);
		assertNotEquals(game.getAttempt(), 5);
	}
	
}

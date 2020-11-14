package tests;

import org.junit.Test;

import models.Balls;

import static org.junit.Assert.*;

/**
 * @author 		Pol & Angel
 * @name 		BallsTest.java
 * @origin		Balls.java 
 * @description	Test: fa test de totes les funcions i l'objecte Balls
 * @test		testCheckWhiteBalls(), testCheckBlackBalls(), testGetBlackBalls(), testGetWhiteBalls()
 */
public class BallsTest { 
	
	/**
	 * @testCheckWhiteBalls	
	 * Crida l'objecte Balls per comprovar el metode checkWhiteBalls(arrayAttempts, arraySolution, 0)
	 * Amb un mockObject fa la creacio d'uns arrays que es pasaran per parametre i comprovaran si els resultats son iguals que la solucio de Balls
	 * Hi ha dos comprovacions per afirmar que funciona tot correctament, una que conte boles blanques i dona true i una altre que no conte cap i dona false
	 */
	@Test public void testCheckWhiteBalls() {
		Balls whiteBalls = new Balls();
		MockBalls mockBalls = new MockBalls();
		
		mockBalls.introduceArrayAttempts();
		mockBalls.introduceSolutionWhite();

		boolean checkBalls = whiteBalls.checkWhiteBalls(mockBalls.getArrayAttempts(), mockBalls.getArraySolution(), 0);
		assertTrue(checkBalls);
		
		mockBalls.introduceSolutionFalse();

		boolean checkBalls1 = whiteBalls.checkWhiteBalls(mockBalls.getArrayAttempts(), mockBalls.getArraySolution(), 0); 
		
		assertFalse(checkBalls1);
	}
	
	/**
	 * @testCheckBlackBalls	
	 * Crida l'objecte Balls per comprovar el metode checkBlackBalls(arrayAttempts, arraySolution, 0)
	 * Amb un mockObject fa la creacio d'uns arrays que es pasaran per parametre i comprovaran si els resultats son iguals que la solucio de Balls
	 * Hi ha dos comprovacions per afirmar que funciona tot correctament, una que conte boles negres i dona true i una altre que no conte cap i dona false
	 */
	@Test public void testCheckBlackBalls() {
		Balls blackBalls = new Balls();
		MockBalls mockBalls = new MockBalls();
		
		mockBalls.introduceArrayAttempts();
		mockBalls.introduceSolutionBlack();

		boolean checkBalls = blackBalls.checkBlackBalls(mockBalls.getArrayAttempts(), mockBalls.getArraySolution(), 0);
		assertTrue(checkBalls);
		
		mockBalls.introduceSolutionFalse();

		boolean checkBalls1 = blackBalls.checkWhiteBalls(mockBalls.getArrayAttempts(), mockBalls.getArraySolution(), 0);
		
		assertFalse(checkBalls1);
	}
	
	/**
	 * @testGetBlackBalls 
	 * Comprova que el getBlackBalls() de l'objecte Balls funciona correctament i no hi ha errors
	 * Es crea un objecte per defecte sense cap opcio amb les boles negres per defecte i retorna true ja que no s'ha modificat
	 * Mes tard s'asigna a 4 el numero de boles negres i es comprova que retorna false ja que s'ha modificat en el test i no a l'objecte
	 */
	@Test public void testGetBlackBalls() {
		Balls blackBalls = new Balls();
		int balls = 0;
		
		assertEquals(balls, blackBalls.getBlackBalls());
		
		balls = 4;
		assertNotEquals(balls, blackBalls.getBlackBalls());
		
	}
	
	/**
	 * @testGetWhiteBalls 
	 * Comprova que el getWhiteBalls() de l'objecte Balls funciona correctament i no hi ha errors
	 * Es crea un objecte per defecte sense cap opcio amb les boles blanques per defecte i retorna true ja que no s'ha modificat
	 * Mes tard s'asigna a 4 el numero de boles blanques i es comprova que retorna false ja que s'ha modificat en el test i no a l'objecte
	 */
	@Test public void testGetWhiteBalls() {
		Balls whiteBalls = new Balls();
		int balls = 0;
		
		assertEquals(balls, whiteBalls.getWhiteBalls());
		
		balls = 4;
		assertNotEquals(balls, whiteBalls.getWhiteBalls());
		
	}
	
}

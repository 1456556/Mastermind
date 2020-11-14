package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import controllers.Play;

/**
 * @author 		Pol & Angel
 * @name 		PlayTest.java
 * @origin		Play.java 
 * @description	Mock: fa el test de l'objecte Play, juntament arranca automaticament tos els test del nostre programa, d'aquesta manera ens asegurem que no hi ha cap test erroni
 * @test		testMain() 
 */
public class PlayTest {
	
	/**
	 * @testMain
	 * Crea un mockPlay per a cridar a l'array d'opcions i l'array de values. D'aquesta forma s'executara el programa tants cops com sigui de gran l'array d'opcions
	 * Es fa despres tot els test de les clases de test per a comprovar el seu correcte funcionament automaticament i sense necesitat de executar-los un a un
	 */
	@Test public void testMain() {
		MockPlay mockPlay = new MockPlay();
		
		mockPlay.introduceOptions();
		mockPlay.introduceValues(); 
		
		String options[] = mockPlay.getOptions();
		String values[] = mockPlay.getValues();
		
		for(int index = 0; index < options.length; index++) { 
			Play play = new Play();
			play.testMain(options[index], values); 
		}
		
		
		GameTest gameTest = new GameTest();
		gameTest.testSolution();
		gameTest.testCheckNumber(); 
		gameTest.testIntroduceArrayAttempts();
		gameTest.testIntroduceBalls();
		gameTest.testGetArraySolution();
		gameTest.testGetArrayAttempts();
		gameTest.testGetAttempt();
		gameTest.testSetAttempt();
		
		BallsTest ballstest = new BallsTest();
		ballstest.testCheckWhiteBalls();
		ballstest.testCheckBlackBalls();
		ballstest.testGetBlackBalls();
		ballstest.testGetWhiteBalls();
	}
	
}

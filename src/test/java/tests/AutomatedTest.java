package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import controllers.Play;
import models.Game;

/**
 * @author 		Victor
 * @name 		automatedTest.java
 * @origin		Play.java 
 * @description	Mock: fa el test de l'objecte Play, juntament arranca automaticament tos els test del nostre programa, d'aquesta manera ens asegurem que no hi ha cap test erroni
 * @test		testMain() 
 */
public class AutomatedTest {
	
	/**
	 * @testMain
	 * Crea un mockAutomated per a cridar a l'array d'opcions i l'array de values. D'aquesta forma s'executara el programa tants cops com sigui de gran l'array d'opcions
	 * Es fa despres tot els test de les clases de test per a comprovar el seu correcte funcionament automaticament i sense necesitat de executar-los un a un
	 */
	@Test public void testMain() {
		MockAutomated mockAutomated = new MockAutomated();		
		
		mockAutomated.introduceOptions();			 
		
		String options[] = mockAutomated.getOptions();
		String values[] = null;
		
		for(int index = 0; index < options.length; index++) { 
			Play play = new Play();
			
			switch(index)
			{			
			   case 0:
				  mockAutomated.introduceValues();
				  values = mockAutomated.getValues();
			      break;			   
			   case 1 :
				  mockAutomated.introduceValues();
				  values = mockAutomated.getValues();
			      break; 
			   case 2:
				  mockAutomated.introduceCorrectIncorrectValues();
				  values = mockAutomated.getValues();
				  break;				   
			   case 3:
				   mockAutomated.introduceSameValues();
				  values = mockAutomated.getValues();
				  break; 
			   case 4:
				  mockAutomated.introduceSameValue();
				  values = mockAutomated.getValues();
				  break;					   
			   	  
			}
			
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

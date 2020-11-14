package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import controllers.Play;

public class PlayTest {
	
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

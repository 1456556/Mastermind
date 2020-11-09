package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import models.Balls;

import static org.junit.Assert.*;

public class BallsTest {
	

	@Test public void testCheckWhiteBalls() {
		Balls whiteBalls = new Balls("whiteBall");
		
		String arrayAttempts[][] = new String[10][6];
		arrayAttempts[1][0] = "1";
		arrayAttempts[1][1] = "7";
		arrayAttempts[1][2] = "9";
		arrayAttempts[1][3] = "9";
		
		int[] arraySolution = new int[4];
		arraySolution[0] = 1;
		arraySolution[1] = 6;
		arraySolution[2] = 2;
		arraySolution[3] = 9;

		boolean checkBalls = whiteBalls.checkWhiteBalls(arrayAttempts, arraySolution, 1);
		
		assertTrue(checkBalls);

	}
	
	@Test public void testCheckBlackBalls(int arrayAttempts[][], int arraySolution[], int index) {
		Balls blackBalls = new Balls("blackBall");
		
		for (int i = 0; i < arraySolution.length; i++){
			assertEquals(arrayAttempts[index][i], arraySolution[(i+1)%4]);
			assertEquals(arrayAttempts[index][i], arraySolution[(i+2)%4]);
			assertEquals(arrayAttempts[index][i], arraySolution[(i+3)%4]);
		}
	}
}

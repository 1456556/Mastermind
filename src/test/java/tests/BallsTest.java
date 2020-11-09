package tests;

import org.junit.Test;

import models.Balls;

import static org.junit.Assert.*;

public class BallsTest {
	
	@Test public void testCheckWhiteBalls() {
		Balls whiteBalls = new Balls("whiteBall");
		
		String arrayAttempts[][] = new String[10][6];
		arrayAttempts[1][0] = "1";
		arrayAttempts[1][1] = "2";
		arrayAttempts[1][2] = "3";
		arrayAttempts[1][3] = "4";
		
		int[] arraySolution = new int[4];
		arraySolution[0] = 1;
		arraySolution[1] = 2;
		arraySolution[2] = 3;
		arraySolution[3] = 4;

		boolean checkBalls = whiteBalls.checkWhiteBalls(arrayAttempts, arraySolution, 1);
		assertTrue(checkBalls);
		
		int[] arraySolution1 = new int[4];
		arraySolution1[0] = 5;
		arraySolution1[1] = 6;
		arraySolution1[2] = 7;
		arraySolution1[3] = 8;

		boolean checkBalls1 = whiteBalls.checkWhiteBalls(arrayAttempts, arraySolution1, 1);
		
		assertFalse(checkBalls1);
	}
	
	@Test public void testCheckBlackBalls() {
		
	}
}

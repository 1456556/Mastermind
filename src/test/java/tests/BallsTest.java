package tests;

import org.junit.Test;

import models.Balls;

import static org.junit.Assert.*;

public class BallsTest {
	
	@Test public void testCheckWhiteBalls() {
		Balls whiteBalls = new Balls();
		
		String arrayAttempts[][] = new String[10][6]; 
		arrayAttempts[0][0] = "1";
		arrayAttempts[0][1] = "2";
		arrayAttempts[0][2] = "3";
		arrayAttempts[0][3] = "4";
		
		int[] arraySolution = new int[4];
		arraySolution[0] = 1;
		arraySolution[1] = 2;
		arraySolution[2] = 3;
		arraySolution[3] = 4;

		boolean checkBalls = whiteBalls.checkWhiteBalls(arrayAttempts, arraySolution, 0);
		assertTrue(checkBalls);
		
		int[] arraySolution1 = new int[4];
		arraySolution1[0] = 5;
		arraySolution1[1] = 6;
		arraySolution1[2] = 7;
		arraySolution1[3] = 8;

		boolean checkBalls1 = whiteBalls.checkWhiteBalls(arrayAttempts, arraySolution1, 0);
		
		assertFalse(checkBalls1);
	}
	
	@Test public void testCheckBlackBalls() {
		Balls blackBalls = new Balls();
		
		String arrayAttempts[][] = new String[10][6];
		arrayAttempts[0][0] = "1";
		arrayAttempts[0][1] = "2";
		arrayAttempts[0][2] = "3";
		arrayAttempts[0][3] = "4";
		
		int[] arraySolution = new int[4];
		arraySolution[0] = 4;
		arraySolution[1] = 3;
		arraySolution[2] = 2;
		arraySolution[3] = 1;

		boolean checkBalls = blackBalls.checkBlackBalls(arrayAttempts, arraySolution, 0);
		assertTrue(checkBalls);
		
		int[] arraySolution1 = new int[4];
		arraySolution1[0] = 5;
		arraySolution1[1] = 6;
		arraySolution1[2] = 7;
		arraySolution1[3] = 8;

		boolean checkBalls1 = blackBalls.checkWhiteBalls(arrayAttempts, arraySolution1, 0);
		
		assertFalse(checkBalls1);
	}
	
	@Test public void testGetBlackBalls() {
		Balls blackBalls = new Balls();
		int balls = 0;
		
		assertEquals(balls, blackBalls.getBlackBalls());
		
		balls = 4;
		assertNotEquals(balls, blackBalls.getBlackBalls());
		
	}
	
	@Test public void testGetWhiteBalls() {
		Balls whiteBalls = new Balls();
		int balls = 0;
		
		assertEquals(balls, whiteBalls.getWhiteBalls());
		
		balls = 4;
		assertNotEquals(balls, whiteBalls.getWhiteBalls());
		
	}
	
}

package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import models.Balls;
import static org.junit.Assert.*;

public class BallsTest {
	

	@Test public void testCheckWhiteBalls(int arrayAttempts[][], int arraySolution[], int index) {
		Balls whiteBalls = new Balls("white");
		
		//Aquí necesitaríamos un getArrayAttemps, getArraySolution y getIndex en la clase Balls
		//y borrar los parámetros de entrada?
		for (int i = 0; i < arraySolution.length; i++)
			assertEquals(arrayAttempts[index][i], arraySolution[i]);
		
	}
	
	@Test public void testCheckBlackBalls(int arrayAttempts[][], int arraySolution[], int index) {
		Balls blackBalls = new Balls("black");
		
		//Aquí necesitaríamos un getArrayAttemps, getArraySolution y getIndex en la clase Balls
		//y borrar los parámetros de entrada?
		for (int i = 0; i < arraySolution.length; i++){
			assertEquals(arrayAttempts[index][i], arraySolution[(i+1)%4]);
			assertEquals(arrayAttempts[index][i], arraySolution[(i+2)%4]);
			assertEquals(arrayAttempts[index][i], arraySolution[(i+3)%4]);
		}
	}
}

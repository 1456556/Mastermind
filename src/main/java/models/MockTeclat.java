package models;

import views.Teclat;

public class MockTeclat extends Teclat {
	//Introduirem una solució correcta
	public int[][] mockArraySolution1(int [][] arrayAttempts, int attempt) {
		arrayAttempts[attempt][0] = 0;
		arrayAttempts[attempt][1] = 1;
		arrayAttempts[attempt][2] = 2;
		arrayAttempts[attempt][3] = 3;
		
		return arrayAttempts;
	}
	
	//Introduirem una solució errònia
	public int[][] mockArraySolution2(int [][] arrayAttempts, int attempt) {
		arrayAttempts[attempt][0] = 0;
		arrayAttempts[attempt][1] = 9;
		arrayAttempts[attempt][2] = 10;
		arrayAttempts[attempt][3] = -1;
		
		return arrayAttempts;
	}
	
	

}

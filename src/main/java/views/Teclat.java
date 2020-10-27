package views;

import java.util.Scanner;

public class Teclat {
	private Scanner teclat = new Scanner(System.in);
	
	public int[][] setGuess(int arrayAttempts[][], int attempt) {
		System.out.println("Introdueix la teva primera suposoció:");
		arrayAttempts[attempt][0] = teclat.nextInt();
		System.out.println("Introdueix la teva segona suposoció:");
		arrayAttempts[attempt][1] = teclat.nextInt();
		System.out.println("Introdueix la teva tercera suposoció:");
		arrayAttempts[attempt][2] = teclat.nextInt();
		System.out.println("Introdueix la teva quarta suposoció:");
		arrayAttempts[attempt][3] = teclat.nextInt();
		
		return arrayAttempts;
		
	}
	
}

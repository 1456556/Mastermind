package views;

import java.util.Scanner;

public class Teclat {
	private Scanner teclat = new Scanner(System.in);
	
	public int[][] setGuess(int arrayAttempts[][], int attempt) {
		System.out.println("Introdueix la teva primera suposoci�:");
		arrayAttempts[attempt][0] = teclat.nextInt();
		System.out.println("Introdueix la teva segona suposoci�:");
		arrayAttempts[attempt][1] = teclat.nextInt();
		System.out.println("Introdueix la teva tercera suposoci�:");
		arrayAttempts[attempt][2] = teclat.nextInt();
		System.out.println("Introdueix la teva quarta suposoci�:");
		arrayAttempts[attempt][3] = teclat.nextInt();
		
		return arrayAttempts;
		
	}
	
}

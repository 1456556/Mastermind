package views;

import java.io.IOException;
import java.util.Scanner;

public class ShowScreen {
		
	public ShowScreen() {

	}
		
	public void Pantalla() {
		System.out.println("1. Iniciar el joc amb 10 intents");
		System.out.println("0. Sortir ");
		System.out.println("");
		System.out.print("Escull una opció: "); 
	}
	
	public void values() { 
		System.out.print("Introdueix la suposoció: ");
	}
	
	public void printResults(String arrayAttempts[][], int firstNumber, int secondNumber, int blackBalls, int whiteBalls) {
		System.out.print(arrayAttempts[firstNumber][secondNumber]);
		if(secondNumber == 3) {
			System.out.print("\t"+blackBalls);
			System.out.print("\t"+whiteBalls);
			System.out.print("");
		}
		
		
	}
	
	public void printBalls(int blackBalls, int whiteBalls) {
		
	}
	
	public void error() throws IOException {
		System.out.println("ERROR: escull una opcio valida");
		System.out.println("Apreta enter per continuar..");
		new java.util.Scanner(System.in).nextLine();
	}
	
	
	public void checkNumber() {
		System.out.println("ERROR: numero incorrecte");
		System.out.println(""); 
	}
	
	public void exit() {
		System.out.println("Sortiras del joc!");
		System.out.println("Apreta enter per continuar..");
		new java.util.Scanner(System.in).nextLine();
	}
	
	public void clear() {
		for (int i = 0; i < 100; i++) System.out.println();
	}
		
}
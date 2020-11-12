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
	
	public void introduceNumber() { 
		System.out.print("Valor: "); 
	}
	
	public void printResults(String arrayAttempts[][]) { 
		int count = 10;
		for(int firstNumber = 9; firstNumber >= 0; firstNumber--) {
			
			if(count == 10) {
				System.out.print(count+":  ");
			}else {
				System.out.print(" "+count+":  ");
			}
			count--;
			
			for(int secondNumber = 0; secondNumber < 4; secondNumber++) {
				if(arrayAttempts[firstNumber][secondNumber] != null) {
					System.out.print(arrayAttempts[firstNumber][secondNumber]);
					if(secondNumber == 3) { 
						System.out.print("\t N");
						System.out.print("\t B");
					}
				}					
			}
			System.out.println("");
		}	
	}
	
	public void win() {
		System.out.println("Has guanyat!");
		System.out.println("");
		System.out.println("Apreta enter per continuar..");
		new java.util.Scanner(System.in).nextLine();
	}
	
	public void lose() {
		System.out.println("Has perdut!");
		System.out.println("");
		System.out.println("Apreta enter per continuar..");
		new java.util.Scanner(System.in).nextLine();
	}

	public void error() throws IOException {
		System.out.println("ERROR: escull una opcio valida");
		System.out.println("Apreta enter per continuar..");
		new java.util.Scanner(System.in).nextLine();
	}
	
	
	public void checkNumber() {
		System.out.println("\t ERROR: numero incorrecte");
	}
	
	public void exit() {
		System.out.println("Sortiras del joc!");
		System.out.println("Apreta enter per continuar..");
		new java.util.Scanner(System.in).nextLine();
	}
	
	public void clear() {
		for (int i = 0; i < 200; i++) System.out.println();
	}
		
}
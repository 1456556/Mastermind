package views;

import java.io.IOException;
import java.util.Scanner;

public class ShowScreen {
		
	public ShowScreen() {

	}
	
	public void instructions() {
		System.out.println("**************************************************" );
		System.out.println("*                   MasterMind                   *" );
		System.out.println("*   Instruccions:                                *" );
		System.out.println("*                                                *" );
		System.out.println("* Jugar  -> apretar enter                        *" );
		System.out.println("* Sortir -> apretar 0 i despres enter            *" );
		System.out.println("**************************************************" );
	}
	
	public void printResults(String arrayAttempts[][]) { 
		System.out.println("\t        Boles \t Blanques  Negres" );
		int count = 10;
		for(int firstNumber = 9; firstNumber >= 0; firstNumber--) {
			
			if(count == 10) {
				System.out.print("    "+count+": ");
			}else {
				System.out.print("     "+count+": ");
			}
			count--;
			
			System.out.print("\t");
			for(int secondNumber = 0; secondNumber < 4; secondNumber++) {
				if(arrayAttempts[firstNumber][secondNumber] != null) {
					System.out.print(arrayAttempts[firstNumber][secondNumber]);
					if(secondNumber == 3) { 
						System.out.print("\t    "+arrayAttempts[firstNumber][4]); 
						System.out.print("\t     "+arrayAttempts[firstNumber][5]);
					}
				}					
			}
			System.out.println("");
		}	
	}
	
	public void introduceNumber() { 
		System.out.println("");
		System.out.print("Intent:  \t"); 
	}
	
	public void win() {
		System.out.println("");
		System.out.println("Has guanyat!");
		System.out.println("");
		System.out.println("Apretar enter per continuar..");
		new java.util.Scanner(System.in).nextLine();
	}
	
	public void lose() {
		System.out.println("");
		System.out.println("Has perdut!");
		System.out.println("");
		System.out.println("Apretar enter per continuar..");
		new java.util.Scanner(System.in).nextLine();
	}
	
	public void checkNumber(String value) {
		System.out.print("\t ERROR  "+value+" no és un intent vàlid.");
	}
	
	public void exit() {
		System.out.println("Sortiras del joc!");
		System.out.println("Apretar enter per continuar..");
		new java.util.Scanner(System.in).nextLine();
	}
	
	public void clear() {
		for (int i = 0; i < 200; i++) System.out.println();
	}
		
}
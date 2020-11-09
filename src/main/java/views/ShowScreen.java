  
package views;

import java.io.IOException;
import java.util.Scanner;

public class ShowScreen {
	private String option;
		
	public ShowScreen() {
		this.option = "0";
	}
		
	public void Pantalla() {
		System.out.println("1. Iniciar el joc amb 10 intents");
		System.out.println("2. Iniciar el joc amb 5 intents");
		System.out.println("0. Sortir ");
		System.out.println("");
		System.out.println("Escull una opció: ");
	}
	
	public void clear() {
		for (int i = 0; i < 100; i++) System.out.println();
	}
	
	public void exit() {
		System.out.println("Sortiras del joc!");
		System.out.println("Prem enter per continuar..");
		new java.util.Scanner(System.in).nextLine();
	}
	
	public void error() throws IOException {
		System.out.println("ERROR: escull una opcio valida");
		System.out.println("Prem enter per continuar..");
		new java.util.Scanner(System.in).nextLine();
	}
	
	public void values() {
		System.out.println("Introdueix la suposoció: ");
	}
	
	public void checkNumber() {
		System.out.println("ERROR: numero incorrecte");
		System.out.println(""); 
	}
	
	

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}
		
		
}
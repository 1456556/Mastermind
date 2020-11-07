package controllers;

import java.io.IOException;
import java.util.Scanner;

import models.Initialize;
import views.ShowScreen;

public class Game {
	
	public static void main(String[] args) throws IOException {
		ShowScreen showScreen = new ShowScreen();
		Scanner reader = new Scanner(System.in);
		String value;
		
		
		do {
			showScreen.Pantalla();
			String selection = reader.nextLine();
			showScreen.setOption(selection);
			switch(showScreen.getOption()) {
				case "1":
					Initialize game10Attemps = new Initialize(10);
											
					do {
						showScreen.values();
						value = reader.nextLine();
						if(game10Attemps.checkNumber(value) == false) {showScreen.checkNumber();};
						
					}while(game10Attemps.checkNumber(value) == false);
					
					// primero: crear check if numbers equals (para que no ponga todo 0)
					// llamar introduceArrayAttemps para poner los valores separados por string[1][2][3][4] (ejemplo: "hola" "h" "o" ..
					
					break;
				case "2":
					Initialize game5Attemps = new Initialize(5);
					break;
				case "0":
					showScreen.clear();
					showScreen.exit();
					break;
				default:
					showScreen.clear();
					showScreen.error();
					break;
				
			}
			showScreen.clear();
		} while(!"0".equals(showScreen.getOption()));
		System.exit(0);
	}
}

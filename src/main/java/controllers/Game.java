package controllers;

import java.io.IOException;
import java.util.Scanner;

import models.Balls;
import models.Initialize;
import views.ShowScreen;

public class Game {
	
	// BORRAR GET Y SETS INUTILES
	
	public static void main(String[] args) throws IOException {
		ShowScreen showScreen = new ShowScreen();
		Scanner reader = new Scanner(System.in); 
		Balls balls = new Balls();
		
		String value;
		String selection;
			
		
		do {
			boolean finish = false;
			showScreen.Pantalla();
			selection = reader.nextLine();
			switch(selection) { 
				case "1":
					Initialize game = new Initialize(10);
					game.solution();
					
					// mover a una funcion
					while(finish != true) {
						
						// mover a una funcion
						do {
							showScreen.values();
							value = reader.nextLine();
							if(game.checkNumber(value) == false) {showScreen.checkNumber();};
							
						}while(game.checkNumber(value) == false);
						
						// mover a una funcion
						game.introduceArrayAttempts(value);
						
						balls.checkWhiteBalls(game.getArrayAttempts(), game.getArraySolution(), game.getAttempt());
						balls.checkBlackBalls(game.getArrayAttempts(), game.getArraySolution(), game.getAttempt());	
						
						game.setAttempt(game.getAttempt()+1); 
						
						
						// mover a una funcion 
						for(int firstNumber = 0; firstNumber < 10; firstNumber++) {
							for(int secondNumber = 0; secondNumber < 4; secondNumber++) {  
								if(game.getArrayAttempts()[firstNumber][secondNumber] != null) {
									
									showScreen.printResults(game.getArrayAttempts(),firstNumber, secondNumber, balls.getBlackBalls(), balls.getWhiteBalls());
									
									if(secondNumber == 3) { 
										System.out.println("");
									}
								}
							}
						}

							 
						if((balls.getWhiteBalls() == 4 || game.getAttempt() == 10)) {
							finish = true; 
						}
					}

					
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
		} while(!"0".equals(selection));
		System.exit(0);
	}
}

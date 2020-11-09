package controllers;

import java.io.IOException;
import java.util.Scanner;

import models.Balls;
import models.Initialize;
import views.ShowScreen;

public class Game {
	
	public static void main(String[] args) throws IOException {
		ShowScreen showScreen = new ShowScreen();
		Scanner reader = new Scanner(System.in);
		Balls whiteBall = new Balls("Blanca");
		Balls blackBall = new Balls("Negra");
		
		String value;
			
		
		do {
			boolean finish = false;
			showScreen.Pantalla();
			String selection = reader.nextLine();
			showScreen.setOption(selection);
			switch(showScreen.getOption()) {
				case "1":
					Initialize game = new Initialize(10);
					game.solution();
					
					while(finish != true) {
						do {
							showScreen.values();
							value = reader.nextLine();
							if(game.checkNumber(value) == false) {showScreen.checkNumber();};
							
						}while(game.checkNumber(value) == false);
						
						System.out.println(game.getAttempt());
						if((whiteBall.getNumberBalls() == 4 || game.getAttempt() == 10)) {
							finish = true;
						}else {
							game.introduceArrayAttempts(value);
							if(whiteBall.checkWhiteBalls(game.getArrayAttempts(), game.getArraySolution(), game.getAttempt())) {
								// llamar a showscreen para decir: cuantas volas hay
							}else {
								// llamas a showscreen para decir: no hay bolas blancas
							}
							
							game.setAttempt(game.getAttempt()+1); 
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
		} while(!"0".equals(showScreen.getOption()));
		System.exit(0);
	}
}

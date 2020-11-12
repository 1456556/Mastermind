package controllers;

import java.util.Scanner;

import models.Balls;
import models.Game;
import views.ShowScreen;

public class Play {
		
	public static void main(String[] args) {
				
		ShowScreen showScreen = new ShowScreen(); 
		Scanner reader = new Scanner(System.in);

		String option;

		do {
			showScreen.clear();
			showScreen.instructions();
			option = reader.nextLine();
			
			if("0".equals(option)) {
				System.exit(0);
			}
			
			Balls balls = new Balls();
			
			String value;
			boolean finish = false;
			
			Game game = new Game(10);
			game.solution();
			
			do {
				showScreen.clear();
				showScreen.printResults(game.getArrayAttempts());

				do {
					showScreen.introduceNumber();
					value = reader.nextLine();
					if(game.checkNumber(value) == false) {showScreen.checkNumber(value);};
					
				}while(game.checkNumber(value) == false);
				
				game.introduceArrayAttempts(value);
				
				balls.checkWhiteBalls(game.getArrayAttempts(), game.getArraySolution(), game.getAttempt());
				balls.checkBlackBalls(game.getArrayAttempts(), game.getArraySolution(), game.getAttempt());	
				
				game.introduceBalls(balls.getWhiteBalls(), balls.getBlackBalls());
				
				game.setAttempt(game.getAttempt()+1); 

				if((balls.getWhiteBalls() == 4 || game.getAttempt() == 10)) { 
					finish = true; 
				}
				
			}while(finish != true);
			
			showScreen.clear();
			showScreen.printResults(game.getArrayAttempts());

			if(balls.getWhiteBalls() == 4) {
				showScreen.win();		
			}else {
				showScreen.lose();
			}
			
		}while(option != "0");

	}
}

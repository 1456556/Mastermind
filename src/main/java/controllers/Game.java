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
		Balls balls = new Balls();
		
		String value;
		boolean finish = false;
		
		Initialize game = new Initialize(10);
		game.solution();
		
		do {
			showScreen.clear();
			showScreen.printResults(game.getArrayAttempts());

			do {
				showScreen.introduceNumber();
				value = reader.nextLine();
				if(game.checkNumber(value) == false) {showScreen.checkNumber();};
				
			}while(game.checkNumber(value) == false);
			
			game.introduceArrayAttempts(value);
			
			balls.checkWhiteBalls(game.getArrayAttempts(), game.getArraySolution(), game.getAttempt());
			balls.checkBlackBalls(game.getArrayAttempts(), game.getArraySolution(), game.getAttempt());	
			
			game.setAttempt(game.getAttempt()+1); 

			if((balls.getWhiteBalls() == 4 || game.getAttempt() == 10)) {
				finish = true; 
			}
			
		}while(finish != true);
		
		showScreen.clear();
		showScreen.printResults(game.getArrayAttempts());

		if(game.getAttempt() == 10 && balls.getWhiteBalls() != 4) {
			showScreen.lose();
		}
		
		if(balls.getWhiteBalls() == 4) {
			showScreen.win();
		}
		
		
		System.exit(0);
	}
}

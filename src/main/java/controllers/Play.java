package controllers;

import java.util.Scanner;

import models.Balls;
import models.Game;
import views.ShowScreen;

public class Play {
	private ShowScreen showScreen;
	private Scanner reader;
	private Balls balls;
	private Game game;
	private String option;
	private String value;
	private boolean finish;
	
	
	public Play() {
		this.showScreen = new ShowScreen();
		this.reader = new Scanner(System.in);
		this.balls = new Balls();
		this.game = new Game(10);
		this.option = "";
		this.value = "";
		this.finish = false; 
	}
	
	public void testMain(String selectedOption, String[] values) {
		int valuesIntent = 0;
		
		showScreen.clear(); 
		showScreen.instructions();
		
		if(selectedOption.equals("0")) {
			showScreen.exit();
		}else {
			game.solution();
			
			if(selectedOption.equals("2")) {
				int arraySolution[] = game.getArraySolution();
				String solution = "";
				for(int index = 0; index < arraySolution.length; index++) {
					solution = solution + arraySolution[index];
				}
				
				values[0] = solution;
			}
			
			do {
				
				showScreen.clear();
				showScreen.printResults(game.getArrayAttempts());
				
				
				do {
					showScreen.introduceNumber();
					
					value = values[valuesIntent];
					
					if(game.checkNumber(value) == false) {
						showScreen.checkNumber(value);
						valuesIntent++;
					}
					
				}while(game.checkNumber(value) == false);
				
				game.introduceArrayAttempts(value);
				
				balls.checkWhiteBalls(game.getArrayAttempts(), game.getArraySolution(), game.getAttempt());
				balls.checkBlackBalls(game.getArrayAttempts(), game.getArraySolution(), game.getAttempt());	
				
				game.introduceBalls(balls.getWhiteBalls(), balls.getBlackBalls());
				
				game.setAttempt(game.getAttempt()+1);
				
				if((balls.getWhiteBalls() == 4 || game.getAttempt() == 10)) {
					finish = true; 
				}
				
				valuesIntent++;
			}while(finish != true);
			
			showScreen.clear();
			showScreen.printResults(game.getArrayAttempts());

			
			if(balls.getWhiteBalls() == 4) {
				showScreen.win(2);
			}else {
				showScreen.lose(2);
			}
		}		
	}
	
	/*
	public static void main(String[] args) {
		ShowScreen showScreen = new ShowScreen();
		Scanner reader = new Scanner(System.in);
		
		String option;
		
		do { 
			
			showScreen.clear(); 
			showScreen.instructions();
			option = reader.nextLine();
			
			if("0".equals(option)) {
				showScreen.exit();
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
					
					if(game.checkNumber(value) == false) {
						showScreen.checkNumber(value);
					}
					
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
				showScreen.win(1);
				new java.util.Scanner(System.in).nextLine();
			}else {
				showScreen.lose(1);
				new java.util.Scanner(System.in).nextLine();
			}
			
		}while(option != "0");

	}
	*/
}

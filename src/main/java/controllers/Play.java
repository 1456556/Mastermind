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
				showScreen.win(1);		
			}else {
				showScreen.lose(1);
			}
			
		}while(option != "0");

	}
	
	
	public void testMain(String selectedOption, String[] values) {
		do {
			
			showScreen.clear(); 
			showScreen.instructions();
			
			if(selectedOption.equals("0")) {
				System.out.print(selectedOption); //borrar 
				System.exit(0);
			}
						
			game.solution();
			
			do {
				
				showScreen.clear();
				showScreen.printResults(game.getArrayAttempts());
				
				for(int index = 0; index < values.length; index++) {
					
					do {
						showScreen.introduceNumber();
						if(game.checkNumber(values[index]) == false) {showScreen.checkNumber(values[index]);};
						
					}while(game.checkNumber(values[index]) == false);
					
					game.introduceArrayAttempts(values[index]);				
					
				
				
				balls.checkWhiteBalls(game.getArrayAttempts(), game.getArraySolution(), game.getAttempt());
				balls.checkBlackBalls(game.getArrayAttempts(), game.getArraySolution(), game.getAttempt());	
				
				game.introduceBalls(balls.getWhiteBalls(), balls.getBlackBalls());
				
				game.setAttempt(game.getAttempt()+1); 

				if((balls.getWhiteBalls() == 4 || game.getAttempt() == 10)) { 
					finish = true; 
				}
				}
			}while(finish != true);
			
			showScreen.clear();
			showScreen.printResults(game.getArrayAttempts());

			if(balls.getWhiteBalls() == 4) {
				showScreen.win(2);		
			}else {
				showScreen.lose(2);
			}
			
		}while(selectedOption != "0");
	}
	
	

	public ShowScreen getShowScreen() {
		return showScreen;
	}

	public void setShowScreen(ShowScreen showScreen) {
		this.showScreen = showScreen;
	}

	public Scanner getReader() {
		return reader;
	}

	public void setReader(Scanner reader) {
		this.reader = reader;
	}

	public Balls getBalls() {
		return balls;
	}

	public void setBalls(Balls balls) {
		this.balls = balls;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}
	
	
	
	
}

package controllers;

import java.util.Scanner;
import models.Balls;
import models.Game;
import views.ShowScreen;


/**
 * @author 		Pol & Angel
 * @name 		Play.java
 * @origin		-
 * @description Classe principal de la nostre aplicacio, permet executar un main per a jugar
 * @user 		Executar el codi per jugar amb la pantalla i la interaccio del usuari, aquesta part no fa test. Unicament es per jugar, Play: deixar tot com esta!
 * 				Opcions per jugar:
 * 					(1) Comprobar que el metode 'public static void main(String[] args)' no esta comentat
 * 					(2) Fer play a Play.java		
 * @test 		PlayTest.java
 * 				Executa el codi automaticament amb la maquina, estan creats els valors amb mockObjects (100,0% en verd)
 * 				Opcions per fer el test:
 * 					(1) Comprobar que el metode 'public void testMain(String selectedOption, String[] values)' no esta comentat
 * 					(2) Comentar el metode 'public static void main(String[] args)'
 * 					(3) Fer play a TestPlay.java (coverage): ho executara tot automaticament amb mocks i els resultats del test
 * 					(4) Si intentes executar el programa sense comentar el main, no fara el test d'aquest i per tant sortira vermell al coverage (91,0% en verd)
 * 					(5) Si intentes executar el test desde Play.java no fara el test i tampoc executara el joc, ja que el main de l'aplicacio esta comentat i no el trobara (Error: no se ha encontrado el método principal en la clase controllers.Play)
 */
public class Play {
	private ShowScreen showScreen;
	private Scanner reader;
	private Balls balls;
	private Game game;
	private String option;
	private String value;
	private boolean finish;
	
	/**
	 * @constructor Creació del objecte Play amb els seus atributs
	 * @showScreen 	Vista: conte tot el que es mostra per pantalla
	 * @balls		Model: creació de les boles (blanques i negres)
	 * @game		Model: motor del programa, conte tots els metodes pel funcionament del joc
	 * @reader 		Objecte encarregat de llegir per teclat les opcions del usuari
	 * @option		String: demana una opcio al usuari sobre si vol jugar o sortir del programa
	 * @value 		String: opcio que introdueix l'usuari a cada intent, exemple: 1357 - 7913 - etc.
	 * @finish		Boolean: indica que el jugador a finalitzat una partida, tant si ha guanyat o ha perdut
	 */
	public Play() { 
		this.showScreen = new ShowScreen();
		this.reader = new Scanner(System.in);
		this.balls = new Balls();
		this.game = new Game(10);
		this.option = "";
		this.value = "";
		this.finish = false; 
	}
	
	/**
	 * @main 		Execucio del programa per jugar amb l'usuari, permet una interaccio 100% real amb numeros no fixats
	 * @param args 	Es l'opcio per defecte del main a l'hora d'executar un programa
	 */
	
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
				}else {
					finish = false; 
				}
				
			}while(finish != true);
			
			showScreen.clear();
			showScreen.printResults(game.getArrayAttempts());

			if(balls.getWhiteBalls() == 4) {
				showScreen.win();
				new java.util.Scanner(System.in).nextLine();
			}else {
				showScreen.lose(game.getArraySolution());
				new java.util.Scanner(System.in).nextLine();
			}
			
		}while(option != "0");

	}
	
	
	/**
	 * @testMain				Execucio del programa per fer tot el testing, no conte cap tipus d'interaccio funciona amb numeros fixats
	 * @param selectedOption 	Opcio per saber si volem jugar o sortir de programa
	 * @param values			Array: conte els valors 1357-7913-etc. que introdueix la maquina en comptes de l'usuari, es fa amb un mockObject
	 */
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
				}else {
					finish = false; 
				}
				
				valuesIntent++;
				
			}while(finish != true);
			
			showScreen.clear();
			showScreen.printResults(game.getArrayAttempts());
			
			if(balls.getWhiteBalls() == 4) {
				showScreen.win();
			}else {
				showScreen.lose(game.getArraySolution());
			}
		}		
	}
}

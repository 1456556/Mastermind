package views;

/**
 * @author 		Pol & Angel
 * @name 		ShowScreen.java
 * @origin		Play.java 
 * @description	Vista: tot el que es mostra per pantalla al programa esta en aquesta vista. No es necesari fer un test d'aquesta
 * @test		-
 */
public class ShowScreen {
		
	/**
	 * @constuctor
	 * Creació del objecte showScreen, esta per defecte ja que no es necessari fer res
	 */
	public ShowScreen() { 

	}
	
	/**
	 * @instructions 
	 * Mostrara per pantalla totes les instruccions del joc
	 */
	public void instructions() {
		System.out.println("*************************************************************************************" );
		System.out.println("*                                    MasterMind                                     *" );
		System.out.println("*                                                                                   *" );
		System.out.println("*         Avidina la seqüencia de números per guanyar, tens deu intents             *" );
		System.out.println("*                   Cada intent té quatre numeros consecutius                       *" );
		System.out.println("*                                                                                   *" );
		System.out.println("*                                                                                   *" );
		System.out.println("*   Blanques: indiquen que hi ha X boles correctes a una posició correcte           *" );
		System.out.println("*   Negres  : indiquen que hi ha X boles correctes a una posició incorrecte         *" );
		System.out.println("*                                                                                   *" );
		System.out.println("*   Per Jugar  -> apretar enter                                                     *" );
		System.out.println("*   Per Sortir -> apretar 0 i despres enter                                         *" );
		System.out.println("*                                                                                   *" );
		System.out.println("*************************************************************************************" );
	}
	
	/**
	 * @printResults		Mostrara per pantalla els resultats actuals amb el intent introduit i les boles blanques i negres
	 * @param arrayAttempts	Array: pasa per parametre l'array d'intents arrayAttempts
	 */
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
	
	/**
	 * @introduceNumber	
	 * Mostra per pantalla un espai per introduir el numero del intent actual
	 */
	public void introduceNumber() { 
		System.out.println("");
		System.out.print("Intent:  \t"); 
	}
	
	/**
	 * @win	
	 * Mostra per pantalla que el jugador a guanyat la partida
	 */
	public void win() {
		System.out.println("");
		System.out.println("Has guanyat!");
		System.out.println("");
		System.out.println("Apretar enter per continuar..");
	}
	
	/**
	 * @lose 
	 * Mostra per pantalla que el jugador a perdut la partida
	 */
	public void lose(int arraySolution[]) {
		System.out.println("");
		System.out.print("Has perdut, la solució era: ");
		for(int index = 0; index < arraySolution.length; index++) {
			System.out.print(arraySolution[index]);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Apretar enter per continuar..");
	}
	
	/**
	 * @checkNumber	Mostra per pantalla que l'intent que ha introduit l'usuari es erroni i no funcionara
	 * @param value	String: intent erroni introduit per l'usuari
	 */
	public void checkNumber(String value) {
		System.out.print("\t ERROR  "+value+" no és un intent vàlid.");
	}
	
	/**
	 * @exit 
	 * Mostra per pantalla que es sortira del joc
	 */
	public void exit() {
		System.out.println("Sortiras del joc!");
	}
	
	/**
	 * @clear 
	 * Fa una neteja de la pantalla, ja que el joc es per consola afegeix unes 200 lines de println i buida tot l'anterior
	 */
	public void clear() {
		for (int i = 0; i < 200; i++) System.out.println();
	}		
}
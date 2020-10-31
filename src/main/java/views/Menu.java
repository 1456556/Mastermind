  
package views;

import java.util.Scanner;

public class Menu {
	private int option;
		
		public Menu() {
			this.option = 0;
		}
		
		public void Pantalla() {
			System.out.println("1. Iniciar el joc amb 10 intents");
			System.out.println("2. Iniciar el joc amb 5 intents");
			System.out.println("0. Sortir ");
			System.out.println("");
			System.out.println("Escull una opció: ");
			
			Scanner reader = new Scanner(System.in);
			int selection = reader.nextInt();
			
			this.option = selection;
		}

		public int getOption() {
			return option;
		}

		public void setOption(int option) {
			this.option = option;
		}
		
		
}
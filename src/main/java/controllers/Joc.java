package controllers;

import java.io.IOException;
import java.util.Scanner;

import models.Initialize;
import views.Menu;

public class Joc {
	
	public static void main(String[] args) throws IOException {
		Menu menu = new Menu();
		do {
			menu.Pantalla();
			Scanner reader = new Scanner(System.in);
			String selection = reader.nextLine();
			menu.setOption(selection);
			switch(menu.getOption()) {
				case "1":
					Initialize option1 = new Initialize(10);
					break;
				case "2":
					Initialize option2 = new Initialize(5);
					break;
				case "0":
					menu.clear();
					menu.exit();
					break;
				default:
					menu.clear();
					menu.error();
					break;
				
			}
			menu.clear();
			
		} while(menu.getOption() != "0");
		System.exit(0);
	}
}

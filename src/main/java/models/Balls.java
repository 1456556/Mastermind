package models;

import java.util.Scanner;

public class Balls {
	private String color;
	private int numberBalls;
	
	public Balls(String color) {
		this.color = color;
		this.numberBalls = 0;  
	}
	
	public boolean checkWhiteBalls(String arrayAttempts[][], int arraySolution[], int attempt) {
		boolean checkIt = false;
		String stringArray[] = new String[arraySolution.length];
		
		for (int index = 0; index < arraySolution.length; index++) {
			stringArray[index] = String.valueOf(arraySolution[index]);
			if(arrayAttempts[attempt][index].equals(stringArray[index])) {
				this.numberBalls++;
				checkIt = true; 
			}
		}
		
		return checkIt;
	}
	
	public boolean checkBlackBalls(String arrayAttempts[][], int arraySolution[], int attempt) {
		return false;
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberBalls() {
		return numberBalls;
	}

	public void setNumberBalls(int numberBalls) {
		this.numberBalls = numberBalls;
	}
}

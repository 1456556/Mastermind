package models;

import java.util.Scanner;

public class Balls {
	private int blackBalls;
	private int whiteBalls;
	boolean checkIt;
	private String stringArray[];
	
	public Balls() {
		this.blackBalls = 0;  
		this.whiteBalls = 0;
		this.checkIt = false;
	}
	
	public boolean checkWhiteBalls(String arrayAttempts[][], int arraySolution[], int attempt) {
		whiteBalls=0;
		checkIt = false;
		stringArray = new String[arraySolution.length];
		
		for (int index = 0; index < arraySolution.length; index++) {
			stringArray[index] = String.valueOf(arraySolution[index]);
			if(arrayAttempts[attempt][index].equals(stringArray[index])) {
				this.whiteBalls++;
				checkIt = true; 
			}
		}
		
		return checkIt;
	}
	
	public boolean checkBlackBalls(String arrayAttempts[][], int arraySolution[], int attempt) {
		blackBalls=0;
		checkIt = false;
		stringArray = new String[arraySolution.length];
		
		for (int index = 0; index < arraySolution.length; index++) {
			for (int index1 = 1; index1 < arraySolution.length; index1++) {
				stringArray[index] = String.valueOf(arraySolution[(index+index1)%4]);
				if(arrayAttempts[attempt][index].equals(stringArray[index])) {
					this.blackBalls++;
					checkIt = true;  
				}
			}
		}
		
		return checkIt;
	}
	
	
	
	public int getBlackBalls() {
		return blackBalls;
	}

	public void setBlackBalls(int blackBalls) {
		this.blackBalls = blackBalls;
	}

	public int getWhiteBalls() {
		return whiteBalls;
	}

	public void setWhiteBalls(int whiteBalls) {
		this.whiteBalls = whiteBalls;
	}

	public boolean isCheckIt() {
		return checkIt;
	}

	public void setCheckIt(boolean checkIt) {
		this.checkIt = checkIt;
	}

	public String[] getStringArray() {
		return stringArray;
	}

	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
	}
	


}

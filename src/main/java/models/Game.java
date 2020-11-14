package models;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Game {
	private int arraySolution[];
	private String arrayAttempts[][]; 
	private int attempt;
	private Random randomCreator = new Random();
	
	public Game(int maxAttempt) { 
		this.arrayAttempts = new String[maxAttempt][6];   
		this.attempt = 0;
		this.arraySolution = new int[4];
	}
	
	public int[] solution() {
		Set<Integer> alreadyUsedNumbers = new HashSet<>();
		int total = 0;
		
		while (alreadyUsedNumbers.size() < 4) {
			 int randomNumber = randomCreator.nextInt(10);
			 if (!alreadyUsedNumbers.contains(randomNumber)){
				 arraySolution[total] = randomNumber;
				 alreadyUsedNumbers.add(randomNumber);
				 
				 total++;
			 }
		}

		return arraySolution; 
	}
		
	
	public boolean checkNumber(String value) {
        if(value.length() != 4) {
            return false; 
        }else {
            try {
                Integer.parseInt(value);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }
	
	public String[][] introduceArrayAttempts(String value) {
		char[] valueSeparate = value.toCharArray();

        for(int index = 0; index < 4; index++) {
            arrayAttempts[attempt][index] = Character.toString(valueSeparate[index]);
        }  
        return arrayAttempts;
	}
	
	public String[][] introduceBalls(int whiteBalls, int blackBalls) {
		String white = String.valueOf(whiteBalls);
		String black = String.valueOf(blackBalls);
		
		this.arrayAttempts[attempt][4] = white;
		this.arrayAttempts[attempt][5] = black; 
		
		return arrayAttempts;
	}
	

	public int[] getArraySolution() {
		return arraySolution;
	}

	public String[][] getArrayAttempts() {
		return arrayAttempts;
	}
	
	public int getAttempt() {
		return attempt;
	}

	public void setAttempt(int attempt) {
		this.attempt = attempt;
	}

}

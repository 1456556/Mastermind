package models;

import views.Teclat;

public class MockTeclat extends Teclat {
	
	private int option;
	private int attempt0, attempt1, attempt2, attempt3;
	
	public MockTeclat(int option, int attempt0, int attempt1, int attempt2, int attempt3){
		this.option = option;
		this.attempt0 = attempt0;
		this.attempt1 = attempt1;
		this.attempt2 = attempt2;
		this.attempt3 = attempt3;
	}
	
	
	//Introduirem una solució correcta
	public int[][] mockArraySolution(int arrayAttempts[][], int index) {
		arrayAttempts[index][0] = attempt0;
		arrayAttempts[index][1] = attempt1;
		arrayAttempts[index][2] = attempt2;
		arrayAttempts[index][3] = attempt3;
		
		return arrayAttempts;
	}


	public int getOption() {
		return option;
	}


	public void setOption(int option) {
		this.option = option;
	}


	public int getAttempt0() {
		return attempt0;
	}


	public void setAttempt0(int attempt0) {
		this.attempt0 = attempt0;
	}


	public int getAttempt1() {
		return attempt1;
	}


	public void setAttempt1(int attempt1) {
		this.attempt1 = attempt1;
	}


	public int getAttempt2() {
		return attempt2;
	}


	public void setAttempt2(int attempt2) {
		this.attempt2 = attempt2;
	}


	public int getAttempt3() {
		return attempt3;
	}


	public void setAttempt3(int attempt3) {
		this.attempt3 = attempt3;
	}
	
	
	
	
	

}

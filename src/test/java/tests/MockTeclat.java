package tests;

public class MockTeclat {
	
	private String option;//opcio menu
	private String selection;//jugada
	
	public MockTeclat(String option, String selection){
		this.option = option;
		this.selection = selection;
	}
	
	
	//Introduirem una solució correcta
	public int[][] mockArraySolution(int arrayAttempts[][], int index) {
		//Aqui haurem de separar el string i posar els valors al arrayAttempts
		
		return arrayAttempts;
	}


	public String getOption() {
		return option;
	}


	public void setOption(String option) {
		this.option = option;
	}


	public String getSelection() {
		return selection;
	}


	public void setSelection(String selection) {
		this.selection = selection;
	}


	
	
	
	

}

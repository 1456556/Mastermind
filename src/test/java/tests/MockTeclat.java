package tests;

public class MockTeclat {
	
	private String option;
	private String selection;
	
	public MockTeclat(String option, String selection){
		this.option = option;
		this.selection = selection;
	}
	
	
	public int[][] mockArraySolution(int arrayAttempts[][], int index) {
		
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

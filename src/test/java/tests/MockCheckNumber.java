package tests;

public class MockCheckNumber {
	private String arrayCorrectNumbers[];
	private String arrayFailNumbers[];
	
	public MockCheckNumber() {
		this.arrayCorrectNumbers = new String[3];
		this.arrayFailNumbers = new String[10]; 
	}
	
	public void introduceArrayCorrectNumbers() {
		this.arrayCorrectNumbers[0] = "1234";
		this.arrayCorrectNumbers[1] = "5678";
		this.arrayCorrectNumbers[2] = "9012";
		
	}
	
	public void introduceArrayFailNumbers() {
		this.arrayFailNumbers[0] = "123";
		this.arrayFailNumbers[1] = "12345";
		this.arrayFailNumbers[2] = "a123";
		this.arrayFailNumbers[3] = "123/";
		this.arrayFailNumbers[4] = "abcd";
		this.arrayFailNumbers[5] = "abc";
		this.arrayFailNumbers[6] = "abcde";
		this.arrayFailNumbers[7] = "abc*";
		this.arrayFailNumbers[8] = "+bcd";
		this.arrayFailNumbers[9] = "";
	}

	public String[] getArrayCorrectNumbers() {
		return arrayCorrectNumbers;
	}

	public String[] getArrayFailNumbers() {
		return arrayFailNumbers;
	}

}

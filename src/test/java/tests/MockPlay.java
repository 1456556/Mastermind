package tests;

public class MockPlay {
	private String options[];
	private String values[];
	
	public MockPlay() {
		this.options = new String[2];
		this.values = new String[10];
	}
	
	public void introduceOptions() {
		options[0] = "0";
		options[1] = "1";
	}
	
	public void introduceValues() {
		values[0] = "1234";
		values[1] = "5678";
		values[2] = "9012";
		values[3] = "3456";
		values[4] = "7890";
		values[5] = "0987";
		values[6] = "6543";
		values[7] = "2109";
		values[8] = "8765";
		values[9] = "4321";
	}
	

	public String[] getOptions() {
		return options;
	}

	public String[] getValues() {
		return values;
	}

	
	
	
	
	

}

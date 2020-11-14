package tests;

public class MockPlay {
	private String options[];
	private String values[];
	
	public MockPlay() {
		this.options = new String[3];
		this.values = new String[13];
	}
	
	public void introduceOptions() {
		options[0] = "1";
		options[1] = "2";
		options[2] = "0";
	}
	
	public void introduceValues() {
		values[0] = "";
		values[1] = "5678";
		values[2] = "9012";
		values[3] = "000a";
		values[4] = "00002";
		values[5] = "0000";
		values[6] = "7890";
		values[7] = "0987";
		values[8] = "6543";
		values[9] = "1234";
		values[10] = "8765";
		values[11] ="4321";
		values[12] ="9642";
	}
	

	public String[] getOptions() {
		return options;
	}

	public String[] getValues() {
		return values;
	}

	
	
	
	
	

}

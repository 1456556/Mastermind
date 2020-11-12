package tests;

import controllers.Play;

public class MockPlay {
	private String exit;
	private String arrayAttempts[][]; 
		
	public MockPlay(){
		Play play = new Play();
		String options[] = new String[2];
		options[0] = "mock";

		
		play.main(options);
	}

	
	
}

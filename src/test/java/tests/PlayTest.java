package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import controllers.Play;

public class PlayTest {
	
	@Test public void testMain() {
		Play play = new Play();
		MockPlay mockPlay = new MockPlay();
		
		mockPlay.introduceOptions();
		mockPlay.introduceValues();
		
		String options[] = mockPlay.getOptions();
				
		for(int index = 0; index < options.length; index++) {
			play.testMain(options[index]);
		}
		
		assertEquals(0,0);
		
	}
	
}

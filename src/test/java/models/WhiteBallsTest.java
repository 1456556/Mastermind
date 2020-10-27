package models;
import org.junit.Test;
import static org.junit.Assert.*;

public class WhiteBallsTest {
	
	@Test public void testCheckWhiteBalls(int [][] arrayAttempts, int [] arraySolution, int attempt) {
		for (int i = 0; i < arraySolution.length; i++)
			assertEquals(arrayAttempts[attempt][i], arraySolution[i]);
	}
}

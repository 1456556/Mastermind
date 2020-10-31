package tests;
import org.junit.Test;
import static org.junit.Assert.*;

public class BlackBallsTest {
	
	@Test public void testCheckBlackBalls(int [][] arrayAttempts, int [] arraySolution, int attempt) {
		for (int i = 0; i < arraySolution.length; i++){
			assertEquals(arrayAttempts[attempt][i], arraySolution[(i+1)%4]);
			assertEquals(arrayAttempts[attempt][i], arraySolution[(i+2)%4]);
			assertEquals(arrayAttempts[attempt][i], arraySolution[(i+3)%4]);
		}
	}
}

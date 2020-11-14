package tests;

/**
 * @author 		Pol & Angel
 * @name 		MockBalls.java
 * @origin		BallsTest.java 
 * @description	Mock: crea per defecte dos arrays, un d'intents i un de solucions. Esta fet comprovar les boles negres i blanques
 * @test		
 */
public class MockBalls {
	
	private String arrayAttempts[][];
	private int arraySolution[];	

	/**
	 * @MockBalls
	 * Constructor per a inizialitzar les dos arrays amb un espai de 10 intents i 6 (4 per els numeros i 2 per les boles blanques i negres)
	 * Tambe un altre array amb la solucio correcte
	 */
	public MockBalls() {
		this.arrayAttempts = new String[10][6]; 
		this.arraySolution = new int[4];
	}
	
	/**
	 * @introduceArrayAttempts
	 * Asignem els numeros de les boles automaticament a l'array d'intents
	 * Es utilitzat per a blanques i negres 
	 */
	public void introduceArrayAttempts() {
		arrayAttempts[0][0] = "1";
		arrayAttempts[0][1] = "2";
		arrayAttempts[0][2] = "3";
		arrayAttempts[0][3] = "4";
	}
	
	/**
	 * @introduceSolutionWhite
	 * Asignem els numeros de les solucions de les boles blanques automaticament a l'array de solucions
	 * Es utilitzat unicament per a boles blanques
	 */
	public void introduceSolutionWhite() {
		arraySolution[0] = 1;
		arraySolution[1] = 2;
		arraySolution[2] = 3;
		arraySolution[3] = 4;
	}
	
	/**
	 * @introduceSolutionBlack
	 * Asignem els numeros de les solucions de les boles negres automaticament a l'array de solucions
	 * Es utiltizat unicament per a boles negres
	 */
	public void introduceSolutionBlack() {
		arraySolution[0] = 4;
		arraySolution[1] = 3;
		arraySolution[2] = 2;
		arraySolution[3] = 1;
	}
	
	/**
	 * @introduceSolutionFalse
	 * Asignem els numeros de les solucions de les boles amb diferents numeros de 1234 a l'array de solucions
	 * Es utilitzat per a blanques i negres 
	 */
	public void introduceSolutionFalse() {
		arraySolution[0] = 5;
		arraySolution[1] = 6;
		arraySolution[2] = 7;
		arraySolution[3] = 8;
	}

	/**
	 * @getArrayAttempts
	 * Retorna l'array d'intents arrayAttempts[]
	 */
	public String[][] getArrayAttempts() {
		return arrayAttempts;
	}

	/**
	 * @getArraySolution
	 * Retorna l'array de solucions arraySolution[]
	 */
	public int[] getArraySolution() {
		return arraySolution;
	}
	
	
}

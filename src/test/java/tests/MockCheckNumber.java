package tests;

/**
 * @author 		Pol & Angel
 * @name 		MockCheckNumber.java
 * @origin		GameTest.java 
 * @description	Mock: crea per defecte un array amb numeros correctes i una altre array amb tots els posibles errors que hi pot haber al joc
 * @test		introduceArrayCorrectNumbers(), introduceArrayFailNumbers(), getArrayCorrectNumbers(), getArrayFailNumbers()
 */
public class MockCheckNumber extends GameTest{
	private String arrayCorrectNumbers[];
	private String arrayFailNumbers[];
	
	/**
	 * @MockCheckNumber
	 * Constructor per a definir per defecte una array de numeros correctes arrayCorrectNumbers amb capacitat de 3 i una array dels erronis arrayFailNumbers amb capacitat de 10
	 */
	public MockCheckNumber() { 
		this.arrayCorrectNumbers = new String[3];
		this.arrayFailNumbers = new String[10]; 
	}
	
	/**
	 * @introduceArrayCorrectNumbers
	 * Assigna els valors correctes a l'array arrayCorrectNumbers
	 */
	public void introduceArrayCorrectNumbers() {
		this.arrayCorrectNumbers[0] = "1234";
		this.arrayCorrectNumbers[1] = "5678";
		this.arrayCorrectNumbers[2] = "9012";
		
	}
	
	/**
	 * @introduceArrayCorrectNumbers
	 * Assigna els valors incorrectes a l'array arrayFailNumbers
	 */
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

	/**
	 * @getArrayCorrectNumbers
	 * Retorna l'array amb els numeros correctes arrayCorrectNumbers
	 */
	public String[] getArrayCorrectNumbers() {
		return arrayCorrectNumbers;
	}

	/**
	 * @getArrayFailNumbers
	 * Retorna l'array amb els numeros incorrectes arrayFailNumbers
	 */
	public String[] getArrayFailNumbers() {
		return arrayFailNumbers;
	}

}

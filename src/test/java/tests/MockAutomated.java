package tests;



/**
 * @author 		Victor
 * @name 		MockAutomated.java
 * @origin		AutomatedTest.java 
 * @description	Mock: crea per defecte una array d'opcions per fer diferents partides i tambe una per la introduccio dels valors
 * @test		introduceOptions(), introduceValues(), introduceCorrectIncorrectValues(),introduceSameValues(),introduceSameValue(), getOptions(), getValues()
 */
public class MockAutomated extends AutomatedTest {
	private String options[];
	private String values[];		
	
	
	/**
	 * @MockPlay
	 * Constructor per a definir les dos arrays, la primera options[] amb capacitat de 3 i la segona values[] amb capacitat de 13
	 */
	public MockAutomated() { 
		this.options = new String[6];
		this.values = new String[20];
	}
	
	/**
	 * @introduceOptions
	 * Asigna els valors a l'array options, el primer valor es per executar el joc i perdre, el segon valor es per executar el joc i guanyar, el tercer valor es per finalitzar del joc
	 */
	public void introduceOptions() {
		options[0] = "1";
		options[1] = "2";
		options[2] = "3";
		options[3] = "4";
		options[4] = "5";
		options[5] = "0";
	}
	
	/**
	 * @introduceValues
	 * Asigna una quantitat de valors per a que la maquina pugui jugar automaticament
	 */
	public void introduceValues() {
		
		values[0] = "5678";
		values[1] = "9012";
		values[2] = "8596";
		values[3] = "5236";
		values[4] = "2154";
		values[5] = "7890";
		values[6] = "0987";
		values[7] = "6543";
		values[8] = "1234";
		values[9] = "8765";		
		
	}
	
	/**
	 * @intrduceCorrectIncorrectValues
	 * * Asigna una quantitat de valors per a que la maquina pugui jugar automaticament, entre ells hi ha erronis i correctes per fer els altres test
	 */
	public void introduceCorrectIncorrectValues() {
		
		values[0] = "5678";
		values[1] = "-1-2-3-4";
		values[2] = "8596";
		values[3] = "@~€89";
		values[4] = "2154";
		values[5] = "/()/·";
		values[6] = "0987";
		values[7] = "`+´+";
		values[8] = "1256";
		values[9] = "    ";
		values[10] = "8956";
		values[11] = "XXXX";
		values[12] = "8895";
		values[13] = "ABCD";
		values[14] = "2301";
		values[15] = "0000000000000000000";
		values[16] = "9871";
		values[17] = "____";
		values[18] = "8974";
			
		
	}
	
	/**
	 * @introduceSameValues
	 * Asigna una quantitat de valors iguals per a que la maquina pugui jugar automaticament
	 */
	public void introduceSameValues() {
		
		values[0] = "7892";
		values[1] = "7892";
		values[2] = "7892";
		values[3] = "7892";
		values[4] = "7892";
		values[5] = "7892";
		values[6] = "7892";
		values[7] = "7892";
		values[8] = "7892";
		values[9] = "7892";		
		
	}
	
	/**
	 * @introduceSameValue()
	 * Asigna els mateixos valors per a que la maquina pugui jugar automaticament
	 * 
	 */
	public void introduceSameValue() {
		
		values[0] = "3333";
		values[1] = "3333";
		values[2] = "3333";
		values[3] = "3333";
		values[4] = "3333";
		values[5] = "3333";
		values[6] = "3333";
		values[7] = "3333";
		values[8] = "3333";
		values[9] = "3333";		
		
	}

	/**
	 * @getOptions
	 * Retorna l'array d'opcions creada options[]
	 */
	public String[] getOptions() {
		return options;
	}

	/**
	 * @getValues
	 * Retorna l'array de valors creada values[]
	 */
	public String[] getValues() {
		return values;
	}	
}
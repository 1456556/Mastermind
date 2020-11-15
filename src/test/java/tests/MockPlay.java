package tests;

/**
 * @author 		Pol & Angel
 * @name 		MockPlay.java
 * @origin		PlayTest.java 
 * @description	Mock: crea per defecte una array d'opcions per fer diferents partides i tambe una per la introduccio dels valors
 * @test		introduceOptions(), introduceValues(), getOptions(), getValues()
 */
public class MockPlay {
	private String options[];
	private String values[];
	
	/**
	 * @MockPlay
	 * Constructor per a definir les dos arrays, la primera options[] amb capacitat de 3 i la segona values[] amb capacitat de 13
	 */
	public MockPlay() { 
		this.options = new String[3];
		this.values = new String[13];
	}
	
	/**
	 * @introduceOptions
	 * Asigna els valors a l'array options, el primer valor es per executar el joc i perdre, el segon valor es per executar el joc i guanyar, el tercer valor es per finalitzar del joc
	 */
	public void introduceOptions() {
		options[0] = "2";
		options[1] = "1";
		options[2] = "0";
	}
	
	/**
	 * @introduceValues
	 * Asigna una quantitat de valors per a que la maquina pugui jugar automaticament, entre ells hi ha erronis i correctes per fer els altres test
	 */
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

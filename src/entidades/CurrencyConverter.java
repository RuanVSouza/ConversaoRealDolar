package entidades;

public class CurrencyConverter {

	public static double dollar;
	public static double quantify;
	public static double IOF = 0.06;
	
	
	
	public static double transform() {
		return (dollar * quantify);
	}
	
	
}

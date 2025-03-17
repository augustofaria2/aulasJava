package entities;

public class EstaticDolar {
	
	public static double IOF = 0.06; 
	
	public static double realToDolar(double quantidade, double precoDolar) {
		return precoDolar * quantidade * (1.0 + IOF);
	}
}

package entitiesEstudosProva;

public class CalculadoraCientifica extends Calculadora{

	@Override
	public double soma(double a, double b) {
		return a + b;
	}

	@Override
	public double subtracao(double a, double b) {
		return a - b;
	}

	@Override
	public double divisao(double a, double b) {
		return a / b;
	}

	@Override
	public double multiplicacao(double a, double b) {
		return a * b;
	}
	
	public double raizQuadrada(double a) {
		return Math.sqrt(a);
	}
	
	public double potencia(double a, double b) {
		return Math.pow(a, b);
	}
}

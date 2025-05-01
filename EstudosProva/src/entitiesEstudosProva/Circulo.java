package entitiesEstudosProva;

public class Circulo implements FormaGeometrica{
	public double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * (Math.pow(raio, 2));
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * raio;
	}
}
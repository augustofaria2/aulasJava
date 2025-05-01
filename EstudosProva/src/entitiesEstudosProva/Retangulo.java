package entitiesEstudosProva;

public class Retangulo implements FormaGeometrica{
	public double altura;
	public double largura;
	
	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	@Override
	public double calcularArea() {
		return altura * largura;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * (largura + altura);
	}

}

package entitiesEstudosProva;

public class Ingresso{
	
	private Double valor;
	
	public Ingresso(Double valor) {
		this.valor = valor;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public String toString() {
		return String.format("%.2f", getValor());
	}
}
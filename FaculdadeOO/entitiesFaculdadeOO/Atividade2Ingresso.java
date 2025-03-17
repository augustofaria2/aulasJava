package entitiesFaculdadeOO;

public class Atividade2Ingresso {
	
	private Double value;

	public Atividade2Ingresso() {
	}
	
	public Atividade2Ingresso(Double value) {
		this.value = value;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value ) {
		this.value = value;
	}
	
	private Double imprimeValuePrivate() {
		return value;
	}
	
	@Override
	public String toString() {
		return String.format("%.2f", imprimeValuePrivate());
	}
	
}

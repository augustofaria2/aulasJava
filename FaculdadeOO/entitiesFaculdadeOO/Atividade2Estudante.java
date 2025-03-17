package entitiesFaculdadeOO;

public class Atividade2Estudante extends Atividade2Ingresso{

	public Atividade2Estudante(Double value) {
		super(value);
	}
	
	@Override
	public String toString() {
		return String.format("%.2f", getValue() / 2);
	}
}

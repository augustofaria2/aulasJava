package entitiesEstudosProva;

public class Estudante extends Ingresso{
	
	public Estudante(Double valor) {
		super(valor);
	}
	
	public Double getNewValor() {
		return super.getValor() / 2;
	}
	
	@Override
	public String toString() {
		return String.format("%.2f", getNewValor());
	}
}
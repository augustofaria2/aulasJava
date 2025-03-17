package entitiesEstudosProva;

public class Vip extends Ingresso{
	
	private Double add;
	
	public Vip(Double valor, Double add) {
		super(valor);
		this.add = add;
	}
	
	public Double getNewValor() {
		return super.getValor() + add;
	}
	
	public Double getAdd() {
		return add;
	}
	
	@Override
	public String toString() {
		return String.format("%.2f", getNewValor());
	}
}
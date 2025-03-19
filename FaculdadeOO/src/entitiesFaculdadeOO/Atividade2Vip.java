package entitiesFaculdadeOO;

public class Atividade2Vip extends Atividade2Ingresso{
	
	private Double additionalValue;

	public Atividade2Vip(Double value, Double additionalValue) {
		super(value);
		this.additionalValue = additionalValue;
	}

	public Double getAdditionalValue() {
		return additionalValue;
	}

	public void setAdditionalValue(Double additionalValue) {
		this.additionalValue = additionalValue;
	}
	
	public String toString() {
		return String.format("%.2f",getValue() + additionalValue);
	}
}

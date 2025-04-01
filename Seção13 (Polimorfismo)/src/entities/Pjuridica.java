package entities;

public class Pjuridica extends TaxPayer{
	private Integer numberEmployees;
	
	public Pjuridica(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}
	
	@Override
	public Double imposto() {
		if (numberEmployees > 10) {
			return getAnualIncome() * 0.14;
		}
		else {
			return getAnualIncome() * 0.16;
		}
	}
}

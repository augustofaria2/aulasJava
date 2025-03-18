package entities;

public abstract class TaxPayer {
	private String name;
	private Double anualIncome;
	
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	public abstract Double imposto();

	public String getName() {
		return name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}
	
}

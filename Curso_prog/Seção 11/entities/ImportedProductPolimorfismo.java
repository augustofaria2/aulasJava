package entities;

public class ImportedProductPolimorfismo extends ProductPolimorfismo{
	
	private Double customsFee;
	
	public ImportedProductPolimorfismo() {
		
	}

	public ImportedProductPolimorfismo(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return getName()
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (CustomsFee: $ "
				+ String.format("%.2f", customsFee)
				+ ")";
	}
	
	public double totalPrice() {
		return getPrice() + customsFee;
	}
}

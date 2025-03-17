package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProductPolimorfismo extends ProductPolimorfismo {
	
	private LocalDate manufactureDate;
	
	public UsedProductPolimorfismo() {
		
	}

	public UsedProductPolimorfismo(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return super.priceTag() 
				+ " (Manufacture date: " 
				+ manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
}

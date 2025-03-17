package entities;

/*
 * Upcasting: Casting da subclasse para superclasse
 * Downcasting: Casting da superclasse para subclasse e Palavra instanceof
 */

public final class SavingsAccount extends Account { /*O ''final'' evita que a classe seja herdada, ou seja,
	que seja criado novas subclasses a partir dela*/

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override /*indica que esse método é uma sobreposição de um método da superclasse Account e verifica
	também se a escrita está correta (igual o método da superclasse)*/
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	/*@Override
	public final void withdraw(double amount) { 
		balance -= amount;
		O ''final'' em um método evita que ele seja sobreposto, ou seja, usado em outra classe com modificações, 
		obrigando a nova classe a criar outro método ao invés de reutilizar esse.
	}*/
	
	/*
	 * Geralmente convém acrescentar final em métodos sobrepostos, pois
	 * sobreposições múltiplas podem ser uma porta de entrada para inconsistências.
	 * Além disso, ocorre uma melhora de performance, já que os atributos de tipo de 
	 * uma classe final são analisados de forma mais rápida em tempo de execução.
	 */
}

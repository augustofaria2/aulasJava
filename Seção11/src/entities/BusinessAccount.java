package entities;

public class BusinessAccount extends Account{ //BusinessAccount é subclasse de Account
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); //executa a lógica do construtor da classe base (superclasse)
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(Double amount) {
		if(loanLimit >= amount) {
			//deposit(amount);
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount); //pega o método withdraw da superclasse 
		balance -= 2.0; //Altera ele depois
	}
}
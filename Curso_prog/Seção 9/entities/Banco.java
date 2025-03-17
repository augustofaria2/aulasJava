package entities;

public class Banco {
	
	private int accNumber;
	private String name;
	private double balance; //criamos os atributos
	
	public Banco(int accNumber, String name, double initDeposit) {
		this.accNumber = accNumber;
		this.name = name;
		deposit(initDeposit);
	} //construtor com todos os 3 parâmetros

	public Banco(int accNumber, String name) {
		this.accNumber = accNumber;
		this.name = name;
	} //construtor com apenas 2 parâmetros

	public String getName() {
		return name;
	} //pegar o nome

	public void setName(String name) {
		this.name = name;
	} //alterar o nome caso necessário

	public int getAccNumber() {
		return accNumber;
	} //pegar o número da conta, não tem o setAccNumber porque o número da conta deve ser inalterável

	public double getInitDeposit() {
		return balance;
	} /*pegar o deposito inicial, não tem o setInitDeposit porque ele os depósitos só podem ser alterados
	 	por meio do método deposit/withdraw */

	public String toString() {
		return "Account "
				+ accNumber 
				+ ", Holder: "
				+ name
				+ ", Balance: $ " 
				+ String.format("%.2f", balance);
	} //transformei minha classe com os atributos em uma string para mostrar para o usuário
	
	public void deposit(double depositValue) {
		balance += depositValue; 
	} //método para depositar dinheiro
	
	public void withdraw(double depositValue) {
		balance -= depositValue + 5.0;
	} //método para sacar dinheiro + taxa do banco
}

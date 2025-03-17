package entitiesEstudosProva;

public class ContaBancaria {
	private Integer numeroConta;
	private Double saldo;
	
	public void cadastrarConta(Integer numeroConta, Double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public Integer getNumeroConta() {
		return numeroConta;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	@Override
	public String toString() {
		return "Numero da Conta: "
				+ numeroConta
				+ ", Saldo: "
				+ saldo;
	}
}

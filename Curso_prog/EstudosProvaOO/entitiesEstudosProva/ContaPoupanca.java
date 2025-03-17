package entitiesEstudosProva;

public class ContaPoupanca extends ContaBancaria{
	private Double taxaJuros;
	
	public ContaPoupanca() {
		
	}
	
	public void cadastrarConta(Integer numeroConta, Double saldo, Double taxaJuros) {
		super.cadastrarConta(numeroConta, saldo);
		this.taxaJuros = taxaJuros;
	}
	
	public void cadastrarJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public Double getTaxaJuros() {
		return taxaJuros;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ ", Taxa de juros: "
				+ taxaJuros;
	}
}

package entitiesEstudosProva;



public class ContaCorrente extends ContaBancaria{
	private Double taxaManutencao;
	
	public ContaCorrente() {
		
	}
	
	public void cadastrarConta(Integer numeroConta, Double saldo, Double taxaManutencao) {
		super.cadastrarConta(numeroConta, saldo);
		this.taxaManutencao = taxaManutencao;
	}
	
	public void cadastrarTaxa(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}
	
	public Double getTaxaManutencao() {
		return taxaManutencao;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ ", Taxa de manutenção: "
				+ taxaManutencao;
	}
}

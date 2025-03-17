package entitiesEstudosProva;

public class Carro extends Veiculo{
	private Integer quantidadePortas;
	
	public Carro() {
		
	}
	
	public void cadastrarCarro(String marca, String modelo, Integer ano, Integer quantidadePortas) {
		super.cadastrarVeiculo(marca, modelo, ano);
		this.quantidadePortas = quantidadePortas;
	}
	
	public Integer getQuantidadePortas() {
		return quantidadePortas;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ ", Quantidade de Portas: "
				+ quantidadePortas;
	}
}

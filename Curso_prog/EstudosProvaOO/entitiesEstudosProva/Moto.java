package entitiesEstudosProva;

public class Moto extends Veiculo{
	private Integer cilindradas;
	
	public Moto() {
		
	}
	
	public void cadastrarMoto(String marca, String modelo, Integer ano, Integer cilindradas) {
		super.cadastrarVeiculo(marca, modelo, ano);
		this.cilindradas = cilindradas;
	}
	
	public Integer getCilindradas() {
		return cilindradas;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ ", Cilindradas: "
				+ cilindradas;
	}
}

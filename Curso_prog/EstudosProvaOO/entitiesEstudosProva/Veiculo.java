package entitiesEstudosProva;

public class Veiculo {
	private String marca;
	private String modelo;
	private Integer ano;
	
	public void cadastrarVeiculo(String marca, String modelo, Integer ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public Integer getAno() {
		return ano;
	}
	
	@Override
	public String toString() {
		return "Marca: "
				+ marca
				+ ", Modelo: "
				+ modelo
				+ ", Ano: "
				+ ano;
	}
}

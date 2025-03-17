package entitiesFaculdadeOO;

public class Atividade1Secretaria extends Atividade1Funcionario {
	
	private Integer ramal;
	
	public Atividade1Secretaria() {
		
	}

	public Atividade1Secretaria(String name, Double salary, Integer ramal) { //construtor que funciona
		super(name, salary);												 //como o método register
		this.ramal = ramal;
	}

	public Integer getRamal() {
		return ramal;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ " Ramal: "
				+ ramal;
	}
}

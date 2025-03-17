package entitiesEstudosProva;



public class Secretaria extends Funcionario{
	
	private Integer ramal;
	
	public Secretaria() {
		
	}
	
	public void register(String name, Double salary, Integer ramal) {
		super.register(name, salary);
		this.ramal = ramal;
	}
	
	public Integer getRamal() {
		return ramal;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ ", Ramal: "
				+ ramal;
	}
}
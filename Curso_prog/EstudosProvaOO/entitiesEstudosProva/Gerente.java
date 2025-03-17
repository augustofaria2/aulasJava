package entitiesEstudosProva;

public class Gerente extends Funcionario{

	private Integer user;
	private String password;
	
	public Gerente() {
		
	}
	
	public void register(String name, Double salary, Integer user, String password) {
		super.register(name, salary);
		this.user = user;
		this.password = password;
	}
	
	public Integer getUser() {
		return user;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ ", User: "
				+ user;
	}
}
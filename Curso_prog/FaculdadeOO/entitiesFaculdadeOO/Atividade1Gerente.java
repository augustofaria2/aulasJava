package entitiesFaculdadeOO;

public class Atividade1Gerente extends Atividade1Funcionario {

	private String senha;
	private Integer user;
	
	public Atividade1Gerente() {
		
	}

	public Atividade1Gerente(String name, Double salary, String senha, Integer user) {
		super(name, salary);
		this.senha = senha;
		this.user = user;
	}

	public String getSenha() {
		return senha;
	}

	public Integer getUser() {
		return user;
	}
	
	public void register(String senha, int user) {
		this.senha = senha;
		this.user = user;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ " Usuário: "
				+ user;
	}
	
}

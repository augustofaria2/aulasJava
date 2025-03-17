package entitiesFaculdadeOO;

public class Atividade1Funcionario {

	private String name;
	private Double salary;

	public Atividade1Funcionario() {
	}

	public Atividade1Funcionario(String nameF, Double salary) { //construtor que faz a função do método register
		this.name = nameF;
		this.salary = salary;
	}

	public String getName() { //Não coloquei os set porque não quero que o usuário consiga alterar salários ou o nome
		return name;		  //E isso vale pra todos, gerente ou secretaria.
	}

	public Double getSalary() {
		return salary;
	}
	
	public String toString() {
		return "Nome: " 
				+ name 
				+ ", salário: $ " 
				+ String.format("%.2f", salary);
	}

}

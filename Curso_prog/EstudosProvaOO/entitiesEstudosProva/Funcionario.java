package entitiesEstudosProva;

public class Funcionario{
	
	private String name;
	private Double salary;
	
	public void register(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Name: "
				+ name
				+ ", Salary: "
				+ String.format("%.2f", salary);
	}
}
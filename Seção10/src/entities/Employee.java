package entities;

import java.util.List;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {
		
	}
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return name;
	}
	public void setNome(String name) {
		this.name = name;
	}
	public Double getSalario() {
		return salary;
	}
	
	public void increaseSalary(double porcent) {
		salary += (porcent/100) * salary;
	}
	
	@Override
	public String toString() {
		return id 
				+ ", " 
				+ name 
				+ ", " 
				+ String.format("%.2f", salary);
	}
	
	public static boolean hasId(List<Employee> lista, int id) {
		Employee emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}

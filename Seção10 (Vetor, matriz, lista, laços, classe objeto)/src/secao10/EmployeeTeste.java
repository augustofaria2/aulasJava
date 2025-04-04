package secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class EmployeeTeste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		List<Employee> lista = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		n = sc.nextInt();
		
		for(i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while(Employee.hasId(lista, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			lista.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalaryIncrease = sc.nextInt();
		
		Employee emp = lista.stream().filter(x -> x.getId() == idSalaryIncrease).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : lista) {
			System.out.println(obj);
		}
		
		sc.close();
	}
}

package estudosProva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitiesEstudosProva.Funcionario;
import entitiesEstudosProva.Gerente;
import entitiesEstudosProva.Secretaria;

public class Q1{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ch;
		int N;
		
		System.out.print("Quantos funcionarios? ");
		N = sc.nextInt();
		
		List<Funcionario> lista = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			System.out.print("GERENTE OU SECRETARIA? (g/s) ");
			ch = sc.next().charAt(0);
			sc.nextLine();
		
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			if(ch == 'g') {
				System.out.print("User: ");
				int user = sc.nextInt();
				sc.nextLine();
				System.out.print("Password: ");
				String password = sc.nextLine();
				
				Gerente gerente = new Gerente();
				gerente.register(name, salary, user, password); 
				
				lista.add(gerente);
			}
			
			if(ch == 's') {
				System.out.print("Ramal: ");
				int ramal = sc.nextInt();
				
				Secretaria secretaria = new Secretaria();
				secretaria.register(name, salary, ramal);
				
				lista.add(secretaria);
			}
		}
		
		for(Funcionario func : lista) {
			System.out.println(func.toString());
		}
		
		sc.close();
	}
}

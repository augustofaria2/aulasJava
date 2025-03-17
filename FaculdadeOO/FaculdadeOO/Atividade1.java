package FaculdadeOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesFaculdadeOO.Atividade1Funcionario;
import entitiesFaculdadeOO.Atividade1Gerente;
import entitiesFaculdadeOO.Atividade1Secretaria;

/*
 * Escreva um programa que implemente a estrutura de hierarquia de classes: Funcionário (classe base)
 * e as subclasses Gerente e Secretária. Escreva um programa principal que permita ao usuário entrar com
 * os dados de um gerente e duas secretárias e, após finalizar a entrada de dados, o programa escreva na
 * tela todos os dados dos três funcionários.
 * 
 */

public class Atividade1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char ch;
		
		List<Atividade1Funcionario> list = new ArrayList<>(); //Criei uma lista, sendo possível alterar o
															  //tamanho caso necessário
		for(int i=1;i<=3;i++) {
			System.out.println("Employee #" + i + ":");
			System.out.println("Gerente ou secretária? (g/s) ");
			ch = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			
			if(ch == 'g') {
				System.out.print("Usuário: ");
				int user = sc.nextInt();
				sc.nextLine();
				System.out.print("Senha: ");
				String senha = sc.nextLine();
				
				list.add(new Atividade1Gerente(name, salary, senha, user));
				
			}else if (ch == 's'){
				System.out.print("Ramal: ");
				int ramal = sc.nextInt();
				
				list.add(new Atividade1Secretaria(name, salary, ramal));
			}
		}
		
		System.out.println();
		
		for(Atividade1Funcionario at : list) {
			System.out.println(at.toString());
		}
		
		sc.close();

	}

}

package listaExercicio5;

import java.util.Locale;
import java.util.Scanner;

import entities5.Funcionario;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e
		 * imposto). Em seguida, mostrar os dados do funcionário (nome e salário
		 * líquido). Em seguida, aumentar o salário do funcionário com base em uma
		 * porcentagem dada (somente o salário bruto é afetado pela porcentagem) e
		 * mostrar novamente os dados do funcionário. Use a classe projetada abaixo.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario x = new Funcionario();
		
		System.out.print("Nome: ");
		x.nome = sc.nextLine();
		System.out.print("Salário bruto: ");
		x.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		x.taxa = sc.nextDouble();
		
		System.out.println("Funcionario: " + x.nome + ", $ " + String.format("%.2f", x.salarioLiquido()));
		
		System.out.print("Quanto você quer aumentar do salário? ");
		double porcentagem = sc.nextDouble();
		x.aumentoDeSalario(porcentagem);
		
		System.out.println("Novos dados: " + x.nome + ", $ " + String.format("%.2f", x.salarioLiquido()));
		
		sc.close();
		
	}

}

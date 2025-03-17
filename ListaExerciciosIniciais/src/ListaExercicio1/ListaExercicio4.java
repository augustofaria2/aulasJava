package ListaExercicio1;

import java.util.Scanner;

public class ListaExercicio4 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */
		
		int funcionario, horas;
		double valor, salario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número do funcionário: ");
		funcionario = sc.nextInt();
		System.out.println("Digite o número de horas trabalhadas por esse funcionário: ");
		horas = sc.nextInt();
		System.out.println("Digite quanto ele recebe por hora trabalhada: ");
		valor = sc.nextDouble();
		
		salario = horas * valor;
		
		System.out.println("NÚMERO = " + funcionario);
		System.out.printf("SALÁRIO = R$ %.2f", salario);
		
		sc.close();
	}

}

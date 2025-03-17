package ListaExercicio2;

import java.util.Scanner;

public class ListaExercicio8 {

	public static void main(String[] args) {
		/*
		 * Leia um valor com duas casas decimais, equivalente ao salário
		 * de uma pessoa. Em seguida, calcule e mostre o valor que esta pessoa deve 
		 * pagar de Imposto de Renda.
		 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre 
		 * R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de
		 * Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00,
		 * o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.
		 */
		
		double salario, impostoDeRenda = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salario: ");
		salario = sc.nextDouble();
		
		if(salario >= 0.0 && salario <= 2000.0) {
			System.out.println("Isento.");
		}else if(salario <= 3000.0) {
			impostoDeRenda = (salario - 2000.0) * 0.08;
			System.out.printf("%.2f%n", impostoDeRenda);
		}else if(salario <= 4500.0) {
			impostoDeRenda = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
			System.out.printf("%.2f%n", impostoDeRenda);
		}else {
			impostoDeRenda = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000 * 0.08;
			System.out.printf("%.2f%n", impostoDeRenda);
		}
		
		sc.close();
	}

}

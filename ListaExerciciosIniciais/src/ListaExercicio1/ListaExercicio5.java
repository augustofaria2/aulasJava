package ListaExercicio1;

import java.util.Scanner;

public class ListaExercicio5 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		
		int codigo1, codigo2, peca1, peca2;
		double valor1, valor2, total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código da peça 1: ");
		codigo1 = sc.nextInt();
		System.out.println("Digite o código da peça 2: ");
		codigo2 = sc.nextInt();
		System.out.println("Digite o número de peças 1: ");
		peca1 = sc.nextInt();
		System.out.println("Digite o número de peças 2: ");
		peca2 = sc.nextInt();
		System.out.println("Digite o valor da peça 1: ");
		valor1 = sc.nextDouble();
		System.out.println("Digite o valor da peça 2: ");
		valor2 = sc.nextDouble();
		
		total = valor1 * peca1 + valor2 * peca2;
		
		System.out.printf("codigo2"
				+ "codigo1"
				+ "VALOR A PAGAR: R$ %.2f%n", codigo1, codigo2, total);
		
		sc.close();
	}

}

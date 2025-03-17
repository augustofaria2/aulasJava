package ListaExercicio2;

import java.util.Scanner;

public class ListaExercicio2 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
		 * ímpar.
		 */
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("O número digitado é par.");
		}else {
			System.out.println("O número digitado é ímpar.");
		}

		sc.close();
	}

}

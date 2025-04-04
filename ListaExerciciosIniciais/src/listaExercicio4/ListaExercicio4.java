package listaExercicio4;

import java.util.Scanner;

public class ListaExercicio4 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e
		 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		 * mostrar a mensagem "divisao impossivel".
		 */
		int n;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número de pares de números: ");
		n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.println("Digite o primeiro número: ");
			int x = sc.nextInt();
			System.out.println("Digite o segundo número: ");
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();
		
	}

}

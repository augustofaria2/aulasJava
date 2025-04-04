package listaExercicio2;

import java.util.Scanner;

public class ListaExercicio3 {

	public static void main(String[] args) {
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
		 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 */
		
		int A, B;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		A = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("Os números são múltiplos.");
		}else {
			System.out.println("Os números não são múltiplos.");
		}
		
		sc.close();
	}

}

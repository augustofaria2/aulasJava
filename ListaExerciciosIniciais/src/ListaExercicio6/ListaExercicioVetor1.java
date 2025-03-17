package ListaExercicio6;

import java.util.Scanner;

/*
 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
 * e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 */

public class ListaExercicioVetor1 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		System.out.print("Quantos número você quer digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(i = 0; i < n; i++) {
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Número Negativos:");
		
		for(i = 0; i < vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}

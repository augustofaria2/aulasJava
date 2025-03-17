package ListaExercicio6;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
 * tela todos os números pares, e também a quantidade de números pares.
 */

public class ListaExercicioVetor4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, par = 0;
		
		System.out.print("Quantos números você quer digitar? ");
		n = sc.nextInt();
		int[] vect = new int[n];
		
		for(i = 0; i < n; i++) {
			System.out.print("Digite os números: ");
			vect[i] = sc.nextInt();
		}
		
		for(i = 0; i < n; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print("Números pares: " + vect[i] + " ");
				par++;
			}
		}
		
		System.out.println();
		System.out.println("Pares: " + par);
		
		sc.close();
	}

}

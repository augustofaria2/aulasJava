package Secao10;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 * - Imprimir todos os elementos do vetor
 * - Mostrar na tela a soma e a média dos elementos do vetor
 */

public class ListaExercicioVetor2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int i, x;
		double soma = 0;
		double media = 0;
		
		System.out.print("Quanto números quer digitar? ");
		x = sc.nextInt();
		
		double[] vect = new double[x];
		
		System.out.println("Digite os numeros:");
		for(i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
	
		media = soma/x;
		
		System.out.print("Vetor digitado: ");
		for(i = 0; i < vect.length; i++) {
			System.out.print(" " + vect[i]);
		}
		
		System.out.println();
		
		System.out.println("Soma: " + soma);
		System.out.println("media: " + media);
		
		sc.close();
	}

}

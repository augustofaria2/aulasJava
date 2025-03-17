package Secao10;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
 * mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
 * os elementos do vetor que estejam abaixo da média, com uma casa decimal cada
 */

public class ListaExercicioVetor7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double soma = 0, media;
		
		System.out.print("Quantos número terão o vetor: ");
		n = sc.nextInt();
		double[] vect = new double[n];
		
		for(i = 0; i < n; i++) {
			System.out.print("Digite o número: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		media = soma/n;
		System.out.printf("Media: %.3f%n", media);
		
		System.out.print("Abaixo da média: ");
		
		for(i = 0; i < n; i++) {
			if(vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}

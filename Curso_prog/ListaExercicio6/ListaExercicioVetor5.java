package Secao10;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
 * o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
 * considerando a primeira posição como 0 (zero).
 */

public class ListaExercicioVetor5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, posicao = 0;
		double maior;
		
		System.out.print("Quantos número serão digitados? ");
		n = sc.nextInt();
		double[] vect = new double[n];
		
		System.out.print("Digite o número: ");
		vect[0] = sc.nextDouble();
		maior = vect[0];
		
		for(i = 1; i < n; i++) {
			System.out.print("Digite o número: ");
			vect[i] = sc.nextDouble();
			if(vect[i] > maior) {
				maior = vect[i];
				posicao = i;
			}
		}
		
		System.out.printf("O maior número foi a posição %d do vetor, com o valor %.1f", posicao, maior);
		
		
		sc.close();
	}

}

package Secao10;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
 * terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
 * o vetor C gerado.
 */

public class ListaExercicioVetor6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		
		System.out.print("Quanto elementos terá cada vetor? ");
		n = sc.nextInt();
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];
		
		System.out.println("digite os números do vetor A: ");
		
		for(i = 0; i < n; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("digite os números do vetor B: ");
		
		for(i = 0; i < n; i++) {
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("Vetor resultante:");
		for(i = 0; i < n; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}

		sc.close();
	}

}

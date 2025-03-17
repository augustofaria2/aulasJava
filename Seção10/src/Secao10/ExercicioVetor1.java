package Secao10;

import java.util.Locale;
import java.util.Scanner;

/*
 * O garbage collector é um processo que automatiza o gerenciamento de memória de um programa em execução,
 * monitorando os objetos alocados dinamicamente pelo programa (no heap -- normalmente aqueles instanciados ou
 * apontados por ponteiros), desalocando aqueles que não estão mais sendo utilizados.
 * 
 * Variáveis locais são desalocadas imediatamente assim que seu escopo local sai de execução (não é 
 * garbage collector).
 */

public class ExercicioVetor1 { //Desvantagem de vetores: dificuldade para se realizar inserções e deleções, tamanho fixo

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] /*declara aq o tipo do vetor*/ vect = new double[n]; /*recebe a instanciação do vetor*/
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		sc.close();

	}

}

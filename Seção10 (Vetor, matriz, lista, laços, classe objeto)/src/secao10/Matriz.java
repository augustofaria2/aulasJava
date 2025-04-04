package secao10;

import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro N e uma matriz de
 * ordem N contendo números inteiros. Em seguida, mostrar a diagonal
 * principal e a quantidade de valores negativos da matriz.
 */

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n]; //instancia a matriz (vetor de vetores)

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt(); //pega todas as posições
			}
		}

		System.out.println("Main diagonal:");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " "); //já q a diagonal é sempre [0][0], [1][1] e [2][2]
		}
		System.out.println();

		int negative = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					negative++;
				}
			}
		}
		System.out.println("Negative numbers = " + negative);
		
		sc.close();

	}

}

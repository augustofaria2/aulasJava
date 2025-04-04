package secao10;

import java.util.Scanner;

/*
 * Fazer um programa para ler dois números inteiros M e N, e depois ler
 * uma matriz de M linhas por N colunas contendo números inteiros,
 * podendo haver repetições. Em seguida, ler um número inteiro X que
 * pertence à matriz. Para cada ocorrência de X, mostrar os valores à
 * esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo.
 */

public class MatrizTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, j, m, n, num;
		
		System.out.print("Digite o número de linhas da matriz: ");
		m = sc.nextInt();
		
		System.out.print("Digite o número de colunas da matriz: ");
		n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		System.out.println("Digite a matriz:");
		
		for(i=0;i<mat.length;i++) {
			for(j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
	
		System.out.print("Digite um número da matriz: ");
		num = sc.nextInt();
		
		for ( i=0; i<mat.length; i++) {
			for (j=0; j<mat[i].length; j++) {
				if (mat[i][j] == num) {
					System.out.println("Posição " + i + "," + j);
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}else if (i > 0) {
						System.out.println("Em cima: " + mat[i-1][j]);
					}else if (j < mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}else if (i < mat.length-1) {
						System.out.println("Abaixo: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}

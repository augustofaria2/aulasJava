package listaExercicio3;

import java.util.Scanner;

public class ListaExercicio2 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma).
		 */
		int x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de x: ");
		x = sc.nextInt();
		System.out.print("Digite o valor de y: ");
		y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Q1");
				
			}else if (x < 0 && y > 0) {
				System.out.println("Q2");
				
			}else if (x < 0 && y < 0) {
				System.out.println("Q3");
				
			}else{
				System.out.println("Q4");
			}
			System.out.print("Digite o novo valor de x: ");
			x = sc.nextInt();
			System.out.print("Digite o novo valor de y: ");
			y = sc.nextInt();
		}
		
		sc.close();
	}
}

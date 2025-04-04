package listaExercicio4;

import java.util.Scanner;

public class ListaExercicio1 {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		 * até X, um valor por linha, inclusive o X, se for o caso.
		 */
		
		int x = 0;
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		while(x < 1 || x > 1000) {
			System.out.println("Digite um valor: ");
			x = sc.nextInt();
			sc.close();
		}
		
		for(i = 1; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
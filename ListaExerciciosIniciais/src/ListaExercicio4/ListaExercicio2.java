package ListaExercicio4;

import java.util.Scanner;

public class ListaExercicio2 {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
		 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
		 * "out" para fora do intervalo).
		 */

		int n, i, x, in = 0, out = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de valores: ");
		n = sc.nextInt();
		
		for(i = 0; i < n; i++) {
			System.out.printf("Digite o numero %d: %n", i+1);
			x = sc.nextInt();
				if(x >= 10 && x <=20) {
					in++;
				}else {
					out++;
				}
			sc.close();
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
	}
}

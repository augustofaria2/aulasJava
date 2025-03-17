package secaoInicialJava;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// Quando se sabe previamente o número total de repetições

		Scanner sc = new Scanner(System.in);
		int n, i, x, soma = 0;
		
		n = sc.nextInt();
		
		for(i = 0; i < n; i++) {
			x = sc.nextInt();
			soma += x;
			sc.close();
		}
		
		System.out.println(soma);
	}

}

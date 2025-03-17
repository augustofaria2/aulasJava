package secaoInicialJava;
import java.util.Scanner;

//Recomendado quando não se sabe a quantidade exata de repetições

public class While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, soma = 0;
		x = sc.nextInt();
		soma += x;
		
		while (x != 0) {
			x = sc.nextInt();
			soma += x; 
		}
		
		System.out.println("SOMA = " + soma);
		
		sc.close();

	}

}

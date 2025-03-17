package secaoInicialJava;
import java.util.Scanner;

public class FuncoesExtras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers:");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);

		showResult(higher); //mostrar resultado 

		sc.close();
	}

	public static int max(int x, int y, int z) { //retorna o maior valor, portanto tem o return
		
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) { //apenas imprime na tela o valor, então é void
		
		System.out.println("Higher = " + value);
	}

}

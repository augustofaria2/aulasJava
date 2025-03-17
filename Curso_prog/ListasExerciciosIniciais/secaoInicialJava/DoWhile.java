package secaoInicialJava;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// Bloco de comando é executado ao menos uma vez até testar a condição
		
		double C, F;
		char L;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.print("Digite a temperatura em Celsius: ");
				C = sc.nextDouble();
				F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Quer continuar? (s/n) ");
				L = sc.next().charAt(0);
				
		}while(L != 'n');
		
		sc.close();
	}

}

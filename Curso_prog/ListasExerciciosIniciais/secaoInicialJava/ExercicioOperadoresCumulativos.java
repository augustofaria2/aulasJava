package secaoInicialJava;
import java.util.Scanner;

public class ExercicioOperadoresCumulativos {

	public static void main(String[] args) {
		
		int minutos, i;
		double valorPagar = 50;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Quantos minutos você usou? ");
			minutos = sc.nextInt();
			
			if(minutos <= 100) {
				System.out.printf("Valor a pagar = R$ %.2f", valorPagar);
			}else if(minutos > 100) {
				for(i = 100;i < minutos;i++) {
					valorPagar += 2;
				}
				System.out.printf("Valor a pagar = R$ %.2f", valorPagar);
			}
			sc.close();
		}
	}
	
}
/* 
 * a += b -> a = a + b;
 * a -= b -> a = a - b;
 * a *= b -> a = a * b;
 * a /= b -> a = a / b;
 * a %= b -> a = a % b;
 * */
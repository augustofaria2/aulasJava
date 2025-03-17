package ListaExercicio1;
import java.util.Scanner;

public class ListaExercicio2 {

	public static void main(String[] args) {
		/*
		 * faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * fórmula da área: area = π . raio2 
		 * considere o valor de π = 3.14159
		 */

		double raio;
		double pi = 3.14159;
		double area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio do círculo: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();
	}

}

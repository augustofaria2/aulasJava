package secao7_8;

import java.util.Locale;
import java.util.Scanner;

import entities.EstaticDolar;

public class ExercicioClassesEstaticas {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a
		 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
		 * pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
		 * sobre o valor em dólar. Criar uma classe CurrencyConverter para ser
		 * responsável pelos cálculos.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cotação do dólar: ");
		double precoDolar = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados? ");
		double quantidade = sc.nextDouble();

		double result = EstaticDolar.realToDolar(quantidade, precoDolar);
		
		System.out.printf("Quantos reais a pessoa vai pagar pelos dólares: %.2f%n", result);
		
		sc.close();
	}

}

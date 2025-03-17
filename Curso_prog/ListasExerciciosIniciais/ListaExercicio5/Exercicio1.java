package ListaExercicio5;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os valores da largura e altura de um retângulo. Em
		 * seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma
		 * classe como mostrado no projeto ao lado.
		 */
		Retangulo x = new Retangulo();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		
		System.out.println("Area: " + String.format("%.2f", x.area()));
		System.out.println("Perimetro: " + String.format("%.2f", x.perimetro()));
		System.out.println("Diagonal: " + String.format("%.2f",x.diagonal()));
		
		sc.close();
	}

}

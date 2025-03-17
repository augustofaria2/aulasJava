package secao7_8;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class ProgramaComOO_SemOO {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//double xA, xB, xC, yA, yB, yC; isso seria sem OO
		
		/*
		 * Detalhe importante também é que aqui estamos instanciando um objeto, quando declaramos a variável
		 * normalmente int, double, triangle, etc... estamos criando ela na parte stack da memória (criando objetos estáticos)
		 * e quando usamos o comando new, estamos instanciando, criando um novo objeto na parte heap da memória  
		 * (criando objetos dinâmicos, durante a execução), resultando em: a variável x conterá um endereço de memória
		 * do objeto criado no heap e não os dados do triângulo, ou seja, ela é uma referência.
		 */
		
		Triangle x,y; //usando OO
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		
		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();

	}

}

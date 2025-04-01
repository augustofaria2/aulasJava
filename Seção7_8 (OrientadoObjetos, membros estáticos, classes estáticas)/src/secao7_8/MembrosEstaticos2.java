package secao7_8;

import java.util.Scanner;

import entities.Calculator;

public class MembrosEstaticos2 {

	public static void main(String[] args) { //classe Calculator com membros de instância
		
		Calculator calc = new Calculator(); //tem que instanciar um objeto, pois a classe é estática e os métodos não são
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		sc.close();
	}

}

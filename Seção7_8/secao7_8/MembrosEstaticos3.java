package secao7_8;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculadora;

public class MembrosEstaticos3 {

	public static void main(String[] args) { //classe Calculator com método estático
		
		//Dessa forma não é mais necessário instanciar um objeto, basta chamar a classe e seu método
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculadora.circumference(radius);
		double v = Calculadora.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculadora.PI);
		
		sc.close();
	}

}

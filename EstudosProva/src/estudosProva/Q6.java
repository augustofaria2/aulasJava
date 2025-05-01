package estudosProva;

import java.util.Scanner;

import entitiesEstudosProva.Circulo;
import entitiesEstudosProva.Retangulo;

public class Q6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int escolha;
		
		System.out.print("1- Círculo   |   2- Retângulo: ");
		escolha = sc.nextInt();
		
		if(escolha == 1) {
			System.out.println("Raio: ");
			double raio = sc.nextDouble();
			Circulo circ = new Circulo(raio);
			
			System.out.println(circ.calcularArea());
			System.out.println(circ.calcularPerimetro());
		}else if(escolha == 2) {
			System.out.println("Altura: ");
			double altura = sc.nextDouble();
			System.out.println("Largura: ");
			double largura = sc.nextDouble();
			Retangulo ret = new Retangulo(altura, largura);
			
			System.out.println(ret.calcularArea());
			System.out.println(ret.calcularPerimetro());
		}
		sc.close();
	}

}

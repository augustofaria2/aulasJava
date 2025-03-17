package ListaExercicio1;
import java.util.Scanner;

public class ListaExercicio1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses números com uma mensagem explicativa
		 */
		
		int n1, n2, soma;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
		
	}

}

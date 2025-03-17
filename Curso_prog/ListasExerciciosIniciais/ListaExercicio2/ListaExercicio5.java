package ListaExercicio2;

import java.util.Scanner;

public class ListaExercicio5 {

	public static void main(String[] args) {
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 */
		
		int codigo, total = 0, quantidade = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o codigo: ");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		quantidade = sc.nextInt();
		
		
		switch(codigo) {
		case 1:
			total += quantidade * 4;
			break;
		case 2:
			total += quantidade * 4.50;
			break;
		case 3:
			total += quantidade * 5.00;
			break;
		case 4:
			total += quantidade * 2.00;
			break;
		case 5:
			total += quantidade * 1.50;
			break;
		default:
			System.out.println("Código inválido.");
			break;
		}
		System.out.println("TOTAL: R$ " + total + " reais.");
		
		sc.close();
	}

}

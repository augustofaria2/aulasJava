package listaExercicio3;

import java.util.Scanner;

public class ListaExercicio3 { //Classe sempre é M.M enquanto o resto é m.M (letra minuscula seguida de maiuscula)

	public static void main(String[] args) {
		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível, conforme exemplo.
		 */
		int cod, A = 0, G = 0, D = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Você abastece com qual combustível? ");
		System.out.println("1.Álcool	2.Gasolina	3.Diesel	4.Sair	");
		cod = sc.nextInt();
		
		while(cod != 4) {
			switch(cod) {
				case 1:
					A += 1;
					break;
				case 2:
					G += 1;
					break;
				case 3:
					D += 1;
					break;
				default:
					System.out.println("Código inválido... Digite um código válido.");
					break;
			}
			System.out.println("Você abastece com qual combustível? ");
			System.out.print("1.Álcool	2.Gasolina	3.Diesel	4.Sair	");
			cod = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + A);
		System.out.println("Gasolina: " + G);
		System.out.println("Diesel: " + D);
		
		sc.close();
	}

}

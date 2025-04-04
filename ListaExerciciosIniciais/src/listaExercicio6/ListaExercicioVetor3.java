package listaExercicio6;

import java.util.Locale;
import java.util.Scanner;

import entities6.Pessoa;

/*
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
 * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
 * bem como os nomes dessas pessoas caso houver.
 */

public class ListaExercicioVetor3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0.0;
		String nomesMenores = "";
		int menores16 = 0;
		
		System.out.println("Quantas pessoas são?");
		int n = sc.nextInt();
		
		Pessoa[] pessoa = new Pessoa[n];
		
		for(int i = 0; i < pessoa.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
			
            pessoa[i] = new Pessoa(nome, idade, altura);
            soma += pessoa[i].getAltura();
            
            if(pessoa[i].getIdade() < 16) {
            	menores16++;
            	nomesMenores += pessoa[i].getNome() + "\n";
            }
		}
		
		double alturaMedia = soma/ n;
        double percentualMenores = ((double) menores16 / n) * 100;

		System.out.printf("Media de altura: %.2f", alturaMedia);
		System.out.printf("Percentual de menores de 16 anos: %.2f%", percentualMenores);
		System.out.println();
		
		if (menores16 > 0) {
            System.out.println("Nomes das pessoas com menos de 16 anos:");
            System.out.print(nomesMenores);
        }
		
		sc.close();

	}

}

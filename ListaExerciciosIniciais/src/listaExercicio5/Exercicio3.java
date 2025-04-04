package listaExercicio5;

import java.util.Locale;
import java.util.Scanner;

import entities5.Estudante;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve
		 * nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro
		 * valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer
		 * também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo,
		 * quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é
		 * 60% da nota). Você deve criar uma classe Student para resolver este problema.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante x = new Estudante();
		
		System.out.print("Nome: ");
		x.nome = sc.nextLine();
		System.out.print("Nota primeiro trimestre: ");
		x.nota1 = sc.nextDouble();
		System.out.print("Nota segundo trimestre: ");
		x.nota2 = sc.nextDouble();
		System.out.print("Nota terceiro trimestre: ");
		x.nota3 = sc.nextDouble();
		
		System.out.printf("Nota Final: %.2f%n", x.notaFinal());
		
		if(x.notaFinal() < 60.0) {
			System.out.println("Falhou");
			System.out.printf("Faltou %.2f pontos%n", x.pontosFaltando());
		}else {
			System.out.println("Passou");
		}
		
		sc.close();
		
	}

}

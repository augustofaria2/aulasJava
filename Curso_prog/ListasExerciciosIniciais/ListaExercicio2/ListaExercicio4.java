package ListaExercicio2;

import java.util.Scanner;

public class ListaExercicio4 {

	public static void main(String[] args) {
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		int inicio, fim, duracao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial: ");
		inicio = sc.nextInt();
		System.out.println("Digite a hora final: ");
		fim = sc.nextInt();
		
		if(inicio >= fim){
			duracao = 24 - inicio + fim;
		}else{
			duracao = fim - inicio;
		}
			
		if(duracao >= 0 && duracao <= 24) {
			System.out.println("A duração do jogo foi de: " + duracao + " horas");
		}else {
			System.out.println("Valores inválidos.");
		}
		
		sc.close();
	}

}

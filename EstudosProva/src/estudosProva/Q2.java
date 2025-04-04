package estudosProva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitiesEstudosProva.Estudante;
import entitiesEstudosProva.Ingresso;
import entitiesEstudosProva.Vip;

public class Q2{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N;
		char ch; 
		double total = 0;
		
		System.out.print("Quantos ingressos? ");
		N = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Valor: ");
		double valor = sc.nextDouble();
		
		List<Ingresso> lista = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			System.out.print("Ingresso normal, vip ou estudante? (n/v/e) ");
			ch = sc.next().charAt(0);
			
			if(ch == 'n') {
				Ingresso ingresso = new Ingresso(valor);
				total += ingresso.getValor();
				lista.add(ingresso);
			}else if(ch == 'v') {
				double add = 2.50;
				Vip ingressoVip = new Vip(valor, add);
				total += ingressoVip.getNewValor();
				lista.add(ingressoVip);
			}else if(ch == 'e') {
				Estudante ingressoEstudante = new Estudante(valor);
				total += ingressoEstudante.getNewValor();
				lista.add(ingressoEstudante);
			}
		}
		
		for(Ingresso ing : lista) {
			System.out.println(ing.toString());
		}
		
		System.out.println(total);
		
		sc.close();
	}
}
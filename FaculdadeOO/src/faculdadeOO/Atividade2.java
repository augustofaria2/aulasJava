package faculdadeOO;

import java.util.Locale;
import java.util.Scanner;

import entitiesFaculdadeOO.Atividade2Estudante;
import entitiesFaculdadeOO.Atividade2Ingresso;
import entitiesFaculdadeOO.Atividade2Vip;

public class Atividade2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char ch;
		int i;
		double value;
		
		System.out.print("Digite o valor do ingresso: ");
		value = sc.nextDouble();
		
		Atividade2Ingresso ing = new Atividade2Ingresso(value);
		
		System.out.print("Normal, vip, estudante? (n, v, e) ");
		ch = sc.next().charAt(0);
		sc.nextLine();
		
		if(ch == 'n') {
			
			System.out.println("Valor do ingresso é: " + ing.toString());
			
		}else if(ch == 'v') {
			
			System.out.print("Digite o valor adicional: ");
			double additionalValue = sc.nextDouble();
			Atividade2Vip vip = new Atividade2Vip(value, additionalValue);
			System.out.println("Valor do ingresso é: " + vip.toString());
		
		}else if(ch == 'e') {
			
			Atividade2Estudante est = new Atividade2Estudante(value);
			System.out.println("Valor do ingresso é: " + est.toString());
			
		}
		
		sc.close();
	}

}

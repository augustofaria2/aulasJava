package secao10;

import java.util.Scanner;

import entities.Rent;

public class Aluguel {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		int i, n;
		
		System.out.print("Quantos quartos você quer alugar? ");
		n = sc.nextInt();
		
		for(i = 1; i <= n; i++) {
			System.out.println();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			vect[quarto] = new Rent(nome, email);
		}
		
		System.out.println("Quartos ocupados:");
		System.out.println();
		
		for (i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}

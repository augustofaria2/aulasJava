package secao13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pfisica;
import entities.Pjuridica;
import entities.TaxPayer;

public class ImpostoPago {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char ch;
		int N;
		double total = 0;
		
		System.out.print("Enter the number of tax payers: ");
		N = sc.nextInt();
		sc.nextLine();
		
		List <TaxPayer> lista = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				lista.add(new Pfisica (name, anualIncome, healthExpenditures));
				
			}else if(ch == 'c') {
				System.out.println("Number of employees: ");
				int numberEmployees = sc.nextInt();
				
				lista.add(new Pjuridica(name, anualIncome, numberEmployees));
			}
			
		}
		
		System.out.println("Taxas pagas:");
		
		for(TaxPayer tx : lista) {
			System.out.println(tx.getName() + ": " + String.format("%.2f", tx.imposto())); 
			total += tx.imposto();
		}
		
		System.out.println(String.format("%.2f", total));
		
		sc.close();
	}

}

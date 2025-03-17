package EstudosProva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitiesEstudosProva.ContaBancaria;
import entitiesEstudosProva.ContaCorrente;
import entitiesEstudosProva.ContaPoupanca;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ch;
		int N;
		
		List<ContaBancaria> lista = new ArrayList<>();
		
		System.out.print("Quantas contas vai criar? ");
		N = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < N; i++) {
			System.out.print("Conta corrente ou conta poupança? (c/p) ");
			ch = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Numero da conta: ");
			int numeroConta = sc.nextInt();
			sc.nextLine();
			System.out.print("Saldo atual: ");
			double saldo = sc.nextDouble();
			
			if(ch == 'c') {
				System.out.print("Taxa de manutenção: ");
				double taxaManutencao = sc.nextDouble();
				
				ContaCorrente contacorrente = new ContaCorrente();
				contacorrente.cadastrarTaxa(taxaManutencao);
				
				contacorrente.cadastrarConta(numeroConta, saldo, taxaManutencao);
				lista.add(contacorrente);
			}else if(ch == 'p') {
				System.out.print("Taxa de juros: ");
				double taxaJuros = sc.nextDouble();
				
				ContaPoupanca contapoupanca = new ContaPoupanca();
				contapoupanca.cadastrarJuros(taxaJuros);
				
				contapoupanca.cadastrarConta(numeroConta, saldo, taxaJuros);
				lista.add(contapoupanca);
			}
		}
		
		for(ContaBancaria conta : lista) {
			System.out.println(conta.toString());
		}
		
		sc.close();

	}

}

package secao9;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //altera a linguagem para inglês permitindo o uso de . ao inves de ,
		Scanner sc = new Scanner(System.in); //inicia meu scanner
		Banco conta; //instanciou um objeto do tipo banco (classe)
		
		//pede informações iniciais ao usuário e se ele tem um deposito inicial ao abrir a conta
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		//faz um if else para verificar se ele tem ou não depositos iniciais
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initDeposit = sc.nextDouble();
			conta = new Banco(accNumber, name, initDeposit); //se tiver usa o construtor com 3 parâmetros
		}else {
			conta = new Banco(accNumber, name); //se não tiver usa o construtor com 2 parâmetros
		}
		
		System.out.println("Detalhes da Conta: " + conta.toString()); //printa os detalhes da conta usando toString
		
		//método deposit
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		conta.deposit(depositValue);
		
		System.out.println("Detalhes da Conta: " + conta.toString());
		
		//método withdraw
		System.out.print("Enter a withdraw value: ");
		depositValue = sc.nextDouble();
		conta.withdraw(depositValue);
		
		System.out.println("Detalhes da Conta: " + conta.toString());
		
		sc.close(); //fecha meu scanner

	}

}

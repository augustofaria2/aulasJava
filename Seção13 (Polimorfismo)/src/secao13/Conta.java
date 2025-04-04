package secao13;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

/*
 * Relação "é-um"
 * Generalização (superclasse) /especialização (subclasse)
 * Superclasse (classe base) / subclasse (classe derivada)
 * Herança / extensão
 * Herança é uma associação entre classes (e não entre objetos)
 */

public class Conta {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0); //superclasse
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0); //subclasse
		
		// UPCASTING
		Account acc1 = bacc; //subclasse é uma account, então pode ser atribuido a um obj do tipo account
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);//atribui obj da subclasse para superclasse
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);//atribui obj da subclasse para superclasse
		
		/*
		 * Basicamente pega um obj de alguma subclasse e atribui para uma variável da superclasse
		 */
		
		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2; /*não se pode converter um obj do tipo Account (acc2) para
		um de BusinessAccount (acc4), apenas de maneira manual igual aqui, fazendo o downcasting da superclasse 
		para subclasse */
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3; Para não ocorrer esse erro, basta usar instanceof
		if (acc3 instanceof BusinessAccount) {//verifica primeiro se o acc3 é uma instancia de BusinessAccount
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {//verifica primeiro se o acc3 é uma instancia de SavingsAccount
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		//OVERRIDE
		Account acc6 = new Account(1001, "Alex", 1000.0);
		
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance()); //Retorna 795.0
		
		Account acc7 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());//Retorna 800.0
		
		Account acc8 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());//Retorna 793.0
		
		/*
		 * polimorfismo é recurso que permite que variáveis de um mesmo tipo mais genérico 
		 * possam apontar para objetos de tipos específicos diferentes, tendo assim
		 * comportamentos diferentes conforme cada tipo específico.
		 */
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		/*
		 * A associação do tipo específico com o tipo genérico é feita em tempo de execução (upcasting).
		 * O compilador não sabe para qual tipo específico a chamada do método Withdraw 
		 * está sendo feita (ele só sabe que são duas variáveis tipo Account).
		 */
	}

}
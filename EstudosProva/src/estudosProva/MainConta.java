package estudosProva;

import java.util.Scanner;

import entitiesEstudosProva.Conta;

public class MainConta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Conta conta = new Conta();
		
		try {
			System.out.println("Digite o valor a ser depositado na conta: ");
			double valor = sc.nextDouble();
			conta.deposita(valor);
		}catch(IllegalArgumentException e){
			System.out.println("Valor inválido.");
		}finally {
			System.out.println("Saldo: " + conta.saldo);
			sc.close();
		}	
	}
}

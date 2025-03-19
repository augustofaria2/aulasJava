package FaculdadeOO;

import entitiesFaculdadeOO.ContaComum;
import entitiesFaculdadeOO.ContaEspecial;
import entitiesFaculdadeOO.ContaCorrente;

/*
 * Atividade de Augusto de Faria Pereira (12411BSI261) e Cauã Gozzer de Moraes Carbonell (12311BSI259)
 */

public class Banco {

	public static void main(String[] args) {
		ContaCorrente conta1Especial = new ContaEspecial(1350, 123, 456, 500);
		ContaCorrente conta2Especial = new ContaEspecial(600, 456, 789, 0).verificarConta(); //Transforma a conta em comum
		ContaCorrente conta3Comum = new ContaComum(300, 789, 101112);						 //se limite = 0

		System.out.println("Saldo inicial conta 1 (ESPECIAL): " + conta1Especial.getSaldo(456));
		System.out.println("========================================");
		conta1Especial.debitaValor(1850);
		System.out.println("Saldo após débito conta 1 (ESPECIAL): " + conta1Especial.getSaldo(456));
		System.out.println("Estado conta 1 (ESPECIAL): " + ((ContaEspecial) conta1Especial).getEstado(456)); //casting 
		conta1Especial.creditaValor(456, 500);
		System.out.println("Saldo após crédito conta 1 (ESPECIAL): " + conta1Especial.getSaldo(456));
		System.out.println("Estado conta 1 (ESPECIAL): " + ((ContaEspecial) conta1Especial).getEstado(456)); //casting 
		
		System.out.println();

		System.out.println("Saldo inicial conta 2 (ESPECIAL, AGORA COMUM): " + conta2Especial.getSaldo(789));
		System.out.println("========================================");
		conta2Especial.debitaValor(600);
		System.out.println("Saldo após débito conta 2 (COMUM): " + conta2Especial.getSaldo(789));
		System.out.println("Estado conta 2 (COMUM): " + ((ContaComum) conta2Especial).getEstado(789)); //casting 
		conta2Especial.creditaValor(789, 100);
		System.out.println("Saldo após débito conta 2 (COMUM): " + conta2Especial.getSaldo(789));
		System.out.println("Estado conta 2 (COMUM): " + ((ContaComum) conta2Especial).getEstado(789)); //casting 
		 
		System.out.println();
		
		System.out.println("Saldo inicial conta 3 (COMUM): " + conta3Comum.getSaldo(101112));
		System.out.println("========================================");
		conta3Comum.debitaValor(200);
		System.out.println("Saldo após débito conta 3 (COMUM): " + conta3Comum.getSaldo(101112));
		System.out.println("Estado conta 3 (COMUM): " + ((ContaComum) conta3Comum).getEstado(101112)); //casting 
		conta3Comum.creditaValor(101112, 400);
		System.out.println("Saldo após débito conta 3 (COMUM): " + conta3Comum.getSaldo(101112));
		System.out.println("Estado conta 3 (COMUM): " + ((ContaComum) conta3Comum).getEstado(101112)); //casting 
		
	}
}

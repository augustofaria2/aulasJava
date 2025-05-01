package estudosProva;

import java.util.Scanner;

import entitiesEstudosProva.CalculadoraCientifica;

/*
 * Crie uma classe calculadora. Esta classe deve ser abstrata e implementar métodos abstratos que representem 
 * as operações básicas (soma, subtração, divisão e multiplicação). Utilizando o conceito de herança crie uma classe 
 * chamada calculadora científica que implementa os seguintes cálculos: raiz quadrada e a potência. 
 * Dica utilize a classe Math do pacote java.lang.
 */

public class Q5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a, b, resultado;
		CalculadoraCientifica calc = new CalculadoraCientifica();
		int escolha = 1;
		
		while(escolha != 0) {
			System.out.println("Quer realizar qual operação? ");
			System.out.print("1- soma\n2- subtração\n3- divisão\n4- multiplicação\n5- raiz quadrada\n6- potência\n0-Sair: ");
			escolha = sc.nextInt();
			switch (escolha) {
		    case 1:
		        System.out.println("Você escolheu soma: ");
		        System.out.println("Digite o valor de A + B para somar: ");
		        System.out.println("A: ");
		        a = sc.nextInt();
		        System.out.println("B: ");
		        b = sc.nextInt();
		        resultado = calc.soma(a, b);
		        System.out.println(resultado);
		        break;
		    case 2:
		        System.out.println("Você escolheu subtração: ");
		        System.out.println("Digite o valor de A - B para subtrair: ");
		        System.out.println("A: ");
		        a = sc.nextInt();
		        System.out.println("B: ");
		        b = sc.nextInt();
		        resultado = calc.subtracao(a, b);
		        System.out.println(resultado);
		        break;
		    case 3:
		        System.out.println("Você escolheu divisão: ");
		        System.out.println("Digite o valor de A / B para dividir: ");
		        System.out.println("A: ");
		        a = sc.nextInt();
		        System.out.println("B: ");
		        b = sc.nextInt();
		        resultado = calc.divisao(a, b);
		        System.out.println(resultado);
		        break;
		    case 4: 
		    	System.out.println("Você escolheu multiplicação: ");
		    	System.out.println("Digite o valor de A * B para multiplicar: ");
		        System.out.println("A: ");
		        a = sc.nextInt();
		        System.out.println("B: ");
		        b = sc.nextInt();
		        resultado = calc.multiplicacao(a, b);
		        System.out.println(resultado);
		    	break;
		    case 5: 
		    	System.out.println("Você escolheu raiz quadrada: ");
		    	System.out.println("Digite o valor: ");
		        a = sc.nextInt();
		        resultado = calc.raizQuadrada(a);
		        System.out.println(resultado);
		    	break;
		    case 6: 
		    	System.out.println("Você escolheu potência: ");
		    	System.out.println("Digite o valor de A elevado a B para fazer a potência: ");
		        System.out.println("A: ");
		        a = sc.nextInt();
		        System.out.println("B: ");
		        b = sc.nextInt();
		        resultado = calc.potencia(a, b);
		        System.out.println(resultado);
		    	break;
			}
			
		}
		
		sc.close();
	}

}

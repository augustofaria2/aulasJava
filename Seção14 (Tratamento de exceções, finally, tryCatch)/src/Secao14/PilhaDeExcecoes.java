package Secao14;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Por padrão o java quando um erro não é tratado, ele automaticamente finaliza o programa
 *puxando o printStackTrace pra te mostrar onde está ocorrendo o erro*/

public class PilhaDeExcecoes {

	public static void main(String[] args) {
		method1(); //função que chama a função method2
		System.out.println("End of program");
	}
	
	/*Erro é falha do sistemas (não é tratado pelo usuário), enquanto exceção é falha de
	 *programação (tratavél pelo usuário). */
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2(); //função principal que gera o vetor e tem o try-catch para tratamento de exceções
		System.out.println("***METHOD1 END***");
	}

	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace(); //mostra o tipo da exceção, a mensagem da exceção e a sequência
			sc.next();			 //de chamadas que gerou a exceção e permite continuar o programa
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		sc.close();
		System.out.println("***METHOD2 END***");
	}
}

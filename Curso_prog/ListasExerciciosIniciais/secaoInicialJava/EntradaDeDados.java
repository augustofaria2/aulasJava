package secaoInicialJava;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		 * String x; 
		 * x = sc.next(); 
		 * System.out.println("Você digitou: " + x);
		 */

		/*
		 * int x; 
		 * x = sc.nextInt(); 
		 * System.out.println("Você digitou: " + x);
		 */

		/*
		 * double x;			//caso queira usar ponto, tem que colocar
		 * x = sc.nextDouble();   "Locale.setDefault(Locale.US);" antes do Scanner
		 * System.out.println("Você digitou: " + x); 	 
		 */

		/*
		 * char x; x = sc.next().charAt(0); //pega apenas a primeira letra que você digitou
		 * System.out.println("Você digitou: " + x);
		 */

		/*
		 * String x; 
		 * int y; 
		 * double z;
		 * x = sc.next(); 
		 * y = sc.nextInt(); 
		 * z = sc.nextDouble();
		 * System.out.println("Dados digitados: "); 
		 * System.out.println(x);
		 * System.out.println(y); 
		 * System.out.println(z);
		 */

		/*
		 * String s1, s2, s3; 
		 * s1 = sc.nextLine(); //next sozinho lê apenas a primeira palavra, 
		 * s2 = sc.nextLine();   nextLine lê a linha toda até o ENTER
		 * s3 = sc.nextLine();
		 * System.out.println("DADOS DIGITADOS:");
		 * System.out.println(s1); 
		 * System.out.println(s2); 
		 * System.out.println(s3);
		 */
		
		/*
		 * int x; 
		 * String s1, s2, s3; 
		 * x = sc.nextInt(); //Quando você usa um comando de leitura diferente do nextLine() 
		 * sc.nextLine();	   e dá alguma quebra de linha (ENTER), essa quebra de linha fica  			
		 * s1 = sc.nextLine(); "pendente" na entrada padrão.
		 * s2 = sc.nextLine(); //Solução: Faça um nextLine() extra antes de fazer 
		 * s3 = sc.nextLine(); 	 o nextLine() de seu interesse.
		 * System.out.println("DADOS DIGITADOS:");
		 * System.out.println(x); 
		 * System.out.println(s1); 
		 * System.out.println(s2);
		 * System.out.println(s3);
		 */
		
		/*
		 * double x = 3.0; 
		 * double y = 4.0; 
		 * double z = -5.0; 
		 * double a = 4; 
		 * double b = 2;
		 * double c = -6; 
		 * double A, B, C, delta, x1, x2; 
		 * A = Math.sqrt(x); //Variável A recebe a raiz quadrada de x 
		 * B = Math.sqrt(y); 
		 * C = Math.sqrt(25.0);
		 * System.out.println("Raiz quadrada de " + x + " = " + A);
		 * System.out.println("Raiz quadrada de " + y + " = " + B);
		 * System.out.println("Raiz quadrada de 25 = " + C); 
		 * A = Math.pow(x, y); //Variável A recebe o resultado de x elevado a y 
		 * B = Math.pow(x, 2.0); 
		 * C = Math.pow(5.0, 2.0); 
		 * System.out.println(x + " elevado a " + y + " = " + A);
		 * System.out.println(x + " elevado ao quadrado = " + B);
		 * System.out.println("5 elevado ao quadrado = " + C); 
		 * A = Math.abs(y); //Variável A recebe o valor absoluto de x 
		 * B = Math.abs(z);
		 * System.out.println("Valor absoluto de " + y + " = " + A);
		 * System.out.println("Valor absoluto de " + z + " = " + B); 
		 * delta = Math.pow(b,2.0) - 4*a*c; //Incluindo funções em expressões maiores 
		 * x1 = (-b + Math.sqrt(delta)) / (2.0 * a); 
		 * x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		 * System.out.println("x1 = " + x1); 
		 * System.out.println("x2 = " + x2);
		 */

		sc.close();
	}

}

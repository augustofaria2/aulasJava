package Secao9;

/*
 * É uma operação especial da classe, que executa no momento da
 * instanciação do objeto
 */

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

/*
 * Usos do construtor:
 * 1- Iniciar valores dos atributos.
 * 2- Permitir ou obrigar que o objeto receba dados / dependências no momento de sua
 * instanciação (injeção de dependência).
 */

public class Construtores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Aqui iniciariamos com seus atributos vazios, string recebe NULL e double/int recebe 0.
		Product2 product = new Product2(); 	Se um construtor customizado não for especificado, a classe disponibiliza o
										    construtor padrão: Product p = new Product(); */
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String nome = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		/*Construtor com parâmetros: Product2 product = new Product2(nome, price, quantity); Aqui podemos passar 
		 * direto os parametros também na hora da criação. Ex: ("Tv", 1500.0, 3)*/
		
		Product2 product = new Product2(nome, price);/*Sobrecarga, basicamente a diferença entre esse construtor e o 
													   outro é a quantidade de parâmetros */
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}
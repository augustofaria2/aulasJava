package Secao9;

import java.util.Locale;
import java.util.Scanner;

import entities.PrivateProduct;


public class Construtores2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); /*Quando alocamos (new) qualquer tipo estruturado (classe ou array),
											   são atribuídos valores padrão aos seus elementos, 0, Null, false*/
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String nome = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		
		PrivateProduct product = new PrivateProduct(nome, price);
		
		/*
		 * product.nome = "Computer"; O compilador não vai permitir o acesso, pois agora o atributo nome
		 * é private, porém basta acrescentar um método para isso e chamá-lo (set).
		 */
		
		product.setName("Computer"); /* Encapsulamento: um princípio que consiste em esconder detalhes de 
									  * implementação de uma classe, expondo apenas operações seguras e que
									  * mantenham os objetos em um estado consistente. */
		
		/* System.out.println("Novo nome: " + product.nome); Também da erro, pois o atributo é private, por isso
		 * chama-se o método get.
		 */
		
		System.out.println("Novo nome: " + product.getName());
		
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
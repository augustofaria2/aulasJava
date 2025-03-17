package secao7_8;
import java.util.Locale;
import java.util.Scanner;

import entities.Product; //também são do tipo object

public class ProgramaComOO { 

	public static void main(String[] args) {
		
		int quantity;
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Product /*tipo product, também tipo object*/ product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.nome = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();
		
		//System.out.println(product.nome + ", " + product.price + ", " + product.quantity);
		System.out.println();
		System.out.println("Data: " + product);
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
		System.out.println();
		
		sc.close();

	}

}

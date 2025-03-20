package Secao13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProductPolimorfismo;
import entities.ProductPolimorfismo;
import entities.UsedProductPolimorfismo;

/*
 * Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final,
 * mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.
 * Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e
 * produtos usados possuem data de fabricação. Estes dados específicos devem ser
 * acrescentados na etiqueta de preço conforme exemplo (próxima página). Para produtos
 * importados, a taxa e alfândega deve ser acrescentada ao preço final do produto.
 */

public class Polimorfismo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		char ch;
		String name;
		double price, fee;
		
		
		List<ProductPolimorfismo> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++) {
			sc.nextLine();
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			ch = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Price: ");
			price = sc.nextDouble();
			
			if(ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProductPolimorfismo(name, price, date));
			}else if(ch == 'i') {
				System.out.print("Customs fee: ");
				fee = sc.nextDouble();
				list.add(new ImportedProductPolimorfismo(name, price, fee));
			}else {
				list.add(new ProductPolimorfismo(name, price));
			}
		}	
		System.out.println("Price Tags:"); 
		for (ProductPolimorfismo prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}
package Secao13;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Func;
import entities.FuncDeFora;

public class Funcionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int f, i, hours;
		String name;
		double valuePerHour, additionalCharge;
		char outsourced;
		
		List<Func> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		f = sc.nextInt();
		
		for(i=1;i<=f;i++) {
			sc.nextLine();
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced? (y/n) ");
			outsourced = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Hours: ");
			hours = sc.nextInt();
			System.out.print("Value per hour: ");
			valuePerHour = sc.nextDouble();
			if(outsourced == 'y') {
				System.out.print("Additional charge: ");
				additionalCharge = sc.nextDouble();
				list.add(new FuncDeFora(name, hours, valuePerHour, additionalCharge));
			}else {
				list.add(new Func(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("Payments:");
		for (Func func : list) { //para cada funcionario da minha lista func
			System.out.println(func.toString());
		}
		sc.close();
	}

}

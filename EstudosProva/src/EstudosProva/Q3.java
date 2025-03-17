package  EstudosProva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitiesEstudosProva.Carro;
import entitiesEstudosProva.Moto;
import entitiesEstudosProva.Veiculo;

public class Q3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char ch;

		List<Veiculo> lista = new ArrayList<>();
		
		for (int i = 0; i < 2; i++) {
			System.out.print("Carro ou moto? (c/m) ");
			ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Marca: ");
			String marca = sc.nextLine();
			System.out.print("Modelo: ");
			String modelo = sc.nextLine();
			System.out.print("Ano: ");
			int ano = sc.nextInt();
			sc.nextLine();

			if (ch == 'c') {
				System.out.print("Quantidade de Portas: ");
				int quantidadePortas = sc.nextInt();
				sc.nextLine();

				Carro carro = new Carro();
				carro.cadastrarCarro(marca, modelo, ano, quantidadePortas);
				
				lista.add(carro);
			} else if (ch == 'm') {
				System.out.print("Cilindradas: ");
				int cilindradas = sc.nextInt();
				sc.nextLine();

				Moto moto = new Moto();
				moto.cadastrarMoto(marca, modelo, ano, cilindradas);
				
				lista.add(moto);
			}
		}
		
		for(Veiculo x : lista) {
			System.out.println(x.toString());
		}

		sc.close();
	}
}

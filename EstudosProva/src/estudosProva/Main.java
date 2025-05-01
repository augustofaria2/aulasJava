package estudosProva;

import java.util.ArrayList;
import java.util.Scanner;

import entitiesEstudosProva.Caminhao;
import entitiesEstudosProva.CarroPasseio;
import entitiesEstudosProva.Veiculo1;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList <Veiculo1> veiculos = new ArrayList<>();
		
		System.out.print("Quantos veiculos quer cadastrar: ");
		int quant = sc.nextInt();
		
		for(int i = 0; i < quant; i++) {
			System.out.print("(1) Carro de passeio e (2) Caminhão: ");
			int tipo = sc.nextInt();
			
			if(tipo == 1) {
				CarroPasseio carro = new CarroPasseio();
				carro.setCarroPasseio();
				veiculos.add(carro);
			}else if(tipo == 2) {
				Caminhao caminhao = new Caminhao();
				caminhao.setCaminhao();
				veiculos.add(caminhao);
			}
		}
		
		for (Veiculo1 veiculo : veiculos) {
			System.out.println(veiculo);
			System.out.println();
		}
		
		sc.close();
	}
}

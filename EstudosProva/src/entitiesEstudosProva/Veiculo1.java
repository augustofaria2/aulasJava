package entitiesEstudosProva;

import java.util.Scanner;

public class Veiculo1 {
	public int peso;
	public int velocMax;
	public float preco;
	
	public Veiculo1() {
		this.peso = 0;
		this.velocMax = 0;
		this.preco = 0;
	}
	
	public Veiculo1(int peso, int velocMax, float preco) {
		this.peso = peso;
		this.velocMax = velocMax;
		this.preco = preco;
	}
	
	public void setVeiculo1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o peso do veiculo: ");
		peso = sc.nextInt();
		System.out.println("Digite a velocidade maxima: ");
		velocMax = sc.nextInt();
		System.out.println("Digite o preço do veiculo: ");
		preco = sc.nextFloat();
	}
	
	@Override
	public String toString() {
		return "Peso: "
				+ peso
				+ " kg, velocidade: "
				+ velocMax
				+ " km/h, preço: "
				+ preco
				+ " reais";
	}
}

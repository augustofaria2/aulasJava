package entitiesEstudosProva;

import java.util.Scanner;

public class Caminhao extends Veiculo1{
	public Motor motor;
	public int toneladas;
	public int alturaMax;
	public int comprimento;
	
	public Caminhao() {
		super();
		motor = new Motor();
		this.toneladas = 0;
		this.alturaMax = 0;
		this.comprimento = 0;
	}
	
	public Caminhao(int peso, int velocMax, float preco, int numCilindro, int potenci, int toneladas, int alturaMax, int comprimento) {
		super(peso, velocMax, preco);
		motor = new Motor(numCilindro, potenci);
		this.toneladas = toneladas;
		this.alturaMax = alturaMax;
		this.comprimento = comprimento;
	}
	
	public void setCaminhao() {
		super.setVeiculo1();
		motor.setMotor();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a carga máxima: ");
		toneladas = sc.nextInt();
		System.out.println("Digite a altura maxima: ");
		alturaMax = sc.nextInt();
		System.out.println("Digite o comprimento: ");
		comprimento = sc.nextInt();
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ motor.toString()
				+ " Carga máxima: "
				+ toneladas
				+ " toneladas, altura máxima: "
				+ alturaMax
				+ " , comprimento: "
				+ comprimento;
	}
}

package entitiesEstudosProva;

import java.util.Scanner;

public class CarroPasseio extends Veiculo1{
	public Motor motor;
	public String cor;
	public String modelo;
	
	public CarroPasseio() {
		super();
		motor = new Motor();
		this.modelo = "";
		this.cor = "";
	}
	
	public CarroPasseio(int peso, int velocMax, float preco, int numCilindro, int potenci, String cor, String modelo) {
		super(peso, velocMax, preco);
		motor = new Motor(numCilindro, potenci);
		this.cor = cor;
		this.modelo = modelo;
	}
	
	public void setCarroPasseio() {
		super.setVeiculo1();
		motor.setMotor();
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		System.out.println("Digite a cor: ");
		cor = sc.nextLine();
		System.out.println("Digite o modelo: ");
		modelo = sc.nextLine();
	}
	
	@Override
	public String toString() {
		return super.toString()
			   + motor.toString()
			   + "Cor: "
			   + cor
			   + " , modelo: "
			   + modelo;	
	}
}	

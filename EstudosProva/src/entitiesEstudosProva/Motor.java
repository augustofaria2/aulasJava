package entitiesEstudosProva;

import java.util.Scanner;

public class Motor {
	public int numCilindro;
	public int potenci;
	
	public Motor() {
		this.numCilindro = 0;
		this.potenci = 0;
	}
	
	public Motor(int numCilindro, int potenci) {
		this.numCilindro = numCilindro;
		this.potenci = potenci;
	}
	
	public void setMotor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero de cilindros: ");
		numCilindro = sc.nextInt();
		System.out.println("Digite a potencia: ");
		potenci = sc.nextInt();
	}
	
	@Override
	public String toString() {
		return "Numero de cilindros: "
				+ numCilindro
				+ " , potencia: "
				+ potenci
				+ " cv";
	}
}

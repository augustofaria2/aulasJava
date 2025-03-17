package ListaExercicio1;

import java.util.Scanner;

public class ListaExercicio6 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre: 
		 * a) a área do triângulo retângulo que tem A por base e C por altura. 
		 * b) a área do círculo de raio C.(pi = 3.14159) 
		 * c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B. 
		 * e) a área do retângulo que tem lados A e B.
		 */
		
		float A, B, C;
		double areaTri, areaCirc, areaTra, areaQuad, areaRet;
		double pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextFloat();
		System.out.println("Digite o valor de B: ");
		B = sc.nextFloat();
		System.out.println("Digite o valor de C: ");
		C = sc.nextFloat();
		
		areaTri = (A * C) / 2;
		areaCirc = Math.pow(C, 2) * pi;
		areaTra = (A + B) / 2 * C;
		areaQuad = Math.pow(B, 2);
		areaRet = A * B;
		
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", 
						   areaTri,areaCirc, areaTra, areaQuad, areaRet);
		
		sc.close();
	}

}

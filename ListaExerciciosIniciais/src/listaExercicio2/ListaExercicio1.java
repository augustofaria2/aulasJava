package listaExercicio2;

import java.util.Scanner;

public class ListaExercicio1 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
		 * negativo ou não.
		 */
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		n = sc.nextInt();
		
		if(n >= 0) { 
			System.out.println("O número digitado é positivo.");
		}else {
			System.out.println("O número digitado é negativo.");
		}
		
		sc.close();

		
		/*CRTL SHIFT B LIGA O TOGGLE BREAKPOINT NA LINHA, BASTA RODAR O PROGRAMA NORMAL E ELE VAI ALTERAR PRO 
		 *DEBUG MODE QUANDO CHEGAR NESSA LINHA, AI BASTA IR APERTANDO F6 PARA PROSSEGUIR COM O CÓDIGO, DE MODO
		 *QUE PODEMOS ACOMPANHAR O PASSO A PASSO DAS MUDANÇAS DO CÓDIGO. PARA TIRAR O BREAKPOINT BASTA APERTAR 
		 *NOVAMENTE CRTL SHIFT B NA LINHA QUE ESTÁ COM ELE. (É ESSA BOLINHA AZUL DO LADO DO IF). 
		 *PARA TIRAR DO MODO DEBUG TAMBÉM BASTA IR EM WINDOW, PERSPECTIVE, OPEN PERSPECTIVE, JAVA.
		 */
	}

}

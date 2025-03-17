package secaoInicialJava;
import java.util.Scanner;

public class ExercicioSwitchCase {

	public static void main(String[] args) {
		
		String dia;
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7.");
		x = sc.nextInt();
		
		switch(x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor inválido.";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}

}

package estudosProva;

import java.util.Scanner;

import entitiesEstudosProva.NumerosIguaisException;
import entitiesEstudosProva.NumerosNegativosException;
import entitiesEstudosProva.SegundoNumeroIgualZeroException;
import entitiesEstudosProva.TestandoNumeros;

public class MainNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		
		try {
			System.out.println("Digite o valor de A: ");
			a = sc.nextInt();
			System.out.println("Digite o valor de B: ");
			b = sc.nextInt();
			TestandoNumeros.teste(a, b);
		}catch(NumerosIguaisException e) {
			System.out.println("ERRO: " + e.getMessage());
		}catch(SegundoNumeroIgualZeroException e) {
			System.out.println("ERRO: " + e.getMessage());
		}catch(NumerosNegativosException e) {
			System.out.println("ERRO: " + e.getMessage());
		}finally {
			System.out.println("Valor de A: " + a + "\nValor de B: " + b);
			sc.close();
		}

	}
}

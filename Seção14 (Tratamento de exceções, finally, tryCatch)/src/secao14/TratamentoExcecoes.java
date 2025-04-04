package secao14;

import java.util.Scanner;

public class TratamentoExcecoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		
		System.out.println("End of program"); //A ideia aqui é continuar o programa mesmo depois do erro
		sc.close();
		
		/*Nesse caso, se na hora que ele pedir um inteiro, eu colocar um valor fora do tamanho do meu
		 *vetor vai dar um erro: ArrayIndexOutOfBoundsException, e se eu tentar colocar 
		 *algo diferente de um inteiro, esse: InputMismatchException.*/
	}

}

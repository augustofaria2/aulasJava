package secao14;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Para tratar o erro e continuar o programa usamos try-catch, que basicamente ao ocorrer um erro no try
 *captura o erro por meio do catch e trata ele enviando uma mensagem indicando o erro e 
 *continua o programa */

public class TryCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		System.out.println("End of program");
		sc.close();
	}
}
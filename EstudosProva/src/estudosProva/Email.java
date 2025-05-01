package estudosProva;

import java.util.Scanner;

import entitiesEstudosProva.EmailNaoContemArrobaException;
import entitiesEstudosProva.EmailNaoContemPontoComException;
import entitiesEstudosProva.ValidarEmail;

public class Email {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email = "";
		
		try{
			System.out.println("Digite o email: ");
			email = sc.nextLine();
			ValidarEmail.validar(email);
		}catch(EmailNaoContemArrobaException e) {
			System.out.println("ERRO: " + e.getMessage());
		}catch(EmailNaoContemPontoComException e) {
			System.out.println("ERRO: " + e.getMessage());
		}finally {
			System.out.println("Email digitado: " + email);
			sc.close();
		}
		
	}
}
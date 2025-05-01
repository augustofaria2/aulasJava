package entitiesEstudosProva;

public class ValidarEmail {
	
	public static void validar(String email) {
		if(!email.contains("@")) {
			throw new EmailNaoContemArrobaException("Precisa de @");
		}
		if(!email.contains(".com")) {
			throw new EmailNaoContemPontoComException("Precisa de .com");
		}
	}
}

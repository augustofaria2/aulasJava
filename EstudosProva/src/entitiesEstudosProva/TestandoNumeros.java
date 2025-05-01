package entitiesEstudosProva;

public class TestandoNumeros {
	
	public static void teste(int a, int b) throws NumerosNegativosException {
		
		if(a == b) {
			throw new NumerosIguaisException("Numeros são iguais.");
		}
		if(b == 0) {
			throw new SegundoNumeroIgualZeroException("Segundo número é igual a 0.");
		}
		if(a < 0 && b < 0) {
			throw new NumerosNegativosException("Ambos são negativos ao mesmo tempo.");
		}
	}
}

package secao10;

public class TipoClasseObjeto {

	public static void main(String[] args) {
		
		int x = 20;
		Object obj = x; /*Boxing: é o processo de conversão de um objeto tipo valor 
						  para um objeto tipo referência compatível*/
		System.out.println(obj);
		
		int y = (int) obj; /*Unboxing: é o processo de conversão de um objeto tipo referência 
							 para um objeto tipo valor compatível */
		System.out.println(y);

		/*
		 * Wrapper classes: são classes equivalentes aos tipos primitivos (Object)
		 * 
		 * Byte = byte	 Short = short	 Integer = int	 Long = long	Float = float	Double = double
		 * 
		 * Boolean = boolean	Character = char
		 */
		
	}

}

package secaoInicialJava;

public class FuncoesString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG	";
		String s = "potato apple lemon orange";
		
		String s01 = original.toLowerCase(); //transforma toda a string em letras minusculas	
		String s02 = original.toUpperCase(); //transforma toda a string em letras maiusculas
		String s03 = original.trim(); //elimina espaços em branco na string
		String s04 = original.substring(2); //inicia uma nova string a partir da posição colocada
		String s05 = original.substring(2, 9); //recorta a string a partir do primeiro parâmetro e para no segundo parâmetro
		String s06 = original.replace('a', 'x'); //troca a letra passada no primeiro parâmetro pela do segundo parâmetro
		String s07 = original.replace("abc", "xy"); 
		int i = original.indexOf("bc"); //encontra a posição da primeira ocorrência dessa sequência
		int j = original.lastIndexOf("bc"); //encontra a posição da última ocorrência dessa sequência
		String[] vect = s.split(" "); //separa a string original em partes
				
		System.out.println("Original: " + original);
		System.out.println("toLowerCase: " + s01);
		System.out.println("toUpperCase: " + s02);
		System.out.println("trim: " + s03);
		System.out.println("substring(2): " + s04); //começa agora na letra 'c', exclui a 'ab'
		System.out.println("substring(2, 9): " + s05); //começa na letra 'c', termina na letra 'I'
		System.out.println("replace('a', 'x'): " + s06); //substitui todo 'a' por 'x'
		System.out.println("replace('abc', 'xy'): " + s07); //substitui todo 'abc' por 'xy'
		System.out.println("indexOf('bc'): " + i); //i deve valer 1, já q a ocorrência é depois de 'a' que está na posição 0
		System.out.println("lastIndexOf('bc'): " + j); //j deve valer 17
		System.out.println(vect[0] + " ---- " + vect[1] + " ---- " + vect[2] + " ---- " + vect[3]);
		
	}

}

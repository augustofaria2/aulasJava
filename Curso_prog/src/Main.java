import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		
		System.out.print("Olá mundo!");  //print => mostra sem fazer a quebra de linha depois
		
		System.out.println(y); //println => mostra fazendo a quebra de linha em seguida
		System.out.println(x);
		
		System.out.printf("%.2f%n", x); //mostra sem quebrar a linha e precisa passar o elemento que deve ser mostrado
		System.out.printf("%.4f%n", x); //igual em C
		
		Locale.setDefault(Locale.US); //muda a linguagem do programa
		System.out.printf("%.4f%n", x); //.Numero serve para especificar quantos numeros queremos após a vírgula
		System.out.println("RESULTADO = " + x + " METROS"); //junta as duas frases
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais por mês.%n", nome, idade, renda);
	}

}

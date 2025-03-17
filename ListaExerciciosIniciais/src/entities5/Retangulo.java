package entities5;

public class Retangulo { /*variáveis do tipo da classe não devem ser entendidas como caixas, mas sim
						   ponteiros na stack para caixas no heap. Além disso, também aceitam NULL, ou seja,
						   a varíavel não aponta para nenhum lugar.*/
	public double a;
	public double b;
	
	public double area() {
		return a * b;
	}
	
	public double perimetro() {
		return (a + b) * 2;
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
	}
}

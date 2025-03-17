package entities; //pacote da classe

public class Triangle { //é a definição do tipo, nome da classe
	
	public double a; //são os atributos da classe, instâncias da classe
	public double b; //public, indica que os atributos ou métodos podem ser utilizados em outros arquivos
	public double c;
	
	//area =  nome do método
	public double area(/*lista de parâmetros*/) { //tipo de dado que o método retorna, se não retorna nada, coloca void
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}

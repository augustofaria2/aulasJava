package entitiesEstudosProva;

/*
Empregado deve ser classe abstrata, conter atributos nome e
sobrenome, e conter método abstrato retornarSalario (este deve
retornar o salário de acordo com o cálculo especíco por tipo de
empregado)
*/

public abstract class Empregado {
	public String nome;
	public String sobrenome;
	
	public abstract double retornarSalario();
}

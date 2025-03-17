package entities5;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public void aumentoDeSalario(double porcentagem){
		double x = (porcentagem/100) * salarioBruto;
		salarioBruto += x;
	}
}

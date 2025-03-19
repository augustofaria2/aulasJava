package entities;

public class Product2 {
	
	public String nome; //o membro é acessado por todas classes (ao menos que ele resida em
	public double price;//um módulo diferente que não exporte o pacote onde ele está).
	public int quantity;
	
	/*
	 * Normalmente se coloca o construtor aqui, depois dos atributos, mas antes dos métodos
	 */
	
	public Product2(String nome, double price, int quantity) {
		this.nome = nome; /* É uma referência para o próprio objeto. Usos comuns:
						   * 1- Diferenciar atributos de variáveis locais
						   * 2- Passar o próprio objeto como argumento na chamada de um método ou construtor 
						   */
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product2(String nome, double price) { //Sobrecarga: recurso que uma classe possui de oferecer mais de uma									  										  
		this.nome = nome; 						 //operação com o mesmo nome, porém com diferentes listas de
		this.price = price;                      //parâmetros.
	}
	
	public Product2() { //Construtor padrão iniciado, funciona normalmente também
		
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; //
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { 
		return nome
			+ ", $"
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, total: $"
			+ String.format("%.2f", totalValueInStock());
	}
}
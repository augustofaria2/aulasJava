package entities;

public class PrivateProduct {
	/*
	 * se os atributos forem protected: o membro só pode ser acessado no mesmo pacote, 
	 * bem como em subclasses de pacotes diferentes
	 */
	
	
	private String nome; //Private só pode ser acessado na própria classe
	
	private double price; //Caso eu queira permitir alterações no price, basta fazer a mesma coisa do nome
	private int quantity; //usar métodos set e get para isso
	
	/*No quantity, se eu fosse permitir alguma alteração, seria apenas com o get, para proteger meu objeto produto 
	 *de alterações inconsistentes na sua quantidade, sendo que para alterar a quantidade, só poderá ser feito pelos métodos
	 *addProducts e removeProducts. (NÃO USANDO SET)
	 */
	
	public PrivateProduct(String nome, double price, int quantity) {
		this.nome = nome; 
		this.price = price;
		this.quantity = quantity;
	}
	
	/*É possível criar construtores, getters e setters automaticamente com Eclipse, basta ir na classe desejada,
	 *clicar com o botão direito do mouse, source, gerenerate constructors using fields/generate getters and setters.
	 */
	
	public PrivateProduct(String nome, double price) { 									  										  
		this.nome = nome; 						 
		this.price = price;                      
	}
	
	public PrivateProduct() {
		
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public String getName() {
		return nome;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; 
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

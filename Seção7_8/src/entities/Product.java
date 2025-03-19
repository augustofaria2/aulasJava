package entities; //Usando em Construtores.java

public class Product { 
	
	public String nome; //se eu não colocar nem private nem public, só pode ser acessado por classes do mesmo pacote
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; //serve para dizer que estamos falando do da classe e não o declarado no método
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { //converte o objeto para string
		return nome
			+ ", $"
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, total: $"
			+ String.format("%.2f", totalValueInStock());
	}
}
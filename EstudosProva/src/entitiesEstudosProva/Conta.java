package entitiesEstudosProva;

public class Conta {
	public double saldo;
	
	public Conta() {
		this.saldo = 0;
	}
	
	public void deposita(double valor) {
		if(valor <= 0) {
			throw new IllegalArgumentException();
		}else {
			saldo += valor;
		}
	}
}

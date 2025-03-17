package entitiesFaculdadeOO;

public class ContaEspecial extends ContaCorrente{
	private float limite;

	public ContaEspecial (float val, int num, int pwd, float limite) {
		super(val, num, pwd);
		this.limite = limite;
		verificarConta();
	}
	
	public ContaCorrente verificarConta() {
	    if (limite == 0) {
	        return new ContaComum(this.saldo, this.numConta, this.senha);
	    }
	    return this;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public int getEstado(int pwd) { //override porque ele é protected na ContaCorrente
        return super.getEstado(pwd);
    }
	
	@Override
	public void debitaValor(float val) {
		if (val > 0 && (saldo + limite) >= val) {
			saldo -=val;
		}
	}
}

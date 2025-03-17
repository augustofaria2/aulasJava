package entitiesFaculdadeOO;

public class ContaComum extends ContaCorrente {
	
	public ContaComum(float val, int num, int pwd) {
		super(val, num, pwd);
	}
	
	@Override
	public int getEstado(int pwd) { //override porque ele é protected na ContaCorrente
        return super.getEstado(pwd); 
    }
	
	@Override
	public void debitaValor(float val) {
		if(val > 0 && val <= saldo) {
			saldo -= val;
			if(saldo == 0) {
				estado = 2;
			}
		}
	}
	
	
}

package entitiesFaculdadeOO;

public abstract class ContaCorrente {
	protected float saldo;
	protected int estado; // 1 = conta ativa 2 = conta inativa
	protected int numConta;
	protected int senha;

	public ContaCorrente(float val, int num, int pwd) {
		numConta = num;
		senha = pwd;
		saldo = val;
		estado = 1; // conta ativa
	}

	public boolean debitaValor(float val, int pwd) {
		if (pwd != senha)
			return (false); // senha deve ser válida
		if (estado != 1)
			return (false); // conta deve ser ativa
		if (val <= 0)
			return (false); // val > 0
		if (val > saldo)
			return (false);
		saldo -= val;
		if (saldo == 0)
			estado = 2; // torna conta inativa
		return (true);
	}

	public void debitaValor(float val) {
		saldo -= val;
	}

	public float getSaldo(int pwd) {
		if (senha == pwd)
			return saldo;
		else
			return -1; // indicando que houve problema na senha
	}

	public void creditaValor(int pwd, float val) { //Caso saldo volte a ser acima de 0, a conta volta a ser ativa
		if (senha == pwd) {
			if(saldo == 0) {
				saldo += val;
				estado = 1;
			}else {
				saldo += val;
			}	
		}
	}

	protected int getEstado(int pwd) {
		if (senha == pwd)
			return estado;
		else
			return -1;
	}

	protected void setEstado(int pwd, int e) {
		if (senha == pwd)
			estado = e;
	}

	protected boolean isSenha(int pwd) {
		if (senha == pwd)
			return true;
		else
			return false;
	}
}

package br.com.fj.cursopoojacksonpires.composicao;

public class ContaCorrente {
	private float saldo = 0;
	private float chequeEspecial = 500;
	
	//GETTERS & SETTERS
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(float chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	//METHODS
	
	public void deposita(float valor) {
		saldo += valor;
	}
	
	public void saque(float valor) {
		if (saldo > 0) {
		saldo -= valor;
		} else {
			chequeEspecial = saldo - valor;
		}
	}
}

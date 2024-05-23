package br.com.fj.cursopoojacksonpires.composicao;

public class ContaPoupanca {
	private float saldo = 0;

	//GETTERS & SETTERS
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	//METHODS
	
	public void deposita(float valor) {
		saldo += valor;
	}

	public void saque(float valor) {
		if (saldo > 0) {
		saldo -= valor;
		} else {
			System.out.println("Não é possível sacar, saldo em conta é de R$" + saldo);
		}
	}
	
}

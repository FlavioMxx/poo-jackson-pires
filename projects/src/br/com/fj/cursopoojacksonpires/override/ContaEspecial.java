package br.com.fj.cursopoojacksonpires.override;

public class ContaEspecial extends ContaBancaria {
	private float limite;
	
	public ContaEspecial(String cliente, int numConta, float saldo, float limite) {
		super(cliente, numConta, saldo);
		this.limite = 250;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public void sacar(float valor) {
		if(this.getSaldo() > 0 && this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
		} else {
			if(valor <= limite) {
				limite = this.getSaldo() + limite - valor;
				this.setSaldo(this.getSaldo() - valor);
			} else {
				System.out.println("Não é possível efetuar o saque, limite da conta é R$" + limite);
			}
			
		}
	}
}
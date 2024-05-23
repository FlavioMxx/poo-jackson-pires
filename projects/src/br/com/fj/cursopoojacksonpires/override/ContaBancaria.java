package br.com.fj.cursopoojacksonpires.override;

public class ContaBancaria {
	private String cliente;
	private int numConta;
	private float saldo;
	
	public ContaBancaria(String cliente, int numConta, float saldo) {
		this.cliente = cliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(float valor) {
		if(saldo > 0 && saldo >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Não é possível efetuar o saque, saldo da conta é R$" + saldo);
		}
	}
	
	public void depositar(float valor) {
		saldo += valor;
	}
	
	public void mostrarDadosDaConta() {
		System.out.println("Cliente: " + cliente + " | Conta : " + numConta + " | Saldo: " + saldo );
	}
}

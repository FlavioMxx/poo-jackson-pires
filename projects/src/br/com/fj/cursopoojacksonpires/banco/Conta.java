package br.com.fj.cursopoojacksonpires.banco;

public class Conta {
	
	private String numero;
	private float saldo;
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void creditar(float valor) {
		saldo = saldo - valor;
	}
	
	public void debitar(float valor) {
		saldo = saldo + valor;
	}
	
	public Conta(String numeroConta, float saldoInicial) {
		numero = numeroConta;
		saldo = saldoInicial;
	}
	
	public static void main(String[] args) {
		
		Conta contas[] = new Conta[100];
		
		contas[0] = new Conta("1111-1", 100);
		contas[0].creditar(50);
		
		contas[1] = new Conta("1222-5", 100);
		contas[1].debitar(100);
		
		contas[2] = new Conta("1333-5", 100);
		contas[2].debitar(1000);
		
		contas[3] = new Conta("1444-5", 100);
		contas[3].creditar(800);

		
		UtilitarioConta uContas = new UtilitarioConta();
		
		uContas.imprimirContas(contas);
		uContas.somarSaldos(contas);
		
//		System.out.println("Número da conta: " + contas[0].numero +
//				  "\nSaldo da conta é R$ " + String.format("%.2f", contas[0].saldo));
//		
//		System.out.println("=====================");
//		
//		System.out.println("Número da conta: " + contas[1].numero +
//				  "\nSaldo da conta é R$ " + String.format("%.2f",contas[1].saldo));

//		
//		  Conta fObj = new Conta("3210-5", 234); fObj.creditar(50);
//		  System.out.println("Número da conta: " + fObj.numero +
//		  "\nSaldo da conta é R$ " + String.format("%.2f", fObj.saldo));
//		  
//		  System.out.println("=====================");
//		  
//		  Conta sObj = new Conta("1122-5", 760); sObj.creditar(100);
//		  System.out.println("Número da conta: " + sObj.numero +
//		  "\nSaldo da conta é R$ " + String.format("%.2f", sObj.saldo));
		 
	}
	
}

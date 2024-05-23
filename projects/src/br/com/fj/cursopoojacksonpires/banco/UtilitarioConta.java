package br.com.fj.cursopoojacksonpires.banco;


public class UtilitarioConta {
	
	public void imprimirContas(Conta contas[]) {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				System.out.println("Conta: " + contas[i].getNumero());
			}
		}
	}
	
	public void somarSaldos(Conta contas[]) {
		float somaSaldo = 0;
		
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				somaSaldo = somaSaldo + contas[i].getSaldo();
			}
		}
		System.out.println("Saldo de todas as contas é R$" + somaSaldo);
	}
	
}

package br.com.fj.cursopoojacksonpires.composicao;

public class Banco {
	private ContaCorrente cc[];
	private ContaPoupanca cp[];
	int nCc, nCp;
	
	//METHODS;
	
	public void iniciaBanco() {
		System.out.println("BANCO INICIADO!!!");
		cc = new ContaCorrente[100];
		cp = new ContaPoupanca[100];
		nCc = 0;
		nCp = 0;
	}
	
	public void abreContaC() {
		cc[nCc] = new ContaCorrente();
		nCc++;
	}
	
	public void abreContaP() {
		cp[nCp] = new ContaPoupanca();
		nCp++;
	}
	
	void falencia() {
		for (int i = 0; i < 100; i++) {
			cc[i] = null;
			cp[i] = null;
		}
	}
	
	public static void main(String[] args) {
		
		
	}
}

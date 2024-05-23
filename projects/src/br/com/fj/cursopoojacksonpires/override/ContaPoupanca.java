package br.com.fj.cursopoojacksonpires.override;

public class ContaPoupanca extends ContaBancaria {
	private int diaDeRendimento;
	
	public ContaPoupanca(String cliente, int numConta, float saldo, int diaDeRendimento) {
		super(cliente, numConta, saldo);
		this.diaDeRendimento = diaDeRendimento;
		
	}

	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}

	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}
	
	public void calcularNovoSaldoDaConta(float taxa) {
		
		if(this.diaDeRendimento > 10 && this.diaDeRendimento <= 15) { 
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxa) / 100);
		} else {
			System.out.println("Os dias de rendimento são 11, 12, 13, 14 e 15 de todos os meses");
		}
	
	}
	
}

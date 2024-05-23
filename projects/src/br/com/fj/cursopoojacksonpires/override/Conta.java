package br.com.fj.cursopoojacksonpires.override;

public class Conta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaPoupanca cp = new ContaPoupanca("Josefino", 110112, 0f, 11);
		ContaEspecial ce = new ContaEspecial("Flavio", 118292, 100f, 250);
		
		System.out.println("Conta Poupanca");
		cp.mostrarDadosDaConta();
		cp.sacar(50);
		cp.mostrarDadosDaConta();
		cp.depositar(100);
		cp.calcularNovoSaldoDaConta(5);
		cp.mostrarDadosDaConta();
		
		System.out.println("=======================");
		
		System.out.println("Conta Especial");
		ce.mostrarDadosDaConta();
		ce.sacar(200);
		ce.mostrarDadosDaConta();
		ce.sacar(200);
		ce.mostrarDadosDaConta();
		ce.depositar(150);
		ce.mostrarDadosDaConta();
		
	}

}
